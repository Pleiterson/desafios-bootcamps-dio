// Tempo do Dobby

/* Para dar conta de toda a fabricação dos presentes de Natal, por várias vezes
os elfos precisam ficar até tarde trabalhando para que tudo possa ser terminado
a tempo.

Para melhor gerenciar seus cronogramas, os elfos estipularam quantos minutos
são necessários para fabricar cada presente.

Já está quase no final do expediente, e um dos elfos pediu sua ajuda.

Faltam N minutos para a hora de ir embora, e restam dois presentes para o elfo
Dobby fabricar. Ajude-o a descobrir se ele conseguirá fabricar os dois ainda
hoje, ou se deve deixar o trabalho para amanhã.

- Entrada

Cada caso de teste inicia com um inteiro N, indicando quantos minutos faltam
para o final do expediente (2 <= N <= 100).

Em seguida haverá dois inteiros A e B, indicando quantos minutos são
necessários para fabricar os dois presentes que Dobby precisa fabricar
(1 <= A, B <= 100).

- Saída

Imprima uma linha, contendo a frase "Farei hoje!" caso seja possível fabricar
os dois presentes antes do final do expediente, ou "Deixa para amanha!" caso
contrário. */

using System;

class TempoDoDobby {
    public static void Main (string[] args) {
    int n = int.Parse(Console.ReadLine());
    string[] texto = Console.ReadLine().Split(" ");
    int x = int.Parse(texto[0]), y = int.Parse(texto[1]);
    int calc = x + y;
    
    if (calc > n) {
      Console.Write("Deixa para amanha!");
    } else {
      Console.Write("Farei hoje!");
    }   
  }
}