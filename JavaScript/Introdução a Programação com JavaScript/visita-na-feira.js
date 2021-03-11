// Visita na Feira

/* Você está na feira com a sua sacola e parou em uma balança. O feirante lhe
entregou pimentões amarelos e vermelhos. Agora iremos somar os pimentões
amarelos e vermelhos para descobrir o total de pimentões na sacola. Você
receberá 2 inteiros que devem ser lidos e armazenados nas variáveis A
(pimentões amarelos) e B (pimentões vermelhos). Faça a soma de A e B
atribuindo o seu resultado na variável X (total de pimentões). Apresente X
como descrito na mensagem de exemplo abaixo. Não apresente outra mensagem
além da mensagem especificada.

- Entrada

A entrada contém 2 valores inteiros, separados por um espaço.

- Saída

Imprimir a mensagem "X = " (sendo a letra X maiúscula) seguido pelo valor
da variável X e pelo final de linha. Assegure que exista um espaço antes e
depois do sinal de igualdade. */

let line = gets().split(" ");
let A = parseInt(line[0]);
let B = parseInt(line[1]);

let total = 0;
total = A + B;

console.log("X = " + total);
