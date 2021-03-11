// Bazinga!

/* Em um episódio da aclamada série The Big Ban Theor dois pernagens, Sheldon
e Raj, discutem qual dos dois é o melhor: o filme Saturn 3 ou a série Deep
Space 9. A sugestão de Raj para a resolução do impasse é uma disputa de
Pedra-Papel-Tesoura. Contudo, Sheldon argumenta que, se as partes envolvidas
se conhecem, entre 75% e 80% das disputas de Pedra-Papel-Tesoura terminam
empatadas, e então sugere o Pedra-Papel-Tesoura-Lagarto-Spock.

As regras do jogo proposto são:

1. a tesoura corta o papel;
2. o papel embrulha a pedra;
3. a pedra esmaga o lagarto;
4. o lagarto envenena Spock;
5. Spock destrói a tesoura;
6. a tesoura decapita o lagarto;
7. o lagarto come o papel;
8. o papel contesta Spock;
9. Spock vaporiza a pedra;
10. a pedra quebra a tesoura.

Conhecendo os personagens, sabemos que caso Sheldon vencesse, ele gritaria a
vitória com um "Bazinga!". Se Raj vencesse, Sheldon o acusaria de ter
trapaceado. Agora, se desse empate, Sheldon não descansaria e insistira para
jogarem de novo até que seja decidido. Sabendo dessas ações, faça um programa
que imprima a provável reação de Sheldon.

- Entrada

A entrada consiste em uma série de casos de teste. A primeira linha contém um
inteiro positivo T (T ≤ 100), que representa o número de casos de teste. Cada
caso de teste é representado por uma linha da entrada, contendo as escolhas de
Sheldon e Raj, respectivamente, separadas por um espaço em branco. As escolhas
possíveis são as personagens do jogo: pedra, papel, tesoura, lagarto e Spock.

- Saida

Para cada caso de teste deverá ser impressa a mensagem "Caso #t: R", onde t é
o número do caso de teste (cuja contagem se inicia no número um) e R é uma das
três reações possíveis de Sheldon: "Bazinga!", "Raj trapaceou!", ou "De novo!".
*/

using System;

class Desafio {
    static void Main() {
        int limit = int.Parse(Console.ReadLine());
            for (int i = 1; i <= limit; i++) {
                if (i > 100) return;
                string[] line = Console.ReadLine().Split(" ");
                string sheldon = line[0].ToLower();
                string raj = line[1].ToLower();

                switch (sheldon) {
                    case "pedra":
                        switch (raj) {
                            case "lagarto":
                            case "tesoura":
                                Console.WriteLine("Caso #" + i + ": Bazinga!");
                                break;
                            case "pedra":
                                Console.WriteLine("Caso #" + i + ": De novo!");
                                break;
                            default:
                                Console.WriteLine("Caso #" + i + ": Raj trapaceou!");
                                break;
                        }
                        break;
                    case "papel":
                        switch (raj) {
                            case "pedra":
                            case "spock":
                                Console.WriteLine("Caso #" + i + ": Bazinga!");
                                break;
                            case "papel":
                                Console.WriteLine("Caso #" + i + ": De novo!");
                                break;
                            default:
                                Console.WriteLine("Caso #" + i + ": Raj trapaceou!");
                                break;
                        }
                        break;
                    case "tesoura":
                        switch (raj) {
                            case "papel":
                            case "lagarto":
                                Console.WriteLine("Caso #" + i + ": Bazinga!");
                                break;
                            case "tesoura":
                                Console.WriteLine("Caso #" + i + ": De novo!");
                                break;
                            default:
                                Console.WriteLine("Caso #" + i + ": Raj trapaceou!");
                                break;
                        }
                        break;
                    case "lagarto":
                        switch (raj) {
                            case "spock":
                            case "papel":
                                Console.WriteLine("Caso #" + i + ": Bazinga!");
                                break;
                            case "lagarto":
                                Console.WriteLine("Caso #" + i + ": De novo!");
                                break;
                            default:
                                Console.WriteLine("Caso #" + i + ": Raj trapaceou!");
                                break;
                        }
                        break;
                    case "spock":
                        switch (raj) {
                            case "tesoura":
                            case "pedra":
                                Console.WriteLine("Caso #" + i + ": Bazinga!");
                                break;
                            case "spock":
                                Console.WriteLine("Caso #" + i + ": De novo!");
                                break;
                            default:
                                Console.WriteLine("Caso #" + i + ": Raj trapaceou!");
                                break;
                        }
                        break;
                    default:
                        break;
                }
            }
    }
}