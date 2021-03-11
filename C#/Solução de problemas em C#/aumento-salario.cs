// Aumento de Salário

/*
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de
acordo com a tabela abaixo:

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o
valor de reajuste ganho e o índice reajustado, em percentual.

- Entrada

A entrada contém apenas um valor de ponto flutuante, que pode ser maior ou
igual a zero, com duas casas decimais.

- Saída

Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o
percentual de reajuste ganho, conforme exemplo abaixo.
*/

using System; 

class minhaClasse {
  static void Main(string[] args) { 
    double salario = 0.00;
    double reajuste = 0.00;
    double novoSalario = 0.00;
    double percentual = 0.00;

    salario = Convert.ToDouble(Console.ReadLine());
      
    if(salario < 0.00) {
      return;
    } else if (salario <= 400.00) {
      percentual = 0.15;
      reajuste = salario * percentual;
      novoSalario = salario + reajuste;
    } else if (salario <= 800.00) {
      percentual = 0.12;
      reajuste = salario * percentual;
      novoSalario = salario + reajuste;
    } else if (salario <= 1200.00) {
      percentual = 0.10;
      reajuste = salario * percentual;
      novoSalario = salario + reajuste;
    } else if (salario <= 2000.00) {
      percentual = 0.07;
      reajuste = salario * percentual;
      novoSalario = salario + reajuste;
    } else {
      percentual = 0.04;
      reajuste = salario * percentual;
      novoSalario = salario + reajuste;
    }
      
    Console.WriteLine("Novo salario: {0:0.00}", novoSalario);
    Console.WriteLine("Reajuste ganho: {0:0.00}", reajuste);
    Console.WriteLine("Em percentual: {0} %", percentual * 100.00);
  }
}