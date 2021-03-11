// Uniformes de final de ano

/* O professor Girafales organizou a confecção de um uniforme para as turmas da
escola para comemorar o final do ano. Após algumas conversas, ficou decidido
com os alunos que eles poderiam escolher a cor do uniforme entre branco ou
vermelho. Assim sendo, Girafales precisa de sua ajuda para organizar as listas
de quem quer o uniforme em cada uma das turmas, relacionando estas camisetas
pela cor, tamanho (P, M ou G) e por último pelo nome.

- Entrada

Cada caso de teste inicia com um valor N, (1 ≤ N ≤ 60) inteiro e positivo,
que indica a quantidade de uniformes a serem feitas para aquela turma. As
próximas N*2 linhas contêm informações de cada um dos uniformes (serão duas
  linhas de informação para cada uniforme). A primeira linha irá conter o
  nome do estudante e a segunda linha irá conter a cor do uniforme ("branco"
  ou "vermelho") seguido por um espaço e pelo tamanho do uniforme "P" "M" ou
  "G". A entrada termina quando o valor de N for igual a zero (0) e está valor
  não deverá ser processado.

- Saída

Para cada caso de entrada deverão ser impressas as informações ordenadas pela
cor em ordem ascendente, seguido pelos tamanhos em ordem descendente e por
último por ordem ascendente de nome, conforme o exemplo abaixo. */

const nUniformes = parseInt(gets());
let alunos = [];

while (true) {
  let nome = gets();

  if (parseInt(nome) === 0) break;
  let [cor, tamanho] = gets().split(' ');

  alunos = [...alunos, { nome, cor, tamanho }]
}

alunos
  .sort((a, b) => {
    for (let [testCase, sortCase] of [
      [a.cor > b.cor, 1],
      [a.cor < b.cor, -1],
      [a.tamanho > b.tamanho, -1],
      [a.tamanho < b.tamanho, 1],
      [a.nome > b.nome, 1],
      [a.nome < b.nome, -1],
    ]) {
      if (testCase) return sortCase;
    }
  })

alunos.map(({ nome, cor, tamanho }) => {
  console.log(`${cor} ${tamanho} ${nome}`);
})
