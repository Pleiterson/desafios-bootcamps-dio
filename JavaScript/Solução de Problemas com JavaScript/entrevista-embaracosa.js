// Entrevista embaraçosa

/* A nutricionista Juliana Alcantra é uma excelente profissional de sua área.
Em determinado dia, ela foi entrevistada ao vivo para um jornal da cidade. No
entanto, ficou um pouco nervosa na hora, e diante da situação, sua fala ficou
um pouco distorcida, repetindo o final de cada palavra após dizer a mesma. Para
que isso não aconteça novamente, ela precisa da sua ajuda para escrever um
programa que omita a parte repetida, de modo que as palavras sejam pronunciadas
como deveriam ser.

Escreva um programa que, dada uma palavra errada, a mesma seja corrigida.

- Entrada

Haverá diversos casos de teste. Cada caso de teste é formado por uma palavra,
de, no máximo, 30 caracteres, dita da forma errada. A entrada termina com fim
de arquivo.

- Saída

Para cada caso de teste, escreva a palavra devidamente corrigida. Analise os
exemplos para verificar o padrão, de modo a consertar todos os casos. */

let input = '';
let results;
let limit = 0;

while (true) {
  input = gets()

  if (!input || input === '' || input.length > 30) break;

  limit = -Math.floor(input.length / 2)
  results = []

  for (let index = -1; index >= limit; index--) {
    input.slice(index) === input.slice(index * 2, index) && results.push(input.slice(0, index))
  }

  if (!results || results.length === 0) {
    console.log(input)
    continue;
  }

  for (const result of results.sort()) {
    console.log(result)
  }
}