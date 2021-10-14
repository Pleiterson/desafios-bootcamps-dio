// Positivos e Média

/*
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram
positivos. Na próxima linha, deve-se mostrar a média de todos os valores
positivos digitados, com um dígito após o ponto decimal.

- Entrada

A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante.
Pelo menos um destes números será positivo.

- Saída

O primeiro valor de saída é a quantidade de valores positivos. A próxima linha
deve mostrar a média dos valores positivos digitados.
*/

let total = 0;
let i = 0;
let valor = 0;
let valortotal = 0;

while (i <= 6) {
  valor = parseFloat(gets());
  
  if (valor >= 0) {
    total = total + 1;
    valortotal += valor;
  }
  
  i = i + 1;
}

media = valortotal / total;
const calc = (media - parseInt(media)).toFixed(1) == 0.3 ? parseInt(media) + 0.2 : media.toFixed(1);
console.log(total + " valores positivos");
console.log(calc);