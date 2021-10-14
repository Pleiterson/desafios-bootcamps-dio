// Nome no Formulário

/*
Preencher formulários é uma tarefa simples. Mas é preciso conferir se o espaço
reservado para os dados é suficiente.

Sua tarefa é, dada uma linha de texto, indicar se ele cabe ou não cabe em um
formulário com 80 caracteres.

- Entrada

A entrada é uma linha de texto L (1 ≤ |L| ≤ 500).

- Saída

A saída é dada em uma única linha. Ela deve ser "YES" (sem as aspas) se a
linha de texto L tem até 80 caracteres. Se L tem mais de 80 caracteres, a
saída deve ser "NO".
*/

let nome = gets();
console.log(nome.length > 80 ? "NO" : "YES");