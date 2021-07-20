// Média 3

/*
Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal,
correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4 e
1, respectivamente, para cada uma destas notas e mostre esta média acompanhada
pela mensagem "Media: ". Se esta média for maior ou igual a 7.0, imprima a
mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0, imprima a
mensagem "Aluno reprovado.". Se a média calculada for um valor entre 5.0 e 6.9,
inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".
No caso do aluno estar em exame, leia um valor correspondente à nota do exame
obtida pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela
nota digitada. Recalcule a média (some a pontuação do exame com a média
anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado."
(caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média
tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou reprovado após
ter pego exame) apresente na última linha uma mensagem "Media final: " seguido
da média final para esse aluno.

- Entrada

A entrada contém quatro números de ponto flutuante correspondentes as notas dos
alunos.

- Saída

Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens
devem ser impressas conforme a descrição do problema. Não esqueça de imprimir
o enter após o final de cada linha, caso contrário obterá "Presentation Error".
*/

using System;

namespace Start {
  class Program {
    static void Main(string[] args) {
      double a, b, c, d, avg;
      string[] values = Console.ReadLine().Split(' ');
      
      a = double.Parse(values[0])*2;
      b = double.Parse(values[1])*3;
      c = double.Parse(values[2])*4;
      d = double.Parse(values[3])*1;
      
      avg = (a + b + c + d) / 10;
      Console.WriteLine("Media: " + avg.ToString("0.0"));
      
      if (avg >= 7) {
        Console.WriteLine("Aluno aprovado.");
      } else if (avg < 5) {
        Console.WriteLine("Aluno reprovado.");
      } else if (avg >= 5 && avg <= 6.9) {
        double e = double.Parse(Console.ReadLine());
        
        Console.WriteLine("Aluno em exame.");
        Console.WriteLine("Nota do exame: " + e.ToString("0.0"));
        avg = (avg + e) / 2;
        
        if (avg >= 5) {
          Console.WriteLine("Aluno aprovado.");
        } else {
          Console.WriteLine("Aluno reprovado");
        }
        Console.WriteLine("Media final: " + avg.ToString("0.0"));
      }
      Console.ReadKey();
    }
  }
}