// Produto e divisão

/* Você tem a obrigação de testar as calculadores, para que façam apenas
operações de multiplicação e divisão. Além disso, o termo a ser digitado em
cada operação, (o número exibido no visor que será dividido ou multiplicado),
só pode conter um único dígito.

Quando ligada, a calculadora exibe o número 1. Após isso, o usuário pode
digitar um número com um único dígito e escolher se esse número deve
multiplicar ou dividir o número exibido anteriormente; o resultado da operação
escolhida é então exibido na calculadora. Pode-se repetir esse processo quantas
vezes quiser.

Apesar de ser permitido apenas números inteiros de um dígito, a calculadora
permite exibir números com múltiplos dígitos e até mesmo números fracionários.

Apresentada a sequência de operações realizadas logo depois de ligada, seu
objetivo é conferir o resultado exibido.

No primeiro caso de teste abaixo, o usuário deseja calcular o resultado da
seguinte expressão: 1 × 2 × 1 × 3. Note que a primeira ocorrência do número 1
vem do fato da calculadora mostrar inicialmente 1 ao invés de 0.

No segundo caso de teste abaixo, o usuário deseja calcular o resultado da
seguinte expressão: ((1/2)/3) × 6.

- Entrada

A primeira e única linha da entrada contém um inteiro N (1 ≤ N ≤ 100 000).
Cada uma das próximas N linhas contém um dígito e um caractere '*' ou '/',
que representam uma operação realizada na calculadora.

- Saída

O programa deve imprimir uma única linha contendo o resultado que deve ser
exibido pela calculadora ao final de todas as operações. */

let input, number1, number2, operator, result;
const regexInput = /^([0-9]) *([*/])/

const doMath = {
  '/': (a, b) => {
    a = Number(a)
    b = Number(b)
    return parseFloat(a / b)
  },
  '*': (a, b) => {
    if (Number(a) * Number(b) >= Number.MAX_SAFE_INTEGER) {
      a = BigInt(a)
      b = BigInt(b)
      return a * b
    }
    return a * b
  }
}

while (true) {
  number1 = 1
  number2 = undefined
  result = undefined
  input = undefined
  operator = undefined
  nOperators = parseInt(gets())

  if (!nOperators || nOperators === '' || nOperators < 1 || nOperators > 100000) break;

  for (let index = 0; index < nOperators; index++) {
    input = gets();

    if (!input.match(regexInput)) continue;
    [str, number2, operator] = input.match(regexInput);

    if (number2 === undefined || (number2 == 0 && operator === '/')) continue;
    result = doMath[operator](number1, number2)
    number1 = result
  }

  if (result === undefined) { console.log(number1); continue; }
  console.log(typeof result == 'bigint' ? result.toString() : parseInt(result))
}