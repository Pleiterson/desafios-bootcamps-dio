// Múltiplos

/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
"Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
múltiplos entre si.

- Entrada

A entrada contém valores inteiros.

- Saída

A saída deve conter uma das mensagens conforme descrito acima.
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