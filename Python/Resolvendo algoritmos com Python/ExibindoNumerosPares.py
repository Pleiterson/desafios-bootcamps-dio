# Exibindo Números Pares

# Crie um programa que leia um número e mostre os números pares até esse
# número, inclusive ele mesmo.

# •	Entrada

# Você receberá 1 valor inteiro N, onde N > 0.

# •	Saída

# Exiba todos os números pares até o valor de entrada, sendo um em cada linha.

import sys

a = int(sys.stdin.readline())

for i in range(2, a + 2, 2):
  if (i % 2 == 0) and (i <= a):
    print(i)