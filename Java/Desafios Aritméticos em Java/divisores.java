// Divisores

/*
Pense um número positivo n. Agora me diga um divisor A de n. Agora me dê um
outro número B que não seja divisor de n. Agora um múltiplo C. E um não
múltiplo D. O número que você pensou é...

Parece um truque de mágica, mas é matemática! Será que, conhecendo os números
A, B, C e D, você consegue descobrir qual era o número original n? Note que
pode existir mais de uma solução!

Neste problema, dados os valores de A, B, C e D, você deve escrever um programa
que determine qual o menor número n que pode ter sido pensado ou concluir que
não existe um valor possível.

- Entrada

A entrada consiste de uma única linha que contém quatro números inteiros A, B,
C, e D, como descrito acima (1 ≤ A, B, C, D ≤ 109).

- Saída

Seu programa deve produzir uma única linha. Caso exista pelo menos um número n
para os quais A, B, C e D façam sentido, a linha deve conter o menor n
possível. Caso contrário, a linha deve conter -1.
*/

import java.util.Scanner;

public class Divisores {
  static int A, B, C, D;
  public static void main(String[] args) {
    int n = -1;
    int sqrtC = (int) Math.sqrt(C);
    
    Scanner scanner = new Scanner(System.in);
    A = scanner.nextInt();
    B = scanner.nextInt();
    C = scanner.nextInt();
    D = scanner.nextInt();
    scanner.close();

    for (int i = 1; i <= sqrtC; ++i) {
      if (C % i == 0) {
        if (checkConditionsABD(i)) {
          n = i;
          break;
        } else if (checkConditionsABD(C / i)) {
          n = C / i;
        }
      }
    }
    System.out.println(n);
  }

  static boolean checkConditionsABD(int i) {
    return (i % A == 0) && (i % B != 0) && (D % i != 0);
  }
}
