# DDD

# Leia um número inteiro que representa um código de DDD para discagem
# interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a
# tabela abaixo:

# Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o
# programa deverá informar:
# DDD nao cadastrado

# - Entrada

# A entrada consiste de um único valor inteiro.

# - Saída

# Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima
# DDD nao cadastrado caso não existir DDD correspondente ao número digitado.

codigo = gets.strip.to_i

case codigo
  when 61 then puts "Brasilia"
  when 71 then puts "Salvador"
  when 11 then puts "Sao Paulo"
  when 21 then puts "Rio de Janeiro"
  when 32 then puts "Juiz de Fora"
  when 19 then puts "Campinas"
  when 27 then puts "Vitoria"
  when 31 then puts "Belo Horizonte"
  
  else puts "DDD nao cadastrado"
end