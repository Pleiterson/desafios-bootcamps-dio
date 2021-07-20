// Positivos e Média

/*
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram
positivos. Na próxima linha, deve-se mostrar a média de todos os valores
positivos digitados, com um dígito após o ponto decimal.

- Entrada

A entrada contém 6 números que podem ser valores inteiros ou de ponto
flutuante. Pelo menos um destes números será positivo.

- Saída

O primeiro valor de saída é a quantidade de valores positivos. A próxima linha
deve mostrar a média dos valores positivos digitados.
*/

using System; 

class Media {
  public static void Main() {
    double a, b = 0.0, avg;
    int  positivo = 0;
    
    for (int i = 0; i < 6; i++) {
      a = double.Parse(Console.ReadLine());
      
      if (a > 0.0) {
        positivo += 1;
        b += a;
      }
    }
    
    avg = (b / positivo);
    Console.WriteLine("{0} valores positivos", positivo);
    Console.WriteLine("{0}", Math.Round(avg, 1));
  }
}