// Teste de Seleção 1

/*
Leia 4 valores inteiros A, B, C e D. Com base nisso, se o valor de B for maior do
que de C e se D for maior do que A, e a soma de C com D for maior que a soma de A e
B e se tanto C quanto D forem positivos e, ainda, se a variável A for par, escreva
a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

- Entrada

Quatro números inteiros A, B, C e D.

- Saída

Imprima a mensagem corretamente esperada pela validação dos valores.
*/

x = gets().split(" ");
a = parseInt(x[0]);
b = parseInt(x[1]);
c = parseInt(x[2]);
d = parseInt(x[3]);

if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 == 0) {
  print("Valores aceitos");
} else {
  print("Valores nao aceitos");
}
