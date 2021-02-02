// Entrevista embaraçosa

/* A nutricionista Juliana Alcantra é uma excelente profissional de sua área. Em determinado dia, ela foi entrevistada ao vivo para um jornal da cidade. No entanto, ficou um pouco nervosa na hora, e diante da situação, sua fala ficou um pouco distorcida, repetindo o final de cada palavra após dizer a mesma. Para que isso não aconteça novamente, ela precisa da sua ajuda para escrever um programa que omita a parte repetida, de modo que as palavras sejam pronunciadas como deveriam ser.

Escreva um programa que, dada uma palavra errada, a mesma seja corrigida.

- Entrada

Haverá diversos casos de teste. Cada caso de teste é formado por uma palavra, de, no máximo, 30 caracteres, dita da forma errada. A entrada termina com fim de arquivo.

- Saída

Para cada caso de teste, escreva a palavra devidamente corrigida. Analise os exemplos para verificar o padrão, de modo a consertar todos os casos. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmbarrassingInterview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = null;
        StringBuilder greatestSubstring = new StringBuilder();

        while (scanner.hasNextLine()) {
            line = scanner.nextLine().trim().toLowerCase();
            String possiblyRepeatedPart = null;
            String possiblyEqualStr = null;
            String longestRepeatedStr = line;
            int factor = 1;

            for (int i = line.length() - 1; i >= (line.length() / 2); --i, ++factor) {
                if (i - factor >= 0) {
                    possiblyRepeatedPart = line.substring(i);
                    possiblyEqualStr = line.substring(i - factor, i);
                    
                    if (possiblyEqualStr.equals(possiblyRepeatedPart)) {
                        longestRepeatedStr = possiblyEqualStr;
                    }
                }
            }
            
            String originalString = longestRepeatedStr;

            if (longestRepeatedStr.length() < line.length()) {
                int longestRepeatedStrLength = longestRepeatedStr.length();
                int firstRepetitionIndex = line.length() - longestRepeatedStrLength;

                for (int i = line.length() - (longestRepeatedStrLength * 2); i
                        - longestRepeatedStrLength >= 0; i -= longestRepeatedStrLength) {
                    if (line.substring(i - longestRepeatedStrLength, i).equals(longestRepeatedStr)) {
                        firstRepetitionIndex = i;
                    }
                }
                originalString = line.substring(0, firstRepetitionIndex);
            }
            System.out.println(originalString);
        }
        scanner.close();
    }
}