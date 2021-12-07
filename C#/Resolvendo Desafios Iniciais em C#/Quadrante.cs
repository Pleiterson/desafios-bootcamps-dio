// Quadrante

/*
Desenvolva um programa para ler as coordenadas (M,N) de uma quantidade
indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma
de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

- Entrada

A entrada contém vários casos de teste. Cada caso de teste contém 2 valores
inteiros.

- Saída

Para cada caso de teste mostre em qual quadrante do sistema cartesiano se
encontra a coordenada lida, conforme o exemplo.
*/

using System;

class TESTE {
  public static void Main() {
    int X, Y;
    
    while (true) {
      string[] s = Console.ReadLine().Split(' ');
      X = int.Parse(s[0]);
      Y = int.Parse(s[1]);

      if (X == 0 || Y == 0)
        break;
      else if (X > 0 && Y > 0)
        Console.WriteLine("primeiro");
      else if (X > 0 && Y < 0)
        Console.WriteLine("quarto");
      else if (X < 0 && Y < 0)
        Console.WriteLine("terceiro");
      else if (X < 0 && Y > 0)
        Console.WriteLine("segundo");
    }
    Console.ReadLine();
  }
}