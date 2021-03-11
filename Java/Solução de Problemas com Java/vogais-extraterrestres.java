// Vogais Extraterrestres

/* Desde o Gerador de Improbabilidade Infinita, muitos nem questionam sobre
vidas extraterrestres, e se aprofundam em questionamentos mais improváveis,
como, por exemplo, será que seres de outros planetas usam os mesmos caracteres
que nós para se comunicarem? E se isso for verdade, será que usam as mesmas
letras vogais que a gente? Pensando nisso, vários cientistas criaram inúmeros
tipos de alfabetos alienígenas, usando as letras do nosso alfabeto, além dos
dígitos, de 0 a 9, com as suas respectivas vogais. Baseados nisto, eles
querem a sua ajuda para identificar vogais em alfabetos alienígenas e realizar
a contagem.

Escreva um programa que, dado uma sequência de vogais, em um determinado
alfabeto alienígena, contabilize, em um texto escrito com o mesmo alfabeto,
quantas vogais o mesmo possui.

- Entrada

Haverá diversos casos de teste. Cada caso de teste é formado por duas linhas.
A primeira linha informa uma palavra, formada por todas as vogais alienígenas
de um determinado planeta. A segunda linha contém uma frase formada por letras
do mesmo alfabeto. A entrada termina com fim de arquivo.

- Saída

Para cada caso de teste, imprima a quantidade de vogais alienígenas
correspondente. */

import java.util.Scanner;

public class VogaisExtraterrestres {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String alfabeto;
        String frase;
        int quantidade = 0;
        
        while (scr.hasNextLine()) {
            quantidade = 0;
            alfabeto = scr.nextLine();
            frase = scr.nextLine();
    
            for (int i = 0; i < alfabeto.length() ; i++) {
                for (int j = 0; j < frase.length(); j++) {
                    if (frase.charAt(j) == alfabeto.charAt(i)) {
                        quantidade++;
                    }
                }
            }
            
            System.out.println(quantidade);
        }
    }
}