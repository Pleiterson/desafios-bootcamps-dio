// PUM

/*
Desenvolva um programa que leia um valor inteiro N. Este N refere-se à
quantidade de linhas de saída que serão apresentadas na execução do programa.

- Entrada

O arquivo de entrada contém um número inteiro positivo N.

- Saída

Imprima a saída conforme o exemplo fornecido.
*/

using System;

namespace TESTE {
  class Program {
    static void Main(string[] args) {
      int N = int.Parse(Console.ReadLine());

      int primeiro = 1;
      for (int i = 1; i <= N; i++) {
        Console.WriteLine($"{primeiro} {primeiro+1} {primeiro+2} PUM");
        primeiro+=4;
      }
    }
  }
}