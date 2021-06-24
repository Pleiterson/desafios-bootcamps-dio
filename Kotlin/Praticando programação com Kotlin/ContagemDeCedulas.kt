// Contagem de Cédulas

/*
Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas
possíveis (cédulas) onde o valor pode ser decomposto. As notas que você deve
considerar são de 100, 50, 20, 10, 5, 2 e 1. Na sequência mostre o valor lido
e a relação de notas necessárias.

- Entrada

Você receberá um valor inteiro N (0 < N < 1000000).

- Saída

Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias,
seguindo o exemplo de saída abaixo. Após cada linha deve ser imprimido o fim
de linha.
*/

import java.util.Scanner

fun main() {
  val valor = readLine()!!.toInt()
  
  numbers(valor)
}

val numbers:(Int) -> Unit = {valor ->
  val ntcem = mutableListOf<Int>()
  val ntcinq = mutableListOf<Int>()
  val ntvinte = mutableListOf<Int>()
  val ntdez = mutableListOf<Int>()
  val ntcinco = mutableListOf<Int>()
  val ntdois = mutableListOf<Int>()
  val ntum = mutableListOf<Int>()
  var qct : Int
  var total = valor
  var rest = total % 100

  qct = (total - rest) / 100
  ntcem.add(qct)

  total = rest
  rest %= 50
  qct = (total - rest) / 50
  ntcinq.add(qct)

  total = rest
  rest = total % 20
  qct = (total - rest) / 20
  ntvinte.add(qct)

  total = rest
  rest = total % 10
  qct = (total - rest) / 10
  ntdez.add(qct)

  total = rest
  rest = total % 5
  qct = (total - rest) / 5
  ntcinco.add(qct)

  total = rest
  rest = total % 2
  qct = (total - rest) / 2
  ntdois.add(qct)

  total = rest
  rest = total % 1
  qct = (total - rest) / 1
  ntum.add(qct)

  println("$valor")
  println("${ntcem[0]} nota(s) de R$ 100,00")
  println("${ntcinq[0]} nota(s) de R$ 50,00")
  println("${ntvinte[0]} nota(s) de R$ 20,00")
  println("${ntdez[0]} nota(s) de R$ 10,00")
  println("${ntcinco[0]} nota(s) de R$ 5,00")
  println("${ntdois[0]} nota(s) de R$ 2,00")
  println("${ntum[0]} nota(s) de R$ 1,00")
}