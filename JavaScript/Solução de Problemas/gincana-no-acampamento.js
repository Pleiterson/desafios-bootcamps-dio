// Gincana no Acampamento

/* Nas férias de dezembro, várias escolas se organizam e levam seus alunos para
um acampamento de férias por uma semana. Nestes acampamentos os alunos são
divididos em cabanas coletivos por gênero e idade, sempre com um adulto que,
além de dormir com o grupo na cabana, também são responsáveis por criar e
executar várias atividades, como por exemplo jogos, excursões, Gincanas
Noturnas, etc.

No primeiro dia foi realizada uma gincana em que a atividade constituía em
agrupar os alunos em um círculo (organizado no sentido anti-horário) do qual
seriam retiradas uma a uma até que sobrasse apenas um aluno, que seria o
vencedor.
No momento em que entra no círculo, cada aluno recebe uma pequena ficha que
contém um valor de 1 a 500. Depois que o círculo é formado, conta-se,
iniciando no aluno que está ao lado da primeira que entrou no círculo, o
número correspondente à ficha que o primeiro detém. O aluno onde o número
contado cair, deve ser retirado do grupo, e a contagem inicia novamente
segundo a ficha do aluno que acabou de ser eliminado. Para ficar mais
interessante, quando o valor que consta na ficha é par, a contagem é feita
no sentido horário e quando o valor que consta na ficha é ímpar, a contagem
é feita no sentido anti-horário.

Desenvolva um programa para que no próximo evento o responsável pela
brincadeira saiba previamente qual criança irá ser a vencedora de cada grupo,
com base nas informações fornecidas.

- Entrada

A entrada contém vários casos de teste. A primeira linha de cada caso de teste
contém um inteiro N (1 ≤ N ≤ 100), indicando a quantidade de alunos que farão
parte de cada círculo. Em seguida, as N linhas de cada caso de teste conterão
duas informações, o Nome e o Valor (1 ≤ Valor ≤ 500) que consta na ficha de
cada aluno, separados por um espaço, na ordem de entrada na formação do círculo
inicial.

OBS: O Nome de cada aluno não deverá ultrapassar 30 caracteres e contém apenas
letras maiúsculas e minúsculas, sem acentos, e o caractere “_”. O final da
entrada é indicado pelo número zero.

- Saída

Para cada caso de teste, deve-se apresentar a mensagem Vencedor(a): xxxxxx,
com um espaço após o sinal ":" indicando qual é o aluno do grupo que venceu
a brincadeira. */

while (true) {
    let nStudents = parseInt(gets());
  
    if (nStudents === 0) break;
    if (nStudents < 1 || nStudents > 100) {
      continue;
    }
  
    let students = [];
    let i = 0;
  
    while (i < nStudents) {
      let input = gets();
      let [name, value] = input.split(' ');
      
      i++;
  
      if (!(name.match(/^[A-Za-z_]{1,30}$/)) || !(1 <= value && value <= 500)) {
        continue;
      }
      students = [...students, { name, value }]
    }
  
    let winner = whoIsChampion(students);
    console.log(`Vencedor(a): ${winner}`);
  }
  
  function whoIsChampion(group, index = 0, removed = {}) {
    if (group.length === 1) return group[0].name;

    let nextIndex = undefined;
    let studentNumber = parseInt(removed.value) || parseInt(group[index].value);
  
    (studentNumber % 2 === 0) ? studentNumber *= -1 : studentNumber *= 1;
    const indexToRemove = crawlArray(group, index, studentNumber);
  
    [removed] = group.splice(indexToRemove, 1);
  
    if (removed.value % 2 === 0) {
      nextIndex = (indexToRemove > group.length - 1)
        ? 0
        : indexToRemove;
    } else {
      nextIndex = (indexToRemove > group.length - 1)
        ? group.length - 1
        : indexToRemove - 1;
    }
    return whoIsChampion(group, nextIndex, removed);
  }
  
  function crawlArray(array, index, n) {
    return ((index + n) % array.length + array.length) % array.length;
  }
  