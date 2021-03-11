// Conjuntos bons ou ruins?

/* Nesse algoritmo você deverá descobrir se um conjunto de palavras é bom ou
ruim. Por definição, um conjunto é bom quando nenhuma palavra desse conjunto
é um prefixo de outra palavra. Caso contrário, é considerado um conjunto ruim.

Por exemplo, {dbc, dae, dbcde} é um conjunto ruim, pois dbc é um prefixo de
dbcde. Quando duas palavras são idênticas, definimos como uma sendo prefixo da
outra.

- Entrada

A entrada contém vários casos de teste. A primeira linha de cada caso de teste
terá um inteiro N (1 ≤ N ≤ 10⁵), que representa a quantidade de palavras no
conjunto. Segue então N linhas, cada uma tendo uma palavra de no máximo 100
letras minúsculas. A entrada termina quando N = 0 e não deve ser processada.

- Saída

Para cada caso de teste, você deverá imprimir "Conjunto Bom", ou "Conjunto
Ruim", conforme explicado acima. */

let N;
const limit = Math.pow(10, 5);
let words, isBad;

while (true) {
  words = []
  N = parseInt(gets())
  
  if (N === 0 || (N < 1 || N > limit)) break;

  for (let index = 0; index < N; index++) {
    word = gets()
    if (!(/^[a-z]{1,100}$/g.test(word))) continue;

    words = [...words, word]
  }

  isBad = words.some((currentWord, i, words) => {
    const pattern = new RegExp(`^(${currentWord}).+`)

    for (const word of words) {
      if (pattern.test(word)) return true
    }

    const same = words.reduce((total, w) => {
      total += w === currentWord ? 1 : 0
      return total
    }, 0)

    return same > 1;
  })
  console.log(isBad ? 'Conjunto Ruim' : 'Conjunto Bom');
}