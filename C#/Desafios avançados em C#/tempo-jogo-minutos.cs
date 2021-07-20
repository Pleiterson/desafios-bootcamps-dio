// Tempo de Jogo com Minutos

/*
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo.
A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

- Entrada

Quatro números inteiros representando a hora de início e fim do jogo.

- Saída

Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
*/

using System;

class Program {
  public static void Main() {
    int horaInicial, minInicial, horaFinal, minFinal, duracaoHora, duracaoMin;
    string[] s = Console.ReadLine().Split(' ');
    
    horaInicial = int.Parse(s[0]);
    minInicial = int.Parse(s[1]);
    horaFinal = int.Parse(s[2]);
    minFinal = int.Parse(s[3]);
    duracaoHora = duracaoMin = 0;
    
    if ((horaFinal > horaInicial && minFinal >= minInicial) ||
        (horaFinal >= horaInicial && minFinal > minInicial)) {
      duracaoHora = horaFinal - horaInicial;
      duracaoMin = minFinal - minInicial;
    } else if (horaFinal == horaInicial && minFinal == minInicial) {
      duracaoHora = 24;
      duracaoMin = 0;
    } else if (horaFinal == horaInicial && minFinal < minInicial) {
      duracaoHora = 23;
      duracaoMin = minFinal + (60 - minInicial);
    } else if (horaFinal > horaInicial && minFinal < minInicial) {
      duracaoHora = horaFinal - horaInicial - 1;
      duracaoMin = minFinal + (60 - minInicial);
    } else if (horaFinal < horaInicial && minFinal < minInicial) {
      duracaoHora = horaFinal + (24 - horaInicial) - 1;
      duracaoMin = minFinal + (60 - minInicial);
    } else if (horaFinal < horaInicial && minFinal >= minInicial) {
      duracaoHora = horaFinal + (24 - horaInicial);
      duracaoMin = minFinal - minInicial;
    }
    
    Console.WriteLine("O JOGO DUROU {0} HORA(S) E {1} MINUTO(S)", duracaoHora, duracaoMin);
    Console.ReadLine();
  }
}