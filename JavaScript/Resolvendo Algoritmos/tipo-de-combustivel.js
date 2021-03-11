// Tipo de Combustível

/* Você recebeu desafio para determinar qual dos produtos é o preferêncial dos
clientes de um posto de abastecimento de combustível. Para isso você deve
escrever um algoritmo para ler o tipo de combustível abastecido (codificado
  da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário
  informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um
  novo código (até que seja válido). O programa será encerrado quando o código
  informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que
abasteceram cada tipo de combustível, conforme exemplo. */

let alcool = 0;
let gasolina = 0;
let diesel = 0;
let X = 0;

while (X !== 4) {
   X = parseInt(gets());
  if (X === 1) {
    alcool++;
  } else if (X === 2) {
    gasolina++;
  } else if (X === 3) {
    diesel++;
  }  
}

console.log("MUITO OBRIGADO");
console.log("Alcool: " + alcool);
console.log("Gasolina: " + gasolina);
console.log("Diesel: " + diesel);