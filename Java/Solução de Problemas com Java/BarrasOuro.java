// Barras de ouro

/* O feudo da Mesopotâmia é rico e o povo é cordial e alegre. Mas quando o
assunto são impostos, é praticamente um roubo. Todo final de ano, cada feudo
do país deve pagar uma determinada quantidade de quilos de ouro em impostos.
Quando é chegado o momento de coletar os impostos, o Rei envia sua carruagem
real para recolher o ouro devido, usando as estradas do reino.

Cada estrada liga dois feudos diferentes e podem ser percorridos em duas
direções. Com as estradas é possível ir de um feudo a outro, possivelmente
passando por feudos intermediários. Mas há apenas um caminho entre dois feudos
diferentes.

Em cada feudo há um cofre real, utilizado para armazenamento do ouro de
impostos. Os cofres reais são imensos, de forma que cada cofre tem capacidade
de armazenar todo o ouro devido por todo o reino. A carruagem sai do feudo
principal, percorrendo as estradas do reino, visitando os feudos para recolher
o ouro devido, podendo usar qualquer cofre real para armazenar temporariamente
uma parte do imposto recolhido, se necessário. Ao final da coleta, todo o ouro
devido por todas os feudos devem estar armazenados no cofre real do feudo
principal.

José como é o Rei, contratou o seu time para, dados a quantidade de ouro a ser
recolhido em cada feudo (em kg), a lista das estradas do reino, com os
respectivos comprimentos (em km) e a capacidade de carga da carruagem real
(em kg), determine qual é a mínima distância que a carruagem deve percorrer
para recolher todo o ouro devido.

- Entrada

A primeira linha contém dois inteiros N e C indicando respectivamente o número
de cidades e a capacidade de carga da carruagem (2 ≤ N ≤ 104 e 1 ≤ C ≤ 100). O
feudo principal é identificado pelo número 1 e os outros feudos são identificadas por inteiros de 2 a N . A segunda linha contém N inteiros Ei representando a quantidade de imposto devido por cada feudo i (0 ≤ Ei ≤ 100 para 1 ≤ i ≤ N ). Cada uma das N-1 linhas seguintes contém três inteiros A , B e C , indicando que uma estrada liga o feudo A e o feudo B (1 ≤ A, B ≤ N ) e tem comprimento C (1 ≤ C ≤ 100).

- Saída

Seu programa deve produzir uma única linha com um inteiro representando a menor
distância que a carruagem real deve percorrer para recolher todo o imposto
devido, em km.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BarrasOuro {
  static int cargoCapacity;
  class Edge {
    Vertex destinationVertex;
    int weight;

    Edge(Vertex destinationVertex, int weight) {
      this.destinationVertex = destinationVertex;
      this.weight = weight;
    }
  }

  class Vertex {
    double taxQuantity;
    List<Edge> edgesList;

    public Vertex(int taxQuantity) {
      this.taxQuantity = taxQuantity;
      this.edgesList = new ArrayList<>();
    }

    public void addPath(Vertex destinationVertex, int weight) {
      edgesList.add(new Edge(destinationVertex, weight));
    }

    public int calculateTotalDistance(Vertex previousCity) {
      int totalDistance = 0;
      int travelsNumber = 0;

      for (var edge : edgesList) {
        if (edge.destinationVertex == previousCity) {
          continue;
        }

        totalDistance += edge.destinationVertex.calculateTotalDistance(this);
        travelsNumber = (int) Math.ceil(edge.destinationVertex.taxQuantity / GoldBars.cargoCapacity) * 2;
        totalDistance += travelsNumber * edge.weight;
        this.taxQuantity += edge.destinationVertex.taxQuantity;
      }
      return totalDistance;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N;
    String[] lineArgs;
    lineArgs = scanner.nextLine().split(" ");
    N = Integer.parseInt(lineArgs[0]);
    GoldBars.cargoCapacity = Integer.parseInt(lineArgs[1]);
    List<Vertex> cities = new ArrayList<>();
    List<Integer> taxQuantities = new ArrayList<>();
    Arrays.asList(scanner.nextLine().split(" ")).forEach(taxQuantityStr -> {
      taxQuantities.add(Integer.parseInt(taxQuantityStr));
    });
    GoldBars goldBars = new GoldBars();

    for (int i = 0; i < N; i++) {
      Vertex city = goldBars.new Vertex(taxQuantities.get(i));
      cities.add(city);
    }
    List<String> graphInfos;
    int a, b, c;

    for (int i = 0; i < taxQuantities.size() - 1; ++i) {
      graphInfos = Arrays.asList(scanner.nextLine().split(" "));
      a = Integer.parseInt(graphInfos.get(0)) - 1;
      b = Integer.parseInt(graphInfos.get(1)) - 1;
      c = Integer.parseInt(graphInfos.get(2));

      cities.get(a).addPath(cities.get(b), c);
      cities.get(b).addPath(cities.get(a), c);
    }
    System.out.println(cities.get(0).calculateTotalDistance(null));
    scanner.close();
  }
}