// Análise de Números

/* Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos
valores informados são pares, quantos valores informados são ímpares, quantos
valores informados são positivos e quantos valores informados são negativos.

- Entrada

Você receberá 5 valores inteiros.

- Saída

Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por
linha e não esquecendo o final de linha após cada uma. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnaliseNumeros {
    public static void main(String[] args) throws IOException {
        String linha;
        int Pos, Neg, Par, Impar, num;
        
        Pos = Neg = Par = Impar = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            linha = br.readLine();
            num = Integer.parseInt(linha);
            
            if (num % 2 == 0) {
                Par++;
            } else {
                Impar++;
            }
            
            if (num > 0) Pos++;
            if (num < 0) Neg++;
        }
        
        System.out.println("" + Par +" valor(es) par(es)");
        System.out.println("" + Impar + " valor(es) impar(es)");
        System.out.println("" + Pos + " valor(es) positivo(s)");
        System.out.println("" + Neg + " valor(es) negativo(s)");
    }
}