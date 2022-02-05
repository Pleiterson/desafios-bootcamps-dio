// Sequência IJ 2

/*
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

- Entrada

Não há nenhuma entrada neste problema.

- Saída

Imprima a sequencia conforme exemplo abaixo
*/

using System; 

class DIO {
  static void Main(string[] args) { 
   for (int i = 1; i <= 9; i+=2) {
      for(int j = 7; j >= 5; j--) {
        Console.WriteLine($"I={i} J={j}");
      }
    }
  }
}