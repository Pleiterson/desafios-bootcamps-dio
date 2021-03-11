// Encontre a maior substring

/* Encontre a maior substring comum entre as duas strings informadas. A
substring pode ser qualquer parte da string, inclusive ela toda. Se não houver
subsequência comum, a saída deve ser “0”. A comparação é case sensitive
('x' != 'X').

- Entrada

A entrada contém vários casos de teste. Cada caso de teste é composto por duas
linhas, cada uma contendo uma string. Ambas strings de entrada contém entre 1
e 50 caracteres ('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma
letra ('A'-'Z','a'-'z').

- Saída

O tamanho da maior subsequência comum entre as duas Strings. */

let string1 = gets();
let string2 = gets();

while (string1 !== "") {
  if (string1.length >= string2.length) {
    countChar(string2, string1);
  } else {
    countChar(string1, string2);
  }
  string1 = gets();
  string2 = gets();
}

function countChar(menorString, maiorString) {
  let count = 0;

  for (let i = 0; i <= maiorString.length; i++) {
    for (let j = 0; j < maiorString.length; j++) {
      let subString = maiorString.substring(i, j);
      
      if (menorString.includes(subString) && subString.length > count) {
        count = subString.length;
      }
    }
  }
  console.log(count);
}
