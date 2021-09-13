// Conversão de Tempo

/*
Você terá o desafio de ler um valor inteiro, que é o tempo de duração em
segundos de um determinado evento em uma loja, e informe-o expresso no formato
horas:minutos:segundos.

•	Entrada

O arquivo de entrada contém um valor inteiro N.

•	Saída

Imprima o tempo lido no arquivo de entrada (segundos), convertido para
horas:minutos:segundos, conforme exemplo fornecido.
*/

import java.util.*

fun main(args: Array<String>){
  val time = readLine()!!.toInt()
  val hour = (time / 3600)
  val minutes = (time % 3600) / 60
  val seconds = (time % 3600) % 60
  
  println("$hour:$minutes:$seconds")
}