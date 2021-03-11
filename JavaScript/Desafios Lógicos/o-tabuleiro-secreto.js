// O tabuleiro secreto

/* O senhor Milli, morador da cidade Petland, é o famoso proprietário da maior
fábrica de jogos de tabuleiros do mundo. 

Recentemente, ele teve a ideia de lançar um novo jogo exclusivo de tabuleiro,
que ele apelidou de Tabuleiro da Frequência.

O jogo ocorre da seguinte forma. Inicialmente, um tabuleiro com dimensões
N × N é dado contendo apenas 0’s. Depois disso, Q operações são propostas,
podendo ser de 4 tipos:

•	1 X R: Atribuir o valor R a todos os números da linha X;
•	2 X R: Atribuir o valor R a todos os números da coluna X;
•	3 X: Imprimir o valor mais frequente na linha X;
•	4 X: Imprimir o valor mais frequente da coluna X.

Milli não é muito bom com computadores, mas é bastante preguiçoso. Sabendo que
você é um dos melhores programadores do mundo, ele precisa sua ajuda para
resolver este problema.

- Entrada

A primeira linha da entrada é composta por dois inteiros N e Q (1 ≤ N, Q ≤ 105),
representando, respectivamente, o tamanho do tabuleiro e a quantidade de
operações. As próximas Q linhas da entrada vão conter as Q operações. O
primeiro inteiro de cada linha vai indicar o tipo da operação. Caso seja
1 ou 2, será seguido por mais dois inteiros X (1 ≤ X ≤ N) e R (0 ≤ R ≤ 50).
Caso seja 3 ou 4, será seguido por apenas mais um inteiro X.

- Saída

Para cada operação do tipo 3 ou 4, seu programa deve produzir uma linha,
contendo o valor da resposta correspondente. Se uma linha ou coluna tiver dois
ou mais valores que se repetem o mesmo número de vezes, você deve imprimir o
maior deles. Por exemplo, se uma linha tem os valores [5,7,7,2,5,2,1,3], tanto
o 2, 5 e 7 se repetem duas vezes, então a resposta será 7, pois é o maior
deles. */

let input;
const limit = Math.pow(10, 5);
let T, X, R;
var output = '';

const operation = {
  '1': function fillLine(matrix, line, num) {
    for (let index = 0; index < matrix.length; index++) {
      matrix[line - 1][index] = num;
    }
  },
  '2': function fillColumn(matrix, col, num) {
    for (let index = 0; index < matrix.length; index++) {
      matrix[index][col - 1] = num;
    }
  },
  '3': function showMostFrequentAtLine(matrix, line) {
    const lineValues = matrix[line - 1]

    output += getMostFrequentIn(lineValues) + '\n'
  },
  '4': function showMostFrequentAtColumn(matrix, col) {
    const columnValues = matrix.map(line => line[col - 1])

    output += getMostFrequentIn(columnValues) + '\n'
  }
}

const getMostFrequentIn = (values) => {
  let n = values.length;

  if (n == 0) return null;
  let map = {}, most = values[0], freqCount = 1;

  for (let i = 0; i < n; i++) {
    let el = values[i];

    if (map[el] == null)
      map[el] = 1;
    else
      map[el]++;

    if (map[el] > freqCount) {
      most = el;
      freqCount = map[el];
    } else if (map[el] === freqCount) {
      most = Math.max(most, el)
    }
  }
  return most;
}

while (true) {
  input = gets()

  if (!input || input === '') break;

  let [N, Q] = input.match(/\d+/g);
  N = parseInt(N);
  Q = parseInt(Q);

  if (N < 1 || N > limit || Q < 1 || N > limit) break;

  let matrix = Array.from(Array(parseInt(N)), () => new Array(parseInt(N)).fill(0));

  for (let index = 0; index < Q; index++) {
    let [T, X, R] = gets().split(/[ ]+/g)
    X = parseInt(X)
    R = parseInt(R)

    if (/[12]/.test(T)) {
      if (X < 1 || X > N || R < 0 || R > 50) {
        continue;
      }
    }

    if (/[34]/.test(T)) {
      if (X > N || X < 0) {
        continue;
      }
    }
    operation[T](matrix, X, R);
  }
  console.log(output);
}
