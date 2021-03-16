// Área do Círculo

/*
A fórmula para calcular a área de uma circunferência é: area = π . raio2.
Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando
por π.

- Entrada

A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a
variável raio.

- Saída

Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo
abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão
(double). Como todos os problemas, não esqueça de imprimir o fim de linha após
o resultado, caso contrário, você receberá "Presentation Error".
*/
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow

fun main(args: Array<String>) {
    val raio = readLine()!!.toDouble()
    val pi = 3.14159
    val area = pi * (raio*raio)
    val resultado = BigDecimal(area).setScale(4, RoundingMode.HALF_EVEN)
    
    println("A=$resultado")
}