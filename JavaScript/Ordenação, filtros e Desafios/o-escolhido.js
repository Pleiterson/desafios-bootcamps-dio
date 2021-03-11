// O Escolhido

/* As aulas do Prof. Xavier estão dando o que falar até no exterior, pois ele
ensina Algoritmos de um jeito diferente aos seus alunos. Uma universidade dos
EUA, que soube sobre o método do Prof. Xavier, quer selecionar um aluno para
um intercâmbio no país. Para isso, ele possui uma lista de inscrição com o
número de cada aluno e sua nota. 

Para ajudá-los a encontrarem o melhor aluno que ganhará o intercâmbio, você
deve desenvolver um programa. Só tem um detalhe, se a nota mais alta não for
maior ou igual a 8, você deverá imprimir “Minimum note not reached”.

- Entrada

O arquivo contém primeiro a quantidade de alunos (3 <= n <= 100) existentes
e em seguida, os n alunos contendo o número da matrícula (0 < m < 1000000) de
cada um, seguido da respectiva nota (0 <= nota <= 10.0, com 1 casa decimal).

Obs.: as notas não serão repetidas. Ou seja, não tem chance de ter dois alunos
com a mesma nota.

- Saída

Você deve imprimir o número do estudante que obteve a maior pontuação ou
"Minimum note not reached" (sem aspas) caso nenhum estudante tenha tirado uma
nota maior ou igual a 8. */

let n = parseInt(gets());
let arrMat = Array(n);
let arrNot = Array(n);

for (i = 0; i < n; i++) {
    let line = gets().split(' ');
    arrMat[i] = parseInt(line[0]);
    arrNot[i] = parseFloat(line[1]);
}

let maior = 0;
var max = arrNot.reduce(function(a, b) {
    return Math.max(a, b);
});

for (i = 0; i < n; i++) {
    if (max < 8) {
        console.log('Minimum note not reached');
        
        break;
    } else if (arrNot[i] === max) {
        console.log(arrMat[i]);
    }
}
