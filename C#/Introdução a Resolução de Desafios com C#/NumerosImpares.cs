// Números Ímpares

/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
até X, um valor por linha, inclusive o X, se for o caso.

•	Entrada

O arquivo de entrada contém 1 valor inteiro qualquer.

•	Saída

Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.
*/

using System;

class MinhaClasse {
  static void Main(string[] args) {
    string[] valores = Console.ReadLine().Split(' ');
    int A = int.Parse(valores[0]);
    int B = int.Parse(valores[1]);

    if (A % B == 0 || B % A == 0 ) {
      Console.WriteLine("Sao Multiplos");
    }
    else {
      Console.WriteLine("Nao sao Multiplos");
    }
  }
}