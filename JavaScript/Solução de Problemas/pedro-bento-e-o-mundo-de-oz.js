// Pedro Bento e o Mundo de OZ

/* No jogo, O Mundo de Oz, Pedro Bento é o líder do Tribunal, por causa disso
ele é uma das pessoas mais importantes do mundo, no jogo. Além disso, Pedro
Bento possui um grande tesouro, o qual possui diversos tipos de jóias.
Pedro Bento está muito curioso para saber quantos tipos de jóias diferentes
seu tesouro possui.

Sabendo que você é o melhor programador do mundo, Pedro Bento te contratou para
verificar quantos tipos de jóias distintas ele tem em seu tesouro.

- Entrada

A entrada consiste de várias linhas e cada uma contém uma string que descreve
uma das jóias de Pedro Bento. Essa string é composta apenas dos caracteres
'(' e ')', a soma do tamanho de todas as strings não excede 106.

- Saída

Imprima quantos tipos de jóias distintas Pedro Bento possui. */

let jewels = [];

while(true) {
    let input = gets();
    
    if(!input) {
        break;
    }
    let find = jewels.find(el => el == input);
  
    if(!find) {
        jewels.push(input);
    }
}

console.log(jewels.length);
