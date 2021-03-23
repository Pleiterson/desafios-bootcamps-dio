# Encaixa ou Não?

# Paulinho tem em suas mãos um novo problema. Agora a sua professora lhe pediu
# que construísse um programa para verificar, à partir de dois valores muito
# grandes A e B, se B corresponde aos últimos dígitos de A.

# - Entrada

# A entrada consiste de vários casos de teste. A primeira linha de entrada contém
# um inteiro N que indica a quantidade de casos de teste. Cada caso de teste
# consiste de dois valores A e B maiores que zero, cada um deles podendo ter até
# 1000 dígitos.

# - Saída

# Para cada caso de entrada imprima uma mensagem indicando se o segundo valor
# encaixa no primeiro valor, confome exemplo abaixo.

if __FILE__ == $0
    quantidade = (gets.strip).to_i - 1
  
    for elemento in 0..quantidade
        valores = ((STDIN.gets).strip).split(" ")
        break if valores.size != 2
        first, last = valores[0].to_s, valores[1].to_s
  
        if (first.length > 0 and last.length > 0) and (first.length <= 1000 and last.length <= 1000)
            if first[(first.length - last.length).abs..(first.length - 1)] == last then puts "encaixa" else puts "nao encaixa" end
        end
    end
end