// Encaixa ou Não I

/*
Paulinho tem em suas mãos um pequeno problema. A professora lhe pediu que ele
construísse um programa para verificar, à partir de dois valores inteiros A e
B, se B corresponde aos últimos dígitos de A.

- Entrada

A entrada consiste de vários casos de teste. A primeira linha de entrada contém
um inteiro N que indica a quantidade de casos de teste. Cada caso de teste
consiste de dois inteiros A (1 ≤ A < 231 ) e B (1 ≤ B < 231) positivos.

- Saída

Para cada caso de entrada imprima uma mensagem indicando se o segundo valor
encaixa no primeiro valor, conforme exemplo abaixo.
*/

import java.io.IOException;
import java.util.Scanner;
 
public class Desafio {
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    int N = leitor.nextInt();
    
    for (int i = 0; i < N; i++) {
      String A = leitor.next();
      String B = leitor.next();
      System.out.println((A.endsWith(B)) ? "encaixa" : "nao encaixa");
    }
  }
}