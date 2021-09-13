// Tipos de Triângulos

/*
Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de
modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de
triângulo que estes três lados formam, com base nos seguintes casos, sempre
escrevendo uma mensagem adequada:

•	se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
•	se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
•	se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
•	se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
•	se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
•	se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

•	Entrada

A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A),
B (0 < B) e C (0 < C).

•	Saída

Imprima todas as classificações do triângulo especificado na entrada.
*/

using System;

class Desafio {
  public static void Main() {
    string[] s = Console.ReadLine().Split(' ');
    double a = double.Parse(s[0]);
    double b = double.Parse(s[1]);
    double c = double.Parse(s[2]);
    double temp;

    if (a < b) { temp = a; a = b; b = temp; }
    if (a < c) { temp = a; a = c; c = temp; }
    if (b < c) { temp = b; b = c; c = temp; }

    if (a >= b + c)
      Console.WriteLine("NAO FORMA TRIANGULO");
    else if (a * a == b * b + c * c)
      Console.WriteLine("TRIANGULO RETANGULO");
    else if (a * a > b * b + c * c)
      Console.WriteLine("TRIANGULO OBTUSANGULO");
    else if (a * a < b * b + c * c)
      Console.WriteLine("TRIANGULO ACUTANGULO");
    if (a == b && a == c && b == c)
      Console.WriteLine("TRIANGULO EQUILATERO");
    else if (a == b || a == c || b == c)
      Console.WriteLine("TRIANGULO ISOSCELES");

    Console.ReadLine();
  }
}