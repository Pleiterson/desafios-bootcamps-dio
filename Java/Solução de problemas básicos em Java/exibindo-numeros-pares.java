// Exibindo Números Pares

/* Crie um programa que leia um número e mostre os números pares até esse
número, inclusive ele mesmo.

- Entrada

Você receberá 1 valor inteiro N, onde N > 0.

- Saída

Exiba todos os números pares até o valor de entrada, sendo um em cada linha.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExibindoNumerosPares {
    public static void main(String[] args) throws IOException {
        String entrada;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        entrada = br.readLine();
        
        for (int i = 2; i <= Integer.parseInt(entrada); i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}