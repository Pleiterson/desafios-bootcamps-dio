// Primo Rápido

/*
Mariazinha sabe que um Número Primo é aquele que pode ser dividido somente por
1 (um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido
apenas pelo número 1 e pelo número 7 sem que haja resto. Então ela pediu para
você fazer um programa que aceite diversos valores e diga se cada um destes
valores é primo ou não. Acontece que a paciência não é uma das virtudes de
Mariazinha, portanto ela quer que a execução de todos os casos de teste que ela
selecionar (instâncias) aconteçam no tempo máximo de um segundo, pois ela odeia
esperar.

- Entrada

A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 200), correspondente
ao número de casos de teste. Seguem N linhas, cada uma contendo um valor
inteiro X (1 < X < 231) que pode ser ou não, um número primo.

- Saída

Para cada caso de teste imprima a mensagem “Prime” (Primo) ou “Not Prime” (Não
Primo), de acordo com o exemplo abaixo.
*/
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    for (i in 0 until n) {
        val x = readLine()!!.toDouble()
        val prime = isPrime(x)
        print(prime)
    }
}

fun print(prime: Boolean) {
    if (prime) {
        print("Prime\n")
    } else print("Not Prime\n")
}

fun isPrime(num: Double): Boolean {
    if (num < 2) return false
    if (num % 2 == 0.0) return num == 2.0
    
    val root = sqrt(num).toInt()
    var i = 3
    
    while (i <= root) {
        if (num % i == 0.0) return false
        i += 2
    }
    return true
}