// Par ou Ímpar

/*
Leia um valor inteiro N. Este valor será a quantidade de valores que serão
lidos em seguida. Para cada valor lido, mostre uma mensagem em inglês dizendo
se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo
(NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta
seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir
apenas NULL.

- Entrada

A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o
número de casos de teste. Cada caso de teste a seguir é um valor inteiro X
(-107 < X <107).

- Saída

Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo
abaixo. Todas as letras deverão ser maiúsculas e sempre deverá haver um espaço
entre duas palavras impressas na mesma linha.
*/

using System; 

class Desafio {
  public static void Main() {
    int tc, i, x;
    
    tc = int.Parse(Console.ReadLine());
    
    for ( i = 0; i < tc; i++) {
      x = int.Parse(Console.ReadLine());
      
      if (x == 0) Console.WriteLine("NULL");
      if (x != 0) {
        if (x > 0) {
          Console.WriteLine(x % 2 ==0 ? "EVEN POSITIVE" : "ODD POSITIVE");
        } else if (x < 0) {
          Console.WriteLine(x % 2 ==0 ? "EVEN NEGATIVE" : "ODD NEGATIVE");
        }
      }
    }
    Console.ReadLine();
  }
}