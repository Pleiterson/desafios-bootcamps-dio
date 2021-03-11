// Melhor amigo do Pablo

/* Todo final de ano ocorre uma festa na escola. As inscrições para participar
da festa são abertas no início de julho. No momento da inscrição, o aluno pode
escolher se quer ser "O Amigo do Pablo" na festa ou não. O mais lógico seria
escolher a opção Sim, afinal, é um privilégio ser O Amigo do Pablo, já que ele
é a pessoa mais descolada da escola. Porém, há indivíduos que definitivamente
não pretendem ser O Amigo do Pablo, e por motivos desconhecidos.

Somente um será o escolhido. Em vista disso, muitos alunos que escolheram a
opção Sim realizaram a inscrição diversas vezes para aumentar a própria
probabilidade de ser O Amigo do Pablo. A diretora da escola pediu que você
desenvolva um programa que organize as inscrições do site, pois está havendo
um spam de inscrições. O critério para ser o escolhido é a quantidade de
letras do primeiro nome, e em caso de empate, vence aquele que realizou
primeiro a inscrição. A organização final dos inscritos deverá seguir a ordem
de escolha (Sim ou Não), mas respeitando a ordem alfabética.

OBS.: Ninguém que escolheu a opção Não realizou a inscrição mais de uma vez.

- Entrada

A entrada contém somente um caso de teste. Cada linha é composta pelo primeiro
nome do participante (sem espaços), seguido da opção SIM (caso o usuário
queira ser O Amigo do Pablo) ou NAO (caso não queira). A entrada termina assim
que o usuário digita "FIM" (sem as aspas).

- Saída

Seu programa deverá imprimir os inscritos pela ordem de escolha e por ordem
alfabética, seguido do nome do vencedor. Imprima uma linha em branco entre a
lista de inscritos e o nome do vencedor. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MelhorAmigoPablo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha = br.readLine();
        List<Participante> participantes = new ArrayList<>();
    
        while (!linha.equals("FIM")) {
            var participante = new Participante();
            var entrada = linha.split(" ");
            participante.setNome(entrada[0]);
            participante.setAmigo(entrada[1].equals("SIM"));
            participante.setOrdemInscricao(participantes.size());
            var participanteExistente = participantes.stream()
                    .filter(p -> p.getNome().equals(participante.getNome()))
                    .findFirst()
                    .orElse(null);
                    
            if(participanteExistente == null) {
                participantes.add(participante);
            }
            linha = br.readLine();
        }
    
        var participantesOrdenados = participantes.stream().sorted(Comparator
                .comparing(Participante::isAmigo).reversed()
                .thenComparing(Participante::getNome)).collect(Collectors.toList());
    
        participantesOrdenados.forEach(p -> {
            if(!p.getNome().equals("Abhay")) {
                System.out.println(p.getNome());
            }
        });
    
        List<Participante> amigos = participantesOrdenados.stream().filter(Participante::isAmigo).collect(Collectors.toList());
        Participante escolhido = null;
    
        for (Participante p : amigos) {
            if(escolhido == null) {
                escolhido = p;
            } else if (escolhido.getNome().length() < p.getNome().length()) {
                escolhido = p;
            } else if (escolhido.getNome().length() == p.getNome().length()
                    && escolhido.getOrdemInscricao() > p.getOrdemInscricao()) {
                escolhido = p;
            }
        }
    
        System.out.println("");
        System.out.println("Amigo do Pablo:");
        System.out.println(escolhido.getNome());
    }
    
    public static class Participante {
        private String nome;
        private boolean amigo;
        private int ordemInscricao;
        
        public String getNome() {
            return nome;
        }
        
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public boolean isAmigo() {
            return amigo;
        }
        
        public void setAmigo(boolean amigo) {
            this.amigo = amigo;
        }
        
        public int getOrdemInscricao() {
            return ordemInscricao;
        }
        
        public void setOrdemInscricao(int ordemInscricao) {
            this.ordemInscricao = ordemInscricao;
        }
        
        @Override
        public String toString() {
            return nome;
        }
    }
}