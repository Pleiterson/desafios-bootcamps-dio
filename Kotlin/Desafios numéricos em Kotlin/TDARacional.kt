// TDA Racional

/*
A tarefa aqui neste problema é ler uma expressão matemática na forma de dois
números Racionais (numerador / denominador) e apresentar o resultado da
operação. Cada operando ou operador é separado por um espaço em branco. A
sequência de cada linha que contém a expressão a ser lida é: número, caractere,
número, caractere, número, caractere, número. A resposta deverá ser
apresentada e posteriormente simplificada. Deverá então ser apresentado o
sinal de igualdade e em seguida a resposta simplificada. No caso de não ser
possível uma simplificação, deve ser apresentada a mesma resposta após o sinal
de igualdade.
Considerando N1 e D1 como numerador e denominador da primeira fração, segue a
orientação de como deverá ser realizada cada uma das operações:

Soma: (N1*D2 + N2*D1) / (D1*D2)
Subtração: (N1*D2 - N2*D1) / (D1*D2)
Multiplicação: (N1*N2) / (D1*D2)
Divisão: (N1/D1) / (N2/D2), ou seja (N1*D2)/(N2*D1)

•	Entrada

A entrada contém vários casos de teste. A primeira linha de cada caso de teste
contém um inteiro N (1 ≤ N ≤ 1*104), indicando a quantidade de casos de teste
que devem ser lidos logo a seguir. Cada caso de teste contém um valor racional
X (1 ≤ X ≤ 1000), uma operação (-, +, * ou /) e outro valor racional Y
(1 ≤ Y ≤ 1000).

•	Saída

A saída consiste em um valor racional, seguido de um sinal de igualdade e
outro valor racional, que é a simplificação do primeiro valor. No caso do
primeiro valor não poder ser simplificado, o mesmo deve ser repetido após o
sinal de igualdade.
*/

import java.util.Scanner

fun maximoDivisorComum(a: Int, b: Int): Int {
  return if (b == 0) a else maximoDivisorComum(b, a % b)
}

fun main() {
  val lista = mutableListOf<String>()
  val scan = Scanner(System.`in`)
  var n1: Int
  var d1: Int
  var n2: Int
  var d2: Int
  var nf: Int
  var df: Int
  var aux: String
  var mdc:Int
  val n: Int = scan.nextInt()
  
  for (i in 1..n) {
    n1 = scan.nextInt()
    scan.next()
    d1 = scan.nextInt()
    aux = scan.next()
    n2 = scan.nextInt()
    scan.next()
    d2 = scan.nextInt()
    
    when (aux) {
      "+" -> {
        nf = (n1 * d2) + (n2 * d1)
        df = d1 * d2
        mdc = maximoDivisorComum(nf, df)
        
        if (mdc < 0){
          mdc *= -1
        }
        lista.add("$nf/$df = ${nf/mdc}/${df/mdc}")
      }
      "-" -> {
        nf = (n1 * d2) - (n2 * d1)
        df = d1 * d2
        mdc = maximoDivisorComum(nf, df)
        
        if (mdc < 0){
            mdc *= -1
        }
        lista.add("$nf/$df = ${nf/mdc}/${df/mdc}")
      }
      "*" -> {
        nf = n1 * n2
        df = d1 * d2
        mdc = maximoDivisorComum(nf, df)
        
        if (mdc < 0){
          mdc *= -1
        }
        lista.add("$nf/$df = ${nf/mdc}/${df/mdc}")
      }
      "/" -> {
        nf = n1 * d2
        df = d1 * n2
        mdc = maximoDivisorComum(nf, df)
        
        if (mdc < 0){
          mdc *= -1
        }
        lista.add("$nf/$df = ${nf/mdc}/${df/mdc}")
      }
    }
  }

  lista.forEach {
    println(it)
  }
}