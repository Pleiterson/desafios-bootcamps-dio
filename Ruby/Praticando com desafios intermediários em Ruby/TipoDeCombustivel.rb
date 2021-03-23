# Tipo de Combustível

# Você recebeu desafio para determinar qual dos produtos é o preferêncial dos
# clientes de um posto de abastecimento de combustível. Para isso você deve
# escrever um algoritmo para ler o tipo de combustível abastecido (codificado
#   da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário
#   informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um
#   novo código (até que seja válido). O programa será encerrado quando o código
#   informado for o número 4.

# Entrada
# A entrada contém apenas valores inteiros e positivos.

# Saída
# Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que
# abasteceram cada tipo de combustível, conforme exemplo.

option = 0
alcohol = 0
fuel = 0
diesel = 0

while option != 4
	option = gets.strip.to_i
	case option
	when 1 then alcohol += 1
	when 2 then fuel += 1
  when 3 then diesel += 1
  when 4 then puts "MUITO OBRIGADO"
	end
end

puts "Alcool: #{alcohol}"
puts "Gasolina: #{fuel}"
puts "Diesel: #{diesel}"