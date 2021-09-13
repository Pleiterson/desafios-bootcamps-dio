// Média 3

/*
Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal,
correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4
e 1, respectivamente, para cada uma destas notas e mostre esta média
acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a 7.0,
imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0,
imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre
5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em
exame.".
No caso de o aluno estar em exame, leia um valor correspondente à nota do
exame obtida pelo aluno. Imprima então a mensagem "Nota do exame: "
acompanhada pela nota digitada. Recalcule a média (some a pontuação do exame
com a média anteriormente calculada e divida por 2). e imprima a mensagem
"Aluno aprovado." (caso a média final seja 5.0 ou mais) ou "Aluno reprovado.",
(caso a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou
reprovado após ter pego exame) apresente na última linha uma mensagem "Media
final: " seguido da média final para esse aluno.

•	Entrada

A entrada contém quatro números de ponto flutuante correspondentes as notas
dos alunos.

•	Saída

Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens
devem ser impressas conforme a descrição do problema. Não esqueça de imprimir
o enter após o final de cada linha, caso contrário obterá "Presentation Error".
*/

import java.util.*
import kotlin.math.round

private fun Float.round(decimal:Int):Float{
  var multiplicador = 1.0f
  repeat(decimal) {
    multiplicador *= 10
  }
  return round(this * multiplicador) / multiplicador
}

fun main() {
  val peso1 = 2
  val peso2 = 3
  val peso3 = 4
  val peso4 = 1
  val entrada = Scanner(System.`in`)
  val n1 = entrada.nextFloat()
  val n2 = entrada.nextFloat()
  val n3 = entrada.nextFloat()
  val n4 = entrada.nextFloat()
  val media:Float
  val mediaPonderada = (n1 * peso1 + n2 * peso2 + n3 * peso3 + n4 * peso4) / (peso1 + peso2 + peso3 + peso4)
  var mediaPrint = mediaPonderada.round(1)
  
  println("Media: $mediaPrint")
  
  if (mediaPonderada >= 7) {
      println("Aluno aprovado.")
  }
  if (mediaPonderada < 5) {
      println("Aluno reprovado.")
  }
  if (mediaPonderada >= 5 && mediaPonderada < 6.9) {
    println("Aluno em exame.")
    val exame = entrada.nextFloat()
    val examePrint = exame.round(1)
    
    println("Nota do exame: $examePrint")
    media = (mediaPonderada + exame) / 2
    mediaPrint = media.round(1)
    
    if (media >= 5) {
      println("Aluno aprovado.")
    } else {
      println("Aluno reprovado")
    }
    println("Media final: $mediaPrint")
  }
}