// Entrevista embaraçosa

/* A nutricionista Juliana Alcantra é uma excelente profissional de sua área.
Em determinado dia, ela foi entrevistada ao vivo para um jornal da cidade. No
entanto, ficou um pouco nervosa na hora, e diante da situação, sua fala ficou
um pouco distorcida, repetindo o final de cada palavra após dizer a mesma. Para
que isso não aconteça novamente, ela precisa da sua ajuda para escrever um
programa que omita a parte repetida, de modo que as palavras sejam pronunciadas
como deveriam ser.

Escreva um programa que, dada uma palavra errada, a mesma seja corrigida.

- Entrada

Haverá diversos casos de teste. Cada caso de teste é formado por uma palavra,
de, no máximo, 30 caracteres, dita da forma errada. A entrada termina com fim
de arquivo.

- Saída

Para cada caso de teste, escreva a palavra devidamente corrigida. Analise os
exemplos para verificar o padrão, de modo a consertar todos os casos. */

import java.util.Scanner;

public class EntrevistaEmbaracosa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            String input = scanner.nextLine();
            Integer limit = (int) Math.floor(input.length() / 2);
            Integer end = input.length();
            Integer aux = 0;

            if(input.length() == 1) {
                System.out.println(input);
            } else if (limit >= 1) {
                for (int i = limit; i >= 1; i--) {
                    if(input.substring(end-i, end).equals(input.substring(end-(2*i),end-i))) {
                        aux = i;
                        System.out.println(input.substring(0, (end - aux)));
                    } else if (limit == 1) {
                        System.out.println(input);
                    }
                }
                
                if(limit>1 && aux == 0) System.out.println(input);
            }
        }scanner.close();
    }   
}