// Teorema da Divisão Euclidiana

/* Você recebeu desafio de desenvolver um programa que calcule o quociente e o
resto da divisão de dois números inteiros. Não se esqueça que o quociente e o
resto da divisão de um inteiro a por um inteiro não-nulo b são respectivamente
os únicos inteiros q e r tais que:

0 ≤ r < |b|
Se r < 0: r = r - |b|
a = b × q + r
q = ( a - r ) / b

Caso você não saiba, o teorema que garante a existência e a unicidade dos
inteiros q e r é conhecido como ‘Teorema da Divisão Euclidiana’ ou ‘Algoritmo
da Divisão’.
**  |b| (Módulo / Valor absoluto): É o valor representado de forma positiva;

- Entrada

A entrada é composta por dois números inteiros a e b (-1.000 ≤ a, b < 1.000).

- Saída

Imprima o quociente q seguido pelo resto r da divisão de a por b, considerando
as regras apresentadas a cima. */

let numbers = gets('-7 -3').split(" ");
let a = parseInt(numbers[0]);
let b = parseInt(numbers[1]);

let r = a % b < 0 ? Math.abs(b) + a % b : a % b;
let q = (a - r) / b

console.log(q, r);
