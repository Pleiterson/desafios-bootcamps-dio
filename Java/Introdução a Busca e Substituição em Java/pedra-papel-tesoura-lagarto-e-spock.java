// Pedra, Papel, Tesoura, Lagarto e Spock

/* Pedra-papel-tesoura-lagarto-Spock é uma expansão do clássico método de
seleção em jogo de pedra-papel-tesoura. Atua sob o mesmo princípio básico,
mas inclui outras duas armas adicionais: o lagarto (formado pela mão igual a
uma boca de fantoche) e Spock (formada pela saudação dos vulcanos em Star Trek).
Isso reduz as chances de uma rodada terminar em um empate. O jogo foi
inventado por Sam Kass e Karen Bryla, como "Rock Paper Scissors Lizard Spock".
As regras de vantagem são as seguintes:

•	Tesoura corta papel
•	Papel cobre pedra
•	Pedra derruba lagarto
•	Lagarto adormece Spock
•	Spock derrete tesoura
•	Tesoura prende lagarto
•	Lagarto come papel
•	Papel refuta Spock
•	Spock vaporiza pedra
•	Pedra quebra tesoura

Um dia, duas amigas, Fernanda e Marcia, decidiram apostar quem pagaria um
almoço para o outro, com esta brincadeira. Sua missão será fazer um algoritmo
que, baseado no que eles escolherem, informe quem irá ganhar ou se dará empate.

- Entrada

Haverá diversos casos de teste. O primeiro número a ser lido será um inteiro,
representando a quantidade de casos de teste. Cada caso de teste tem duas
palavras, representando a escolha de Fernanda e de Marcia, respectivamente.

- Saída

Para cada caso de teste, imprima quem venceu, ou se houve empate. */

import java.util.*;

public class PedraPapelTesouraLagartoSpock {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int casos = scr.nextInt();
        
        scr.nextLine();
        List<Regra> regras = new ArrayList<>();
        regras.add(new Regra("tesoura", "papel"));
        regras.add(new Regra("papel", "pedra"));
        regras.add(new Regra("pedra", "lagarto"));
        regras.add(new Regra("lagarto", "spock"));
        regras.add(new Regra("spock", "tesoura"));
        regras.add(new Regra("tesoura", "lagarto"));
        regras.add(new Regra("lagarto", "papel"));
        regras.add(new Regra("papel", "spock"));
        regras.add(new Regra("spock", "pedra"));
        regras.add(new Regra("pedra", "tesoura"));
        
        for (int i = 0; i < casos; i++) {
            List<String> palavras = Arrays.asList(scr.nextLine().split(" "));
            if(palavras.get(0).equals(palavras.get(1))){
                System.out.println("empate");
            } else {
                boolean primeiro = false;
                for (Regra r : regras) {
                    if (r.getVence().equals(palavras.get(0)) && r.getPerde().equals(palavras.get(1))) {
                        primeiro = true;
                        break;
                    }
                }
                
                if(primeiro) {
                    System.out.println("fernanda");
                } else {
                    System.out.println("marcia");
                }
            }
        }
    }
    
    public static class Regra {
        private String vence;
        private String perde;
    
        public Regra(String vence,
                     String perde) {
            this.vence = vence;
            this.perde = perde;
        }
    
        public String getVence() {
            return vence;
        }
    
        public void setVence(String vence) {
            this.vence = vence;
        }
    
        public String getPerde() {
            return perde;
        }
    
        public void setPerde(String perde) {
            this.perde = perde;
        }
    }
}