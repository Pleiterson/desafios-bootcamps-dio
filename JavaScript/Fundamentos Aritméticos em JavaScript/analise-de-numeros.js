// Análise de Números

/* Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos
valores informados são pares, quantos valores informados são ímpares, quantos
valores informados são positivos e quantos valores informados são negativos.

- Entrada

Você receberá 5 valores inteiros.

- Saída

Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por
linha e não esquecendo o final de linha após cada uma. */

let a = parseInt(gets());
let b = parseInt(gets());
let c = parseInt(gets());
let d = parseInt(gets());
let e = parseInt(gets());
let valores = [a, b, c, d, e];
let pares = 0;
let impares = 0;

for (valor of valores) {
  if (valor % 2 == 0) {
    pares++;
   } else {
    impares++;
  }
}

let positivos = valores.filter(valor => valor > 0).length;
let negativos = valores.filter(valor => valor < 0).length;

console.log(pares + " valor(es) par(es)");
console.log(impares + " valor(es) impar(es)");
console.log(positivos + " valor(es) positivo(s)");
console.log(negativos + " valor(es) negativo(s)");
