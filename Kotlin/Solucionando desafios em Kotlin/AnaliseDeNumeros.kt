// Análise de Números

/*
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos
valores informados são pares, quantos valores informados são ímpares, quantos
valores informados são positivos e quantos valores informados são negativos.

- Entrada

Você receberá 5 valores inteiros.

- Saída

Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por
linha e não esquecendo o final de linha após cada uma.
*/

fun main(args: Array<String>) {
  val inteiros = mutableListOf<Int>()
  var positivos = mutableListOf<Int>()
  var negativos = mutableListOf<Int>()
  var pares = mutableListOf<Int>()
  var impares = mutableListOf<Int>()
  
  for (i in 1..5) {inteiros.add(readLine()!!.toInt())}
    inteiros.forEach {if (it % 2 == 0) {pares.add(it)}}
    inteiros.forEach {if (it % 2 != 0) {impares.add(it)}}
    inteiros.forEach {if (it > 0) {positivos.add(it)}}
    inteiros.forEach {if (it < 0) {negativos.add(it)}}

  println("${pares.size} valor(es) par(es)")
  println("${impares.size} valor(es) impar(es)")
  println("${positivos.size} valor(es) positivo(s)")
  println("${negativos.size} valor(es) negativo(s)")
}