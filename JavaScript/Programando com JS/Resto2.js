// Resto 2

/*
Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos
por N dão resto igual a 2.

- Entrada

A entrada contém um valor inteiro N (N < 10000).

- Saída

Imprima todos valores que quando divididos por N dão resto = 2, um por linha.
*/

let lines = gets().split('\n');
let N = parseInt(lines.shift());

for (let i = 1; i < 10000; i++) {
	if (i % N == 2)
	
	console.log(i);
}
