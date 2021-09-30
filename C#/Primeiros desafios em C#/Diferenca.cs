// Diferença

/*
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença
do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

- Entrada

O arquivo de entrada contém 4 valores inteiros.

- Saída

Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo
abaixo, com um espaço em branco antes e depois da igualdade.
*/

using System;

namespace Desafio {
  class Program {
    static void Main(string[] args) {
      int A, B, C, D;
      
      A = int.Parse(Console.ReadLine());
      B = int.Parse(Console.ReadLine());
      C = int.Parse(Console.ReadLine());
      D = int.Parse(Console.ReadLine());
      
      Console.WriteLine("DIFERENCA = " + (A * B - C * D));
      Console.ReadKey();
    }
  }
}