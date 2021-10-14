// Pares entre Cinco Números

/*
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores
digitados são pares e mostre esta informação.

- Entrada

O arquivo de entrada contém 5 valores inteiros quaisquer.

- Saída

Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de
valores pares lidos.
*/

import java.util.Scanner;

public class Problem {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		
		for(int i = 0; i < 5; i++) {
			int n = scan.nextInt();

			if (n % 2 == 0) {
        count++;
      }
		}

		
		System.out.printf("%d valores pares\n", count);
	}
}