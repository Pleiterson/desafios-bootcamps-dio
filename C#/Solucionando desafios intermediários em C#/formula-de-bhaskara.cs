// Fórmula de Bhaskara

/*
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de
Bhaskara. Se não for possível calcular as raízes, mostre a mensagem
correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de
número negativo.

- Entrada

Leia três valores de ponto flutuante (double) A, B e C.

- Saída

Se não houver possibilidade de calcular as raízes, apresente a mensagem
"Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5
dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo.
Imprima sempre o final de linha após cada mensagem.
*/

using System; 

class minhaClasse {
    static void Main(string[] args) { 
        double a, b, c, delta, r1, r2;
        string[] valor = Console.ReadLine().Split();

        a = Convert.ToDouble(valor[0]);
        b = Convert.ToDouble(valor[1]);
        c = Convert.ToDouble(valor[2]);
        delta = (Math.Pow(b, 2) - (4 * a * c));
        r1 = (-b + Math.Sqrt(delta)) / (2 * a);
        r2 = (-b - Math.Sqrt(delta)) / (2 * a);

        if (a != 0 && delta > 0) {
            Console.WriteLine($"R1 = {r1.ToString("F5")}");
            Console.WriteLine($"R2 = {r2.ToString("F5")}");
        } else {
            Console.WriteLine("Impossivel calcular");
        }
    }
}