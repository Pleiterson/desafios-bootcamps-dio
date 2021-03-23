# Substituição em Vetor I

# Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores
# nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.

# - Entrada

# A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.
    
# - Saída

# Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e
# x é o valor armazenado naquela posição.

x = []

10.times do
	number = gets.strip.to_i
	number = 1 if number <= 0
	x.push(number)
end

x.each_with_index do |item, index|
	puts "X[#{index}] = #{item}"
end