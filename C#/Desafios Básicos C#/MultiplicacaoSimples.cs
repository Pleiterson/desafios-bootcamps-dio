// Multiplicação Simples

/*
Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o
produto entre estes dois valores. Atribua esta operação à variável PROD,
mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).   

- Entrada

A entrada contém 2 valores inteiros.

- Saída

Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço
em branco antes e depois da igualdade.
*/

using System;

class Program {
  static void Main(string[] args) {
    int a, b;
    
    a = Convert.ToInt32(Console.ReadLine());
    b = Convert.ToInt32(Console.ReadLine());
    
    Console.WriteLine("PROD = " + (a * b));
    Console.ReadLine();
  }
}