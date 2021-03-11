// Soma Simples

/* Leia dois valores inteiros identificados como variáveis A e B. Calcule a
soma entre elas e chame essa variável de SOMA.
A seguir escreva o valor desta variável.

- Entrada

O arquivo de entrada contém 2 valores inteiros.

- Saída

Imprima a variável SOMA com todas as letras maiúsculas, inserindo um espaço
em branco antes e depois do símbolo de igualdade, seguido pelo valor
correspondente à soma de A e B. */

var A = parseInt(gets());
var B = parseInt(gets());

let soma = (A + B);

console.log("SOMA = " + soma);