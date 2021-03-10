// Notas e Moedas

/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa
]um valor monetário. A seguir, calcule o menor número de notas e moedas
possíveis no qual o valor pode ser decomposto. As notas consideradas são de
100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e
0.01. A seguir mostre a relação de notas necessárias.

- Entrada

O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

- Saída

Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor
inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
*/

using System; 
using System.Globalization;

class minhaClasse {
    static void Main(string[] args) { 
        decimal valor;

        valor = decimal.Parse(Console.ReadLine());

        Console.WriteLine("NOTAS:");
        Console.WriteLine("{0} nota(s) de R$ 100.00", (int) valor / 100);

        valor = valor % 100;
        Console.WriteLine("{0} nota(s) de R$ 50.00", (int) valor / 50);

        valor = valor % 50;
        Console.WriteLine("{0} nota(s) de R$ 20.00", (int) valor / 20);

        valor = valor % 20;
        Console.WriteLine("{0} nota(s) de R$ 10.00", (int) valor / 10);

        valor = valor % 10;
        Console.WriteLine("{0} nota(s) de R$ 5.00", (int) valor / 5);

        valor = valor % 5;
        Console.WriteLine("{0} nota(s) de R$ 2.00", (int) valor / 2);

        valor = valor % 2;
        valor = valor * 100;

        Console.WriteLine("MOEDAS:");
        Console.WriteLine("{0} moeda(s) de R$ 1.00", (int)valor / 100);

        valor = valor % 100;
        Console.WriteLine("{0} moeda(s) de R$ 0.50", (int)valor / 50);

        valor = valor % 50;
        Console.WriteLine("{0} moeda(s) de R$ 0.25", (int)valor / 25);

        valor = valor % 25;
        Console.WriteLine("{0} moeda(s) de R$ 0.10", (int)valor / 10);

        valor = valor % 10;
        Console.WriteLine("{0} moeda(s) de R$ 0.05", (int)valor / 5);

        valor = valor % 5;
        Console.WriteLine("{0} moeda(s) de R$ 0.01", (int)valor);
    }
}