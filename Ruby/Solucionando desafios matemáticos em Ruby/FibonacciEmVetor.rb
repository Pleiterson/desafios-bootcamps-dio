# Fibonacci em Vetor

# Nesse desafio você terá que desenvolver um programa que leia um valor e
# apresente o número de Fibonacci correspondente a este valor lido. Lembre que os
# 2 primeiros elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a
# soma dos 2 anteriores a ele. Todos os valores de Fibonacci calculados neste
# problema devem caber em um inteiro de 64 bits sem sinal.

# - Entrada

# A primeira linha da entrada contém um inteiro T, indicando o número de casos de
# teste. Cada caso de teste contém um único inteiro N (0 ≤ N ≤ 60),
# correspondente ao enésimo termo da série de Fibonacci.

# - Saída

# Para cada caso de teste da entrada, imprima a mensagem "Fib(N) = X", onde X é
# o N-ésimo termo da série de Fibonacci.

def fibonacci(n)
	vector = [0,1]
	
	index = 2
	while index < n + 1
		a = vector[index-2]
		p = vector[index-1]
		vector[index] = a + p
		index += 1
	end
	vector[n]
end

t = gets.strip.to_i
output = ""

t.times do 
	n = gets.strip.to_i
	value = fibonacci(n)
	output << "Fib(#{n}) = #{value}\n"
end

puts output