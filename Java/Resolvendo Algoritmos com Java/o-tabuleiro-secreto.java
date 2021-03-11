// O tabuleiro secreto

/* O senhor Milli, morador da cidade Petland, é o famoso proprietário da maior
fábrica de jogos de tabuleiros do mundo. 

Recentemente, ele teve a ideia de lançar um novo jogo exclusivo de tabuleiro,
que ele apelidou de Tabuleiro da Frequência.

O jogo ocorre da seguinte forma. Inicialmente, um tabuleiro com dimensões
N × N é dado contendo apenas 0’s. Depois disso, Q operações são propostas,
podendo ser de 4 tipos:

•	1 X R: Atribuir o valor R a todos os números da linha X;
•	2 X R: Atribuir o valor R a todos os números da coluna X;
•	3 X: Imprimir o valor mais frequente na linha X;
•	4 X: Imprimir o valor mais frequente da coluna X.

Milli não é muito bom com computadores, mas é bastante preguiçoso. Sabendo que
você é um dos melhores programadores do mundo, ele precisa sua ajuda para
resolver este problema.

- Entrada

A primeira linha da entrada é composta por dois inteiros N e Q (1 ≤ N, Q ≤ 105),
representando, respectivamente, o tamanho do tabuleiro e a quantidade de
operações. As próximas Q linhas da entrada vão conter as Q operações. O
primeiro inteiro de cada linha vai indicar o tipo da operação. Caso seja 1 ou
2, será seguido por mais dois inteiros X (1 ≤ X ≤ N) e R (0 ≤ R ≤ 50). Caso
seja 3 ou 4, será seguido por apenas mais um inteiro X.

- Saída

Para cada operação do tipo 3 ou 4, seu programa deve produzir uma linha,
contendo o valor da resposta correspondente. Se uma linha ou coluna tiver
dois ou mais valores que se repetem o mesmo número de vezes, você deve
imprimir o maior deles. Por exemplo, se uma linha tem os valores
[5,7,7,2,5,2,1,3], tanto o 2, 5 e 7 se repetem duas vezes, então a resposta
será 7, pois é o maior deles. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TabuleiroSecreto {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nq = br.readLine().split(" ");
        int tamTab = Integer.parseInt(nq[0]);
        int numOp = Integer.parseInt(nq[1]);
        int[][] matriz = new int[tamTab][tamTab];
        
        for (int i = 0; i < tamTab ; i++) {
            for (int j = 0; j < tamTab; j++) {
                matriz[i][j] = 0;
            }
        }
        
        for (int i = 0; i < numOp; i++) {
            String[] operacao = br.readLine().split(" ");
            int tipoOp = Integer.parseInt(operacao[0]);
            int linha = Integer.parseInt(operacao[1]);
            int valor = 0;
            
            if(operacao.length == 3) {
                valor = Integer.parseInt(operacao[2]);
            }
            
            switch (tipoOp) {
                case 1: atribuiLinhaX(linha, valor, matriz); break;
                case 2: atribuiColunaX(linha, valor, matriz); break;
                case 3: imprimirFrequenteLinhaX(linha, matriz); break;
                case 4: imprimirFrequenteColunaX(linha, matriz); break;
            }
        }
    }
    
    private static void imprimirFrequenteColunaX(int col,
                                                 int[][] matriz) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(matriz[0][col-1], 1);
    
        for (int i = 1; i < matriz.length; i++) {
            if(map.containsKey(matriz[i][col-1])){
                map.put(matriz[i][col-1], map.get(matriz[i][col-1])+1);
            } else {
                map.put(matriz[i][col-1], 1);
            }
        }
    
        var key = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        
        if(map.get(key) == 1){
            key = map.entrySet().stream().max((entry1, entry2) -> entry1.getKey() > entry2.getKey() ? 1 : -1).get().getKey();
        }
        
        System.out.println(key);
    }
    
    private static void imprimirFrequenteLinhaX(int linha,
                                                int[][] matriz) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(matriz[linha-1][0], 1);
        
        for (int i = 1; i < matriz.length; i++) {
            if(map.containsKey(matriz[linha-1][i])){
                map.put(matriz[linha-1][i], map.get(matriz[linha-1][i])+1);
            } else {
                map.put(matriz[linha-1][i], 1);
            }
        }
    
        var key = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        
        if(map.get(key) == 1){
            key = map.entrySet().stream().max((entry1, entry2) -> entry1.getKey() > entry2.getKey() ? 1 : -1).get().getKey();
        }
        
        System.out.println(key);
    }
    
    private static void atribuiColunaX(int col,
                                       int valor,
                                       int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][col-1] = valor;
        }
    }
    
    private static void atribuiLinhaX(int linha,
                                      int valor,
                                      int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[linha-1][i] = valor;
        }
    }
}