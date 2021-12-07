// Guilherme e suas Pipas

/*
Guilherme adora brincar com pipas, pipas de várias cores, formas e tamanhos.
Ele tem percebido que para as pipas possuírem maior estabilidade, e dessa forma
voarem mais alto, elas devem possuir um barbante bem esticado ligando todos os
pares de pontas não vizinhas.

Apesar de ser uma criança bastante criativa e astuta, Guilherme não sabe como
determinar a quantidade de barbantes que ele terá que utilizar para tornar uma
pipa de n lados, estável. Você pode ajudá-lo?.

- Entrada

A entrada será composta por uma única linha, que contém um inteiro 3 ≤ n ≤ 105,
representando o número de lados da pipa.

- Saída

Imprima um número inteiro, que será a quantidade de barbantes que Guilherme
terá que utilizar para tornar a pipa de n lados estável.
*/

using System; 
 
class TESTE {
  static void Main(string[] args) { 
    long N = long.Parse(Console.ReadLine());
    long resposta = (N * (N - 3)) / 2;
    
    Console.WriteLine(resposta);
  }
}