// Exibindo Números Pares

/* Crie um programa que leia um número e mostre os números pares até esse
número, inclusive ele mesmo.

- Entrada

Você receberá 1 valor inteiro N, onde N > 0.

- Saída

Exiba todos os números pares até o valor de entrada, sendo um em cada linha. */

let numero = gets();
let par = 2;

while (par <= numero) {
  console.log(par);
  par = par + 2;
}
