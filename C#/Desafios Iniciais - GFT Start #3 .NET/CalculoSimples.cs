// Cálculo Simples

/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor
unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor
unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

- Entrada

O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
respectivamente dois inteiros e um valor com 2 casas decimais.

- Saída

A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de
deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser
apresentado com 2 casas após o ponto.
*/

using System; 
 
class DIO{
  static void Main(string[] args) {
  	string[] input;
    input = Console.ReadLine().Split(' ');
    
    int cod1 = int.Parse(input[0]);
    int n1 = int.Parse(input[1]);
    double valor1 = double.Parse(input[2]);
    input = Console.ReadLine().Split(' ');
    
    int cod2 = int.Parse(input[0]);
    int n2 = int.Parse(input[1]);
    double valor2 = double.Parse(input[2]);
    double total = (n1 * valor1) + (n2 * valor2);
    
    Console.WriteLine("VALOR A PAGAR: R$ {0:F2}", total);
  }
}
