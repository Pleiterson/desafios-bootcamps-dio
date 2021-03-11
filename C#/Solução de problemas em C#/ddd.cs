// DDD

/*
Leia um número inteiro que representa um código de DDD para discagem
interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando
a tabela abaixo:

Se a entrada for qualquer outro DDD que não esteja presente na tabela acima,
o programa deverá informar:
DDD nao cadastrado

- Entrada

A entrada consiste de um único valor inteiro.

- Saída

Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima
DDD nao cadastrado caso não existir DDD correspondente ao número digitado.
*/

using System; 

class minhaClasse {
    static void Main(string[] args) { 
        int ddd = Convert.ToInt32(Console.ReadLine());
        
        switch (ddd) {
            case 61:
                Console.WriteLine("Brasilia");
                break;
            case 71:
                Console.WriteLine("Salvador");
                break;
            case 11:
                Console.WriteLine("Sao Paulo");
                break;
            case 21:
                Console.WriteLine("Rio de Janeiro");
                break;
            case 32:
                Console.WriteLine("Juiz de Fora");
                break;
            case 19:
                Console.WriteLine("Campinas");
                break;
            case 27:
                Console.WriteLine("Vitoria");
                break;
            case 31:
                Console.WriteLine("Belo Horizonte");
                break;
            default:
                Console.WriteLine("DDD nao cadastrado");
                break;
        }
    }
}