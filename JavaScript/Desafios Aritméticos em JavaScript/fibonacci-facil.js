// Fibonacci Fácil

/*
A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série
de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à
soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e
mostre os N primeiros números dessa série.

•	Entrada

O arquivo de entrada contém um valor inteiro N (0 < N < 46).

•	Saída

Os valores devem ser mostrados na mesma linha, separados por um espaço em
branco. Não deve haver espaço após o último valor.
*/

const input = parseInt(gets());

const fib = n => {
  if (n <= 1) {
    return [0, 1];
  } else {
    const s = fib(n-1);
    s.push(s[s.length - 1] + s[s.length - 2]);
    return s;
  }
};

if (input === 1){
  console.log('0')
}
else if (input > 0 && input < 46){
  const index = Number(input) - 1;
  const sequence = fib(index).join(" ");
  console.log(sequence);
}