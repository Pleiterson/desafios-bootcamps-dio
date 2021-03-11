// Menor e Posição

/*
Desenvolva um código que leia um valor E. Este E será o tamanho de um vetor
X[E]. A seguir, leia cada um dos valores de X, encontre o menor elemento deste
vetor e a sua posição dentro do vetor, mostrando esta informação.

- Entrada

A primeira linha de entrada contem um único inteiro E (1 < E < 1000), indicando
o número de elementos que deverão ser lidos em seguida para o vetor X[E] de
inteiros. A segunda linha contém cada um dos E valores, separados por um espaço.

- Saída

A primeira linha apresenta a mensagem “Menor valor:” seguida de um espaço e
do menor valor lido na entrada. A segunda linha apresenta a mensagem “Posicao:”
seguido de um espaço e da posição do vetor na qual se encontra o menor valor
lido, lembrando que o vetor inicia na posição zero.
*/

import java.io.IOException;
import java.util.Scanner;

public class MenorPosicao {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int[] X = new int[N];
        int menor = 0, posMenor = 0;

        for (int i = 0; i < N; i++) {
        	X[i] = leitor.nextInt();

        	if (i == 0) {
        		menor = X[i];
        		posMenor = i;
        	} else if (X[i] < menor) {
        		menor = X[i];
        		posMenor = i;
        	}
        }

        System.out.println("Menor valor: " + menor); //complete o codigo aqui de acordo com a variavel esperada
        System.out.println("Posicao: " + posMenor); //complete o codigo aqui de acordo com a variavel esperada
    }
}