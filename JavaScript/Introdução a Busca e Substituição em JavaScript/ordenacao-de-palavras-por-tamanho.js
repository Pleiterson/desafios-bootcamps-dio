// Ordenação de palavras por tamanho

/* Crie um algoritmo para ordenar um conjunto de palavras pelo seu tamanho. Seu
programa deve receber um conjunto de palavras e retornar este mesmo conjunto
ordenado pelo tamanho das palavras decrescente, se o tamanho das palavras for
igual, deve-se ordernar por ordem alfabética.

- Entrada

A primeira linha da entrada possui um único inteiro N, que indica o número de
casos de teste. Cada caso de teste poderá conter de 1 a 50 palavras inclusive,
e cada uma das palavras poderá conter entre 1 e 50 caracteres inclusive. Os
caracteres poderão ser espaços, letras, ou números.

- Saída

A saída deve conter o conjunto de palavras da entrada ordenado pelo tamanho das
palavras e caso o tamanho das palavras for igual, deve-se ordernar por ordem
alfabética.. Um espaço em branco deve ser impresso entre duas palavras. */

let size = gets();
let line = "";
let worlds = [];
let newLine = "";

if (size <= 50) {
  for (i = 0; i < size; i++) {
    line = gets();
    words = line.split(" ");
    words.sort((a, b) => b.length - a.length || a.localeCompare(b));
    newLine = words.join(" ");
    console.log(newLine);
  }
}