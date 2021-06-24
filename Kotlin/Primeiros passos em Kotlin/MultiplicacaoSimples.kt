// Multiplicação Simples

/*
Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o
produto entre estes dois valores. Atribua esta operação à variável PROD,
mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).   

- Entrada

A entrada contém 2 valores inteiros.

- Saída

Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço
em branco antes e depois da igualdade.
*/

fun main(args: Array<String>) {
  val a = readLine()!!.toInt()
  val b = readLine()!!.toInt()

  println("PROD = ${a * b}")
}