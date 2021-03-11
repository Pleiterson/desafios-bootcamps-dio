// Conversão de Tempo

/* Você terá o desafio de ler um valor inteiro, que é o tempo de duração em
segundos de um determinado evento em uma loja, e informe-o expresso no formato
horas:minutos:segundos.

- Entrada

O arquivo de entrada contém um valor inteiro N.

- Saída

Imprima o tempo lido no arquivo de entrada (segundos), convertido para
horas:minutos:segundos, conforme exemplo fornecido. */

using System;

class ConversaoDeTempo {
    static void Main(string[] args) {
        var tempo = int.Parse(Console.ReadLine());
        var horas = (tempo / 3600); 
        var minutos = (tempo % 3600) / 60; 
        var segundos =  (tempo % 3600) % 60;

        Console.WriteLine($"{horas}:{minutos}:{segundos}");
    }
}