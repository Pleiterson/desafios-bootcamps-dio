// Quadrado e ao Cubo

/* Você terá o desafio de escrever um programa que leia um valor inteiro
N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão
apresentadas na execução do programa.

- Entrada

O arquivo de entrada contém um número inteiro positivo N.

- Saída

Imprima a saída conforme o exemplo fornecido. */

using System;

class Desafio {
  static void Main() {
    var numero = Int32.Parse(Console.ReadLine());
        
    if(numero != null) {
      for(int i = 1; i <= numero; i++) {
        var numeros = $"{i} {i * i} {i * i * i}";
        
        Console.WriteLine(numeros);
      }
    } else {
        Console.WriteLine("Insira um número!");
    }
  }
}