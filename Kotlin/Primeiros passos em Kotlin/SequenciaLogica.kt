// Sequência Lógica

/*
Desenvolva um programa capaz de ler um valor inteiro N. N * 2 linhas de saída
vão ser apresentadas na execução do programa, seguindo a lógica do exemplo mais
abaixo. Para os valores com mais de seis dígitos, todos os dígitos devem ser
apresentados.

•	Entrada

O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

•	Saída

Imprima a saída conforme o exemplo fornecido.
*/

import kotlin.math.pow

fun main() {
  val n = 1..(readLine() ?: return).toInt()
  
  n.forEach {n1->
    val n2 = (n1.toDouble().pow(2)).toInt()
    val n3 = (n1.toDouble().pow(3)).toInt()
    println("$n1 $n2 $n3")
    println("$n1 ${n2+1} ${n3+1}")
  }
}