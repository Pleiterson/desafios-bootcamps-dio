// Preenchimento de Vetor I

/*
Precisamos saber quanto uma determinada empresa deve pagar para seus
colaboradores, porém temos apenas a quantidade de horas trabalhadas e o valor
hora. Escreva um programa que leia o número de um colaborador, seu número de
horas trabalhadas, o valor que recebe por hora e calcula o salário desse
colaborador. Em seguida, apresente o número e o salário do colaborador, com
duas casas decimais.

- Entrada

Você receberá 2 números inteiros e 1 número com duas casas decimais,
representando o número, quantidade de horas trabalhadas e o valor que o
funcionário recebe por hora trabalhada.

- Saída

Exiba o número e o salário do colaborador, conforme exemplo abaixo, com um
espaço em branco antes e depois da igualdade. No caso do salário, também deve
haver um espaço em branco após o $.
*/

using System; 

class Program {
  static void Main(string[] args) { 
    int valorLido = int.Parse(Console.ReadLine());
    int[] n = new int[10];
    
    n[0] = valorLido;
    
    for (int i = 1; i < 10; ++i) {
      n[i] = n[i-1] * 2; 
    }

    for (int i = 0; i < 10; ++i) {
      Console.WriteLine($"N[{i}] = {n[i]}");
    }
  }
}