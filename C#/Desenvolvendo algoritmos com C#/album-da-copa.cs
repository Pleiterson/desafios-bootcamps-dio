// Álbum da Copa

/* A Copa do Mundo de Futebol é um dos maiores eventos esportivos do Planeta
Terra, e o álbum de figurinhas oficial é sempre um grande sucesso entre os
amantes dessa competição. O álbum contém espaços numerados de 1 a N para colar
as figurinhas; cada figurinha, também numerada de 1 a N, é uma pequena foto de
um jogador de uma das seleções que jogará a Copa do Mundo. O objetivo é colar
todas as figurinhas nos respectivos espaços no álbum, de modo a completar o
álbum, ou seja, não deixar nenhum espaço sem a correspondente figurinha.

As figurinhas são vendidas em envelopes fechados, de forma que o comprador
não sabe quais figurinhas está comprando, e pode ocorrer de comprar uma
figurinha que ele já tenha colado no álbum.

Para ajudar os usuários, a empresa responsável pela venda do álbum e das
figurinhas quer criar um aplicativo que permita gerenciar facilmente as
figurinhas que faltam para completar o álbum e está solicitando a sua ajuda.

Dados o número total de espaços e figurinhas do álbum, e uma lista das
figurinhas já compradas (que pode conter figurinhas repetidas), o seu desafio
é determinar quantas figurinhas faltam para completar o álbum.

- Entrada

A primeira linha contém um inteiro N (1 ≤ N ≤ 100) indicando o número total
de figurinhas e espaços no álbum. A segunda linha contém um inteiro M
(1 ≤ M ≤ 300) indicando o número de figurinhas já compradas. Cada uma das M
linhas seguintes contém um número inteiro X (1 ≤ X ≤ N) indicando uma
figurinha já comprada.

- Saída

Seu programa deve produzir uma única linha contendo um inteiro representando
o número de figurinhas que falta para completar o álbum. */

using System;

class Program {
    static void Main(string[] args) {
        int numeroDeFigurinhas = int.Parse(Console.ReadLine());
        int numeroDeFigurinhasCompradas = int.Parse(Console.ReadLine());
        int totalDeFigurinhas = 0;
        int[] albumDeFigurinha = new int[numeroDeFigurinhasCompradas];

        for (int i = 0; i < numeroDeFigurinhasCompradas; i++) {
            string entrada = Console.ReadLine();
            
            if (entrada != null) {
                albumDeFigurinha[i] = int.Parse(entrada);
            }
        }

        for (int i = 0; i < numeroDeFigurinhasCompradas; i++) {
            int figurinha = albumDeFigurinha[i];
            int repetida = 0;

            for (int j = 0; j < numeroDeFigurinhasCompradas; j++) {
                if (albumDeFigurinha[j] == figurinha) {
                    repetida++;
                } 
            }

            if (repetida >= 2) {
                for (int j = 0; j < numeroDeFigurinhasCompradas; j++) {
                    if (figurinha == albumDeFigurinha[j]) { 
                        albumDeFigurinha[j] = -1;
                        break;
                    }
                }
            }
        }

        int figuras = 0;

        for (int i = 0; i < numeroDeFigurinhasCompradas; i++) {
            if (albumDeFigurinha[i] != -1) {
                figuras++;
            }
        }
        
        totalDeFigurinhas = numeroDeFigurinhas - figuras;
        Console.Write(totalDeFigurinhas);
    }
}