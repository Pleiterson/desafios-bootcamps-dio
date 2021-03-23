# Sequência Lógica

# Desenvolva um programa capaz de ler um valor inteiro N. N * 2 linhas de saída
# vão ser apresentadas na execução do programa, seguindo a lógica do exemplo mais
# abaixo. Para os valores com mais de seis dígitos, todos os dígitos devem
# ser apresentados.

# - Entrada

# O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).
    
# - Saída

# Imprima a saída conforme o exemplo fornecido.

number_times = gets.strip.to_i

1.upto(number_times) do |number|
	puts "#{number} #{number ** 2} #{number ** 3}"
	puts "#{number} #{number ** 2 + 1} #{number ** 3 + 1}"
end