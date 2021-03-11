// Multiplicação Simples

/* Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o
produto entre estes dois valores. Atribua esta operação à variável PROD,
mostrando está de acordo com a mensagem de saída esperada (exemplo abaixo).

- Entrada

A entrada contém 2 valores inteiros.

- Saída

Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um
espaço em branco antes e depois da igualdade. */

let valor1 = parseInt(gets());
let valor2 = parseInt(gets());

let total = 0;
total = valor1 * valor2;

console.log("PROD = " + total);
