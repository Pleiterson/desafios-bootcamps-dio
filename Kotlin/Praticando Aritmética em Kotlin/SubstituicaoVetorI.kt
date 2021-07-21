// Substituição em Vetor I

/*
Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores
nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.

•	Entrada
A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.

•	Saída

Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e
x é o valor armazenado naquela posição.
*/

fun main(args: Array<String>) {
  val list = IntArray(10) {readLine()!!.toInt()}
  
  for (x in list.indices) {
    if (list[x] <=0) list[x] = 1
  }
  
  for (i in list.indices) println("X[$i] = ${list[i]}")
}