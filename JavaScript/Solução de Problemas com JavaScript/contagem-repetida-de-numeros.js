// Contagem repetida de números

/* Neste desafio sua tarefa será ler vários números e em seguida dizer quantas
vezes cada número aparece, ou seja, deve-se escrever cada um dos valores
distintos que aparecem na entrada por ordem crescente de valor.

- Entrada

A primeira linha de entrada contem um único inteiro N, que indica a quantidade
de valores que serão lidos para X (1 ≤ N ≤ 2000) logo em seguida. Com certeza
cada número não aparecerá mais do que 20 vezes na entrada de dados.

- Saída

Imprima a saída de acordo com o exemplo fornecido abaixo, indicando quantas
vezes cada um deles aparece na entrada por ordem crescente de valor. */

const nCases = parseInt(gets());
let input = 0
let numbers = []

for (let i = 1; i <= nCases; i++) {
  input = parseInt(gets());

  if ((input < 1 || input > 2000)) {
    continue;
  }
  
  numbers = [...numbers, input];
}

const distinctNumbers = Array.from(new Set(numbers))
  .sort((a, b) => a - b)
  .map(v => ([v, 0]))

let countNumberMap = new Map(distinctNumbers)

numbers.forEach(n => {
  countNumberMap.set(n, countNumberMap.get(n) + 1)
})

for (const [number, times] of countNumberMap) {
  console.log(`${number} aparece ${times} vez(es)`)
}