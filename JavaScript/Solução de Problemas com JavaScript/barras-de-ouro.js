// Barras de ouro

/* O feudo da Mesopotâmia é rico e o povo é cordial e alegre. Mas quando o
assunto são impostos, é praticamente um roubo. Todo final de ano, cada feudo
do país deve pagar uma determinada quantidade de quilos de ouro em impostos.
Quando é chegado o momento de coletar os impostos, o Rei envia sua carruagem
real para recolher o ouro devido, usando as estradas do reino.

Cada estrada liga dois feudos diferentes e podem ser percorridos em duas
direções. Com as estradas é possível ir de um feudo a outro, possivelmente
passando por feudos intermediários. Mas há apenas um caminho entre dois feudos
diferentes.

Em cada feudo há um cofre real, utilizado para armazenamento do ouro de
impostos. Os cofres reais são imensos, de forma que cada cofre tem capacidade
de armazenar todo o ouro devido por todo o reino. A carruagem sai do feudo
principal, percorrendo as estradas do reino, visitando os feudos para recolher
o ouro devido, podendo usar qualquer cofre real para armazenar temporariamente
uma parte do imposto recolhido, se necessário. Ao final da coleta, todo o ouro
devido por todas os feudos devem estar armazenados no cofre real do feudo
principal.

José como é o Rei, contratou o seu time para, dados a quantidade de ouro a ser
recolhido em cada feudo (em kg), a lista das estradas do reino, com os
respectivos comprimentos (em km) e a capacidade de carga da carruagem real
(em kg), determine qual é a mínima distância que a carruagem deve percorrer
para recolher todo o ouro devido.

- Entrada

A primeira linha contém dois inteiros N e C indicando respectivamente o número
de cidades e a capacidade de carga da carruagem (2 ≤ N ≤ 104 e 1 ≤ C ≤ 100).
O feudo principal é identificado pelo número 1 e os outros feudos são
identificadas por inteiros de 2 a N . A segunda linha contém N inteiros Ei
representando a quantidade de imposto devido por cada feudo i (0 ≤ Ei ≤ 100
  para 1 ≤ i ≤ N ). Cada uma das N-1 linhas seguintes contém três inteiros A,
  B e C , indicando que uma estrada liga o feudo A e o feudo B (1 ≤ A, B ≤ N )
  e tem comprimento C (1 ≤ C ≤ 100).

- Saída

Seu programa deve produzir uma única linha com um inteiro representando a menor
distância que a carruagem real deve percorrer para recolher todo o imposto
devido, em km. */

(() => {
    let input = '';
    let taxToPay;
    let routes, visited, previousRoutes;
  
    input = gets();
  
    if (!input || input === '') return false;
  
    const [nCities, cargo] = input.match(/\d+/g);
  
    taxToPay = gets().match(/\d+/g);
  
    if (taxToPay.length > nCities || taxToPay.length < 1) return false;
    taxToPay = taxToPay.map(v => parseInt(v));
  
    if (taxToPay.some(v => (v < 0 || v > 100))) return false;
    taxToPay.unshift(0);
  
    visited = Array.from(new Array(1 * nCities + 1), v => false);
    previousRoutes = Array.from(new Array(1 * nCities + 1), v => 0);
    routes = Array.from(new Array(1 * nCities + 1), v => [])
  
    for (let index = 1; index < nCities; index++) {
      let [from, to, distance] = gets().match(/\d+/g);
  
      if (distance < 1 || distance > 100) return false;
  
      routes[from].push({ to: to * 1, distance: distance * 1 });
      routes[to].push({ to: from * 1, distance: distance * 1 });
    }
  
    let fiefdom = 1;
    let stack = [];
    let nodes = [];
  
    stack = [...stack, fiefdom];
    visited[fiefdom] = true;
    previousRoutes[fiefdom] = -1;
  
    while (stack.length > 0) {
      let v = stack.pop();
  
      for (const route of routes[v]) {
        if (visited[route.to]) continue;
  
        visited[v] = true;
        previousRoutes[route.to] = v
        stack = [...stack, route.to];
      }
  
      if (v !== 1) {
        nodes = [...nodes, v]
      }
    }
  
    let totalDistance = Number(0);
  
    while (nodes.length > 0) {
      let d = -1;
      let v = nodes.pop();
  
      for (let index = 0; index < routes[previousRoutes[v]].length; ++index) {
        const route = routes[previousRoutes[v]][index];
  
        if (route.to === v) {
          d = route.distance;
          break;
        }
      }
      let mover = Number(0);
  
      mover = Math.ceil(parseFloat(Number(taxToPay[v]) / Number(cargo))) * (2 * Number(d));
      totalDistance += mover;
      taxToPay[previousRoutes[v]] += taxToPay[v];
    }
    console.log(totalDistance.toString());
  })();