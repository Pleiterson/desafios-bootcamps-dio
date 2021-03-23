# Fibonacci Fácil

# A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série
# de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à
# soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e
# mostre os N primeiros números dessa série.

# - Entrada

# O arquivo de entrada contém um valor inteiro N (0 < N < 46).

# - Saída

# Os valores devem ser mostrados na mesma linha, separados por um espaço em
# branco. Não deve haver espaço após o último valor.

n = gets.strip.to_i
resultado = ""
soma = 0
ant = 0
prox = 1

0.upto(n-1) do |num|
  
	if num == 0 || num == 1
		resultado << num.to_s << " "
	else
		soma = ant + prox
		ant = prox
		prox = soma
		resultado << soma.to_s << " "
	end
end

puts resultado.strip