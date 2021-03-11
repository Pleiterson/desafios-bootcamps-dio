// Quantidade de Números Positivos

/* Crie um programa que leia 6 valores. Você poderá receber valores negativos
e/ou positivos como entrada, devendo desconsiderar os valores nulos. Em
seguida, apresente a quantidade de valores positivos digitados.

- Entrada

Você receberá seis valores, negativos e/ou positivos.

- Saída

Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é
exibido abaixo no exemplo de saída. Não esqueça da mensagem "valores positivos"
ao final. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QtdeNumerosPositivos {
    public static void main(String[] args) throws IOException {
       String linha;
       Double n;
       int Pos, i;

       Pos=0;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       for (i=0; i < 6; i++) {
           linha = br.readLine();
           n = Double.parseDouble(linha);
           if(n > 0.0)Pos++;
       }

       System.out.println("" + Pos + " valores positivos");
    }
}