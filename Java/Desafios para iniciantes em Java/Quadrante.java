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

import java.io.IOException;
import java.util.Scanner;

public class Quadrante {
  public static void main(String[] args) throws IOException {
  	Scanner leitor = new Scanner(System.in);
  	int X = leitor.nextInt();
  	int Y = leitor.nextInt();
  
  	while (X != 0 && Y != 0) {
      if (X > 0 && Y > 0) {
        System.out.println("primeiro");
      } else if (X > 0 && Y < 0) {
        System.out.println("quarto");
      } else if (X < 0 && Y < 0) {
        System.out.println("terceiro");
      } else if (X < 0 && Y > 0) {
        System.out.println("segundo");
      }
      
  		X = leitor.nextInt();
  		Y = leitor.nextInt();
  	}
  }
}