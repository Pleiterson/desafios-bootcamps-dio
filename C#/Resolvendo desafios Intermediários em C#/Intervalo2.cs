// Intervalo 2

/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que
serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos
estão fora do intervalo, mostrando essas informações.

- Entrada

A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica
o número de casos de teste.
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 
- Saída

Para cada caso, imprima quantos números estão dentro (in) e quantos valores
estão fora (out) do intervalo.
*/

using System; 

class TESTE {
  public static void Main() {
    int tc, a, i;
    int Interval = 0;
    int outInterval = 0;
    tc = int.Parse(Console.ReadLine());

    for (i = 0; i < tc; i++) {
      a = int.Parse(Console.ReadLine());

      if (a >= 10 && a <= 20) {
        Interval++; 
      } else {
        outInterval++;
      }
    }
    Console.WriteLine("{0} in", Interval);
    Console.WriteLine("{0} out", outInterval);
  }
}