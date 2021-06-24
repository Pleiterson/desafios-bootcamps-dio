// Fibonacci Fácil

/*
A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série
de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à
soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e
mostre os N primeiros números dessa série.

- Entrada

O arquivo de entrada contém um valor inteiro N (0 < N < 46).

- Saída

Os valores devem ser mostrados na mesma linha, separados por um espaço em
branco. Não deve haver espaço após o último valor.
*/

fun main(args: Array<String>) {
  val n = readLine()!!.toInt()
  fibo(n)
}

val fibo:(Int) -> Unit = { numero->
  var a = 1
  var b = 0
  var soma: Int
  val lista:MutableList<String> = mutableListOf("0")
  lista.add(" ")

  for (i in 0 until numero-1){
    lista.add(a.toString())
    lista.add(" ")

    soma = a
    a += b
    b = soma
  }
  lista.forEach { numeros-> print(numeros) }
}