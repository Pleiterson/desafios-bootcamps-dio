// Tipo de Combustível

/*
Você recebeu desafio para determinar qual dos produtos é o preferêncial dos
clientes de um posto de abastecimento de combustível. Para isso você deve
escrever um algoritmo para ler o tipo de combustível abastecido (codificado da
seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um
código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código
(até que seja válido). O programa será encerrado quando o código informado for
o número 4.

•	Entrada

A entrada contém apenas valores inteiros e positivos.

•	Saída

Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que
abasteceram cada tipo de combustível, conforme exemplo.
*/

using System; 

class URI {
  static void Main(string[] args) { 
    int[] contador = new int[3];
    int codigo = 0;

    do {
      codigo  = Convert.ToInt32(Console.ReadLine());
      
      switch (codigo) {
        case 1:
          contador[0]++;
          break;
        case 2:
          contador[1]++;
          break;
        case 3:
          contador[2]++;
          break;  
        default:                        
          continue;
      }
    } while (codigo != 4);

    System.Console.WriteLine("MUITO OBRIGADO");
    System.Console.WriteLine("Alcool: " + contador[0]);
    System.Console.WriteLine("Gasolina: " + contador[1]);
    System.Console.WriteLine("Diesel: " + contador[2]);
  }
}