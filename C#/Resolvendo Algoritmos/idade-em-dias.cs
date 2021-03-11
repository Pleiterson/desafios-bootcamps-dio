// Idade em Dias

/* Você terá o desafio de ler um valor inteiro correspondente à idade de uma
pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo
mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12
meses e alguns dias, como 360, 363 ou 364. 

- Entrada

O arquivo de entrada contém um valor inteiro.

- Saída

Imprima a saída conforme exemplo fornecido. */

using System;

class IdadeEmDias {
  public static void Main (string[] args) {  
    var idadeEmDias = int.Parse(Console.ReadLine());
    var anos = (idadeEmDias / 365); 
    var meses = (idadeEmDias % 365) / 30; 
    var dias =  (idadeEmDias % 365) % 30;

    Console.WriteLine($"{anos} ano(s)\n{meses} mes(es)\n{dias} dia(s)");
  }
}