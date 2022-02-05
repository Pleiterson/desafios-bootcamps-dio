// Sucessor Par

/*
Para se preparar para os outros problemas, vamos fazer um teste. Dado um número X,
retorne o menor número par maior do que X.

- Entrada

Uma linha contendo um número  0 < X < 107.

- Saída

Uma linha contendo a resposta do problema.
*/

using System; 

class DIO {
  static void Main(string[] args) { 
    int x = int.Parse(Console.ReadLine());
    
    x += (x % 2 == 0 ? 2 : 1);
    Console.WriteLine(x);
  }
}