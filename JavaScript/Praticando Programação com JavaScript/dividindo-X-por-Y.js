// Dividindo X por Y

/* Você terá o desafio de escrever um algoritmo que leia 2 números e imprima
o resultado da divisão do primeiro pelo segundo. Caso não for possível mostre
a mensagem “divisao impossivel” para os valores em questão.

- Entrada

A entrada contém um número inteiro N. Este N será a quantidade de pares de
valores inteiros (X e Y) que serão lidos em seguida.

- Saída

Para cada caso mostre o resultado da divisão com um dígito após o ponto
decimal, ou “divisao impossivel” caso não seja possível efetuar o cálculo.
*/

let limit = parseInt(gets());

for (let i = 0; i < limit; i++) {
    let line = gets().split(" ");
    let X = parseInt(line[0]);
    let Y = parseInt(line[1]);

    if (Y == 0) {
        console.log("divisao impossivel");
    } else {
        let divisao = parseFloat(X / Y).toFixed(1);
        
        console.log(divisao);
    }
}
