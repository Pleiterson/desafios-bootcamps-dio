// Idade em Dias

/* Você terá o desafio de ler um valor inteiro correspondente à idade de uma
pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo
mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12
meses e alguns dias, como 360, 363 ou 364. 

- Entrada

O arquivo de entrada contém um valor inteiro.

- Saída

Imprima a saída conforme exemplo fornecido. */

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idadeDias = input.nextInt();
        int anos = idadeDias / 365;
        int meses = ((idadeDias % 365) / 30);
        int dias = ((idadeDias % 365) % 30);

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        input.close();
    }
} 