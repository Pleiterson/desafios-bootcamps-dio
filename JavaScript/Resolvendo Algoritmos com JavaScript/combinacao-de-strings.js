// Combinação de strings

/* Crie um algoritmo que receba dois inputs que sejam strings e combine-as
alternando as letras de cada string. 

Deve começar pela primeira letra da primeira string, seguido pela primeira
letra da segunda string, em seguida pela segunda letra da primeira string e
continuar dessa forma sucessivamente.

As letras restantes da cadeia mais longa devem ser adicionadas ao fim da
string resultante e retornada.

- Entrada

A entrada contém vários casos de teste. A primeira linha contém um inteiro N
que indica a quantidade de casos de teste que vem a seguir. Cada caso de teste
é composto por uma linha que contém duas cadeias de caracteres, cada cadeia de
caracteres contém entre 1 e 50 caracteres inclusive.

- Saída

Combine as duas cadeias de caracteres da entrada como mostrado no exemplo
abaixo e exiba a cadeia resultante. */

const nCases = parseInt(gets());
let output;

for (let i = 1; i <= nCases; i++) {
  output = '';
  [strA, strB] = gets().split(' ');

  const smallestLength = Math.min(strA.length, strB.length);

  for (let j = 0; j < smallestLength; j++) output += `${strA[j]}${strB[j]}`;

  output += strA.length > strB.length
    ? strA.substring(smallestLength)
    : strB.substring(smallestLength);

  console.log(output);
}