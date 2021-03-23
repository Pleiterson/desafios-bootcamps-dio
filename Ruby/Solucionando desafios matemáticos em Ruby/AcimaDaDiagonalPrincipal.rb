# Acima da Diagonal Principal

# Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e
# uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média
# considerando somente aqueles elementos que estão acima da diagonal principal da
# matriz, conforme ilustrado abaixo (área verde).

# - Entrada

# A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'),
# indicando a operação (Soma ou Média) que deverá ser realizada com os elementos
# da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

# - Saída

# Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto
# decimal.

O = gets.chomp.upcase
M = Array.new
sum = 0.0
count = 0

(1..12).each_with_index do |v1, k1|
  row = Array.new
  (1..12).each_with_index do |v2, k2|
    value = gets.chomp.to_f
    row << value
    if k2 > k1
      sum += value 
      count += 1
    end
  end
  M << row
end

case O
when 'S' then
  puts sum
when 'M' then
  media = sum / count
  puts media.round(1)
end