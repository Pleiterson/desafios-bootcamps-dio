Rafael, Michelangelo, Leonardo e Donatello são tartarugas mutantes com superpoderes que adoram pizza. Certo dia, após lutarem contra criminosos nos esgotos de Nova Iorque,
resolveram pedir uma pizza. Quando a pizza chegou perceberam que ela havia sido mal cortada, o que gerou uma briga entre eles para saber quantos pedaços cada um comeria. 
Ajude as tartarugas ninja escrevendo um programa que a partir de um dado o número de cortes retorna o número máximo de fatias possíveis.
Exemplo 1:
Entrada	Saída
2	4
Exemplo 2:
Entrada	Saída
3	7

// IMPORTANTE: As funções "gets" e "print" são acessíveis globalmente, onde: 
// - "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
// - "print": imprime um texto de saída (output) e pula uma linha ("\n") automaticamente;

function findMaximumPieces(n) { 
        return 1 + n * (n + 1) / 2; 
} 

let valor = gets() 

//TODO: Imprima o valor usando a função (utilizando -> função(valor)) alterando, enquanto transforma o valor em um inteiro.
print(findMaximumPieces(parseInt(valor)))
