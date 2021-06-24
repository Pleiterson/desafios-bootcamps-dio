// Teste de Seleção 1

/*
Leia 4 valores inteiros A, B, C e D. Com base nisso, se o valor de B for maior
do que de C e se D for maior do que A, e a soma de C com D for maior que a soma
de A e B e se tanto C quanto D forem positivos e, ainda, se a variável A for
par, escreva a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

- Entrada

Quatro números inteiros A, B, C e D.

- Saída

Imprima a mensagem corretamente esperada pela validação dos valores.
*/

fun main(args: Array<String>) {
  val input = readLine()!!
  val a = input.split(" ")[0].toInt()
  val b = input.split(" ")[1].toInt()
  val c = input.split(" ")[2].toInt()
  val d = input.split(" ")[3].toInt()

  if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 ==0) {
    println("Valores aceitos")
  } else {
    println("Valores nao aceitos")
  }
}