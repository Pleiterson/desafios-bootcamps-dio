// Pedra, Papel, Tesoura, Lagarto e Spock

/* Pedra-papel-tesoura-lagarto-Spock é uma expansão do clássico método de
seleção em jogo de pedra-papel-tesoura. Atua sob o mesmo princípio básico,
mas inclui outras duas armas adicionais: o lagarto (formado pela mão igual a
  uma boca de fantoche) e Spock (formada pela saudação dos vulcanos em Star
    Trek). Isso reduz as chances de uma rodada terminar em um empate. O jogo
    foi inventado por Sam Kass e Karen Bryla, como "Rock Paper Scissors Lizard
    Spock". As regras de vantagem são as seguintes:

•	Tesoura corta papel
•	Papel cobre pedra
•	Pedra derruba lagarto
•	Lagarto adormece Spock
•	Spock derrete tesoura
•	Tesoura prende lagarto
•	Lagarto come papel
•	Papel refuta Spock
•	Spock vaporiza pedra
•	Pedra quebra tesoura

Um dia, duas amigas, Fernanda e Marcia, decidiram apostar quem pagaria um
almoço para o outro, com esta brincadeira. Sua missão será fazer um algoritmo
que, baseado no que eles escolherem, informe quem irá ganhar ou se dará empate.

- Entrada

Haverá diversos casos de teste. O primeiro número a ser lido será um inteiro,
representando a quantidade de casos de teste. Cada caso de teste tem duas
palavras, representando a escolha de Fernanda e de Marcia, respectivamente.

- Saída

Para cada caso de teste, imprima quem venceu, ou se houve empate. */

class Weapon {
    static tesoura = ['papel', 'lagarto']
    static papel = ['pedra', 'spock']
    static pedra = ['lagarto', 'tesoura']
    static lagarto = ['papel', 'spock']
    static spock = ['tesoura', 'pedra']
  
    static fight(oneWeapon, anotherWeapon) {
      if (!Weapon[oneWeapon] || !Weapon[anotherWeapon]) {
        return 'Bring valid weapons to the fight!'
      }
  
      if (oneWeapon === anotherWeapon) {
        return 'empate'
      }
  
      if (Weapon[oneWeapon].includes(anotherWeapon)) {
        return oneWeapon
      }
  
      return anotherWeapon
    }
  }
  
  class Player {
    constructor(name) {
      this._name = name
      this._weapons = []
    }
  
    get name() {
      return this._name
    }
  
    get weapons() {
      return this._weapons
    }
  
    set weapons(weapon) {
      this._weapons = [...this._weapons, weapon]
    }
  
  
    against(anotherPlayer) {
      const results = []
  
      for (let i = 0; i < this.weapons.length; i++) {
        const result = Weapon.fight(this.weapons[i], anotherPlayer.weapons[i])
  
        if (result === 'invalid weapons') results.push(result);
        else if (result === 'empate') results.push(result)
        else {
          results.push(
            result === this.weapons[i]
              ? this.name
              : anotherPlayer.name
          )
        }
      }
  
      return results
    }
  }
  
  let nCases = '';
  const Fernanda = new Player('fernanda')
  const Marcia = new Player('marcia')
  
  while (true) {
    nCases = gets()
  
    if (!nCases || nCases === '' || nCases <= 0) break;
  
    for (let i = 1; i <= nCases; i++) {
      [Fernanda.weapons, Marcia.weapons] = gets().split(' ')
    }
  
    Fernanda.against(Marcia).forEach(res => console.log(res))
  }
  