// Conjuntos bons ou ruins?

/* Nesse algoritmo você deverá descobrir se um conjunto de palavras é bom ou ruim. Por definição, um conjunto é bom quando nenhuma palavra desse conjunto é um prefixo de outra palavra. Caso contrário, é considerado um conjunto ruim.

Por exemplo, {dbc, dae, dbcde} é um conjunto ruim, pois dbc é um prefixo de dbcde. Quando duas palavras são idênticas, definimos como uma sendo prefixo da outra.

- Entrada

A entrada contém vários casos de teste. A primeira linha de cada caso de teste terá um inteiro N (1 ≤ N ≤ 10⁵), que representa a quantidade de palavras no conjunto. Segue então N linhas, cada uma tendo uma palavra de no máximo 100 letras minúsculas. A entrada termina quando N = 0 e não deve ser processada.

- Saída

Para cada caso de teste, você deverá imprimir "Conjunto Bom", ou "Conjunto Ruim", conforme explicado acima. */

import java.util.ArrayList;
import java.util.Scanner;

public class GoodOrBadSets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        ArrayList<String> stringsSet = new ArrayList<>();
        boolean isBadSet = false;
        final String BAD_SET = "Conjunto Ruim";
        final String GOOD_SET = "Conjunto Bom";
        String conditionStr = GOOD_SET;

        while (true) {
            N = Integer.parseInt(scanner.nextLine());
            if (N == 0) {
                break;
            }

            for (int i = 0; i < N; i++) {
                stringsSet.add(scanner.nextLine().toLowerCase().trim());
            }

            int i = 0, j = 0;

            for (i = 0; i < stringsSet.size(); i++) {
                for (j = 0; j < stringsSet.size(); j++) {
                    if (i != j) {
                        if (stringsSet.get(i).startsWith(stringsSet.get(j))
                                || stringsSet.get(j).startsWith(stringsSet.get(i))) {
                            isBadSet = true;
                            conditionStr = BAD_SET;
                            break;
                        }
                    }
                }
                if (isBadSet) {
                    break;
                }
            }
            System.out.println(conditionStr);
            stringsSet = new ArrayList<>();
            conditionStr = GOOD_SET;
        }
        scanner.close();
    }
}