// Combinação de strings

/* Crie um algoritmo que receba dois inputs que sejam strings e combine-as
alternando as letras de cada string. 

Deve começar pela primeira letra da primeira string, seguido pela primeira
letra da segunda string, em seguida pela segunda letra da primeira string e
continuar dessa forma sucessivamente.

As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string
resultante e retornada.

- Entrada

A entrada contém vários casos de teste. A primeira linha contém um inteiro N
que indica a quantidade de casos de teste que vem a seguir. Cada caso de teste
é composto por uma linha que contém duas cadeias de caracteres, cada cadeia de
caracteres contém entre 1 e 50 caracteres inclusive.

- Saída

Combine as duas cadeias de caracteres da entrada como mostrado no exemplo
abaixo e exiba a cadeia resultante. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CombinacaoStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int linhas = Integer.parseInt(br.readLine());
      
        String palavra1;
        String palavra2;
        
        for (int i = 0; i < linhas; i++) {
            var linha = br.readLine().split(" ");
            
            try {
                palavra1 = linha[0];
            } catch (Exception e) {
                palavra1 = "";
            }
    
            try {
                palavra2 = linha[1];
            } catch (Exception e) {
                palavra2 = "";
            }
            
            combinar(palavra1, palavra2);
        }
    }
    
    private static void combinar(String p1, String p2) {
        String combinacao = "";
        
        for (int i = 0; i < p1.length(); i++) {
            try {
                combinacao += String.valueOf(p1.charAt(i)) + String.valueOf(p2.charAt(i));
            }catch (Exception e){
                combinacao += String.valueOf(p1.charAt(i));
            }
        }
    
        if(p2.length() > p1.length()) {
            int qtde = p2.length() - p1.length();
            
            for (int i = p2.length() - qtde; i < p2.length(); i++) {
                combinacao += String.valueOf(p2.charAt(i));
            }
        }
        
        System.out.println(combinacao);
    }
}