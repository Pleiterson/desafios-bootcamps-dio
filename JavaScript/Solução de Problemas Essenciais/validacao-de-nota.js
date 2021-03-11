// Validação de Nota

/* Para ajudar a calcular as notas referentes às duas avaliações dos alunos,
uma professora pediu para que você desenvolva um programa que calcule e imprima
a média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota
    válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada
    separadamente.

-Entrada

A entrada contém vários valores reais, positivos ou negativos. O programa deve
ser encerrado quando forem lidas duas notas válidas.

- Saída

Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = "
seguido do valor do cálculo. O valor deve ser apresentado com duas casas após
o ponto decimal */

let qtdeNotasValidas = 0;
let notas = [];
let cont = 0;

while(qtdeNotasValidas < 2) {
    cont++;
    const nota = parseFloat(gets());
    
    if (!nota) break;
    
    if (nota >= 0 && nota <= 10) {
        notas.push(nota)
        qtdeNotasValidas++;
    } else {
        console.log('nota invalida')
    }
}
const arraySum = arr => arr.reduce((acc, current) => acc + current)
const arrayMedia = arr => arraySum(arr) / arr.length

console.log("media = " + arrayMedia(notas).toFixed(2))