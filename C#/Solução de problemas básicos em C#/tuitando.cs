// Tuitando

/*
O microblog Twitter é conhecido por limitar as postagens em 140 caracteres.
Conferir se um texto vai caber em um tuíte é sua tarefa.

- Entrada

A entrada é uma linha de texto T (1 ≤ |T| ≤ 500).

- Saída

A saída é dada em uma única linha. Ela deve ser "TWEET" (sem as aspas) se a
linha de texto T tem até 140 caracteres. Se T tem mais de 140 caracteres, a
saída deve ser "MUTE".
*/

using System; 

class minhaClasse {
    static void Main(string[] args) { 
        string v = Console.ReadLine();
        char[] arr = v.ToCharArray();
        
        if( arr.Length <= 140 )
            Console.WriteLine("TWEET");
        else
            Console.WriteLine("MUTE");
    }
}