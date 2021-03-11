// Notas da Prova

/* Norminia é uma professora e pesquisadora renomada de uma famosa Universidade
do Brasil, com inúmeras prêmiações e reconhecimento internacional pelo seu
trabalho. Recentemente, Norminia foi convidada para ministrar aulas em uma
Universidade da Alemanhã. Mesmo falando muito bem a Língua alemã, Norminia
ficou um pouco apreensiva com a responsabilidade, mas resolveu aceitar a
proposta e encará-la como um bom desafio.

Os estudantes adoraram a metodologia de ensino de Norminia e tudo estava indo
super bem, até o momento da aplicação da sua primeira prova. Acostumada a dar
notas de 0 (zero) a 100 (cem), ela fez o mesmo na primeira prova da sua turma
da Alemanhã. No entanto, os estudante acharam estranho, uma vez que na Alemanhã
o sistema de notas é diferente: as notas devem ser dadas como conceitos de A a
E. O conceito A é o mais alto, enquanto o conceito E é o mais baixo.

Conversando com outros docentes, ela recebeu a sugestão de utilizar a seguinte
tabela, relacionando as notas numéricas com as notas de conceitos:

O problema é que Norminia já deu as notas no sistema numérico, e terá que
converter as notas para o sistema de letras. No entanto, Norminia precisa
preparar as próximas atividades educacionais para os seus alunos, e não tem
tempo suficiente para fazer a conversão das notas manualmente.

Você terá o seguinte desafio: escrever um programa que recebe uma nota no
sistema numérico e determina o conceito correspondente.

Entrada
A entrada contém um único conjunto de testes, que deve ser lido do dispositivo
de entrada padrão (normalmente o teclado). A entrada contém uma única linha com
um número inteiro N (0 ≤ N ≤ 100), representando uma nota de prova no sistema
numérico.

Saída
Seu programa deve imprimir, na saída padrão, uma letra (A, B, C, D, ou E em
maiúsculas) representando o conceito correspondente à nota dada na entrada.
*/

import java.util.Scanner;

public class NotasDaProva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota = input.nextInt();

        if (nota == 0) {
            System.out.println('E');
        } else if (nota >= 1 && nota <= 35) {
            System.out.println('D');
        } else if (nota >= 36 && nota <= 60) {
            System.out.println('C');
        } else if (nota >= 61 && nota <= 85) {
            System.out.println('B');
        } else if (nota >= 86 && nota <= 100) {
            System.out.println('A');
        }
    
        input.close();
    }
}