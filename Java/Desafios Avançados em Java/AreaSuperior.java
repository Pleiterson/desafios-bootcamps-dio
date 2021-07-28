// Área Superior

/*
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e
uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média
considerando somente aqueles elementos que estão na área superior da matriz,
conforme ilustrado abaixo (área verde).

vide arquivo em assets area-superior.png

•	Entrada

A primeira linha de entrada contém um único caractere Maiúsculo O ('S' ou 'M'),
indicando a operação (Soma ou Média) que deverá ser realizada com os elementos
da matriz. Seguem 144 valores com ponto flutuante de dupla precisão que compõem
a matriz.

•	Saída

Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto
decimal.
*/

import java.io.IOException;
import java.util.Scanner;

public class AreaSuperior {
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    double soma = 0;
    char O = leitor.next().toUpperCase().charAt(0);
    double[][] M = new double[12][12];
    
    for (int i = 0; i < 12; ++i) {
    	for (int j = 0; j < 12; ++j) {
    		M[i][j] = leitor.nextDouble();
    	}
    }
    
    for (int i = 0; i < 5; ++i) {
    	for (int j = 1; j < 11; ++j) {
    		if (j > i && i + j < 11) soma += M[i][j];
    	}
    }

    if (O == 'M') soma /= ((M.length * M.length) - 24) / 4;
    
  	System.out.println(String.format("%.1f", soma));
  }
}