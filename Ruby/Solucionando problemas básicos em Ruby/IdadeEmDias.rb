# Idade em Dias

# Você terá o desafio de ler um valor inteiro correspondente à idade de uma
# pessoa em dias e informe-a em anos, meses e dias

# Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo
# mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12
# meses e alguns dias, como 360, 363 ou 364. 

# - Entrada

# O arquivo de entrada contém um valor inteiro.

# - Saída

# Imprima a saída conforme exemplo fornecido.

idade_dias = gets.strip.to_i

idade_anos = idade_dias / 365;
idade_meses = ((idade_dias % 365) / 30);
idade_dias = ((idade_dias % 365) % 30);

puts "#{idade_anos} ano(s)"
puts "#{idade_meses} mes(es)"
puts "#{idade_dias} dia(s)"