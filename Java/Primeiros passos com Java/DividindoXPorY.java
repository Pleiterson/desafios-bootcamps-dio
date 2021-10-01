// Dividindo X por Y

/*
Você terá o desafio de escrever um algoritmo que leia 2 números e imprima o
resultado da divisão do primeiro pelo segundo. Caso não for possível, mostre a
mensagem “divisao impossivel” para os valores em questão.

- Entrada

A entrada contém um número inteiro N. Este N será a quantidade de pares de
valores inteiros (X e Y) que serão lidos em seguida.

- Saída

Para cada caso mostre o resultado da divisão com um dígito após o ponto
decimal, ou “divisao impossivel” caso não seja possível efetuar o cálculo.
*/

import java.util.Scanner;

public class Divisao {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    
    for (int i = 0; i < n; i++) {
      double x = input.nextDouble();
      double y = input.nextDouble();
     
      if (y == 0) {
        System.out.println("divisao impossivel");
      } else {
        System.out.printf("%.1f\n", (double)(x/y));
      }
    }
  }
}