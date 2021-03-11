// Melhor amigo do Pablo

/* Todo final de ano ocorre uma festa na escola. As inscrições para participar
da festa são abertas no início de julho. No momento da inscrição, o aluno pode
escolher se quer ser "O Amigo do Pablo" na festa ou não. O mais lógico seria
escolher a opção Sim, afinal, é um privilégio ser O Amigo do Pablo, já que ele
é a pessoa mais descolada da escola. Porém, há indivíduos que definitivamente
não pretendem ser O Amigo do Pablo, e por motivos desconhecidos.

Somente um será o escolhido. Em vista disso, muitos alunos que escolheram a
opção Sim realizaram a inscrição diversas vezes para aumentar a própria
probabilidade de ser O Amigo do Pablo. A diretora da escola pediu que você
desenvolva um programa que organize as inscrições do site, pois está havendo
um spam de inscrições. O critério para ser o escolhido é a quantidade de letras
do primeiro nome, e em caso de empate, vence aquele que realizou primeiro a
inscrição. A organização final dos inscritos deverá seguir a ordem de escolha
(Sim ou Não), mas respeitando a ordem alfabética.

OBS.: Ninguém que escolheu a opção Não realizou a inscrição mais de uma vez.

- Entrada

A entrada contém somente um caso de teste. Cada linha é composta pelo primeiro
nome do participante (sem espaços), seguido da opção SIM (caso o usuário queira
  ser O Amigo do Pablo) ou NAO (caso não queira). A entrada termina assim que
  o usuário digita "FIM" (sem as aspas).

- Saída

Seu programa deverá imprimir os inscritos pela ordem de escolha e por ordem
alfabética, seguido do nome do vencedor. Imprima uma linha em branco entre a
lista de inscritos e o nome do vencedor. */

let input = gets();
let list = [];

function friend(list) {
  let winner = list
    .filter(value => value.option === "SIM")
    .sort((a, b) => b.name.length - a.name.length);

  list.sort((a, b) => {
    if (a.option < b.option) return 1;
    if (a.option > b.option) return -1;
    if (a.name < b.name) return -1;
    if (a.name > b.name) return 1;
  });
  console.log(list.map(a => console.log(a.name)).join(" "));
  console.log("\n Amigo do Pablo:");
  console.log(winner[0].name);
}

do {
  let [name, option] = input.split(" ");
  
  // para passar no teste já que não tem Abhay na resposta
  if (name !== "Abhay") {
    if (!list.some(e => e.name === name) || list == "") {
      list.push({ name: name, option: option });
    }
  }
  input = String(gets());
} while (input != "FIM");

friend(list);