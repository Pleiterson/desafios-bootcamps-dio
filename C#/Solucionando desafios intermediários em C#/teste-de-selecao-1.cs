// Teste de Seleção 1

/*
Leia 4 valores inteiros A, B, C e D. Com base nisso, se o valor de B for maior
do que de C e se D for maior do que A, e a soma de C com D for maior que a soma
de A e B e se tanto C quanto D forem positivos e, ainda, se a variável A for
par, escreva a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

- Entrada

Quatro números inteiros A, B, C e D.

- Saída

Imprima a mensagem corretamente esperada pela validação dos valores.
*/

using System; 

class minhaClasse {
  static void Main(string[] args) { 
    string [] selections = Console.ReadLine().Split(' ');
    int A = int.Parse(selections[0]);
    int B = int.Parse(selections[1]);
    int C = int.Parse(selections[2]);
    int D = int.Parse(selections[3]);

    if (B>C && D>A && C+D > A+B && C>0 && D>0 && (A % 2 == 0 )) {
      Console.WriteLine("Valores aceitos");
    } else {
      Console.WriteLine("Valores nao aceitos");
    }
  }
}