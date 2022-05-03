using System;

namespace DIO
{
	class Program
	{
		static void Main(string[] args)
		{
			int ValorTotal, NotaAtual, QuantidadeDeNotas, ValorRestante;

			ValorTotal = int.Parse(Console.ReadLine());
			Console.WriteLine(ValorTotal);
      int[] Notas = {100, 50, 20, 10, 5 , 2 , 1};
			ValorRestante = ValorTotal;
			int contador = 0;
			do  {
			  NotaAtual = Notas[contador];
			  QuantidadeDeNotas = ValorRestante / NotaAtual;
			  Console.WriteLine($"{QuantidadeDeNotas} nota(s) de R$ {NotaAtual},00");
			  ValorRestante = ValorRestante % NotaAtual;
			  contador = contador + 1;
			} while (contador < Notas.Length);
			}
		}
	}
