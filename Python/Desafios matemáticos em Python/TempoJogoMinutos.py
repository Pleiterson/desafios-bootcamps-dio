# Tempo de Jogo com Minutos

# Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A
# seguir calcule a duração do jogo.
# Obs.: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

# •	Entrada

# Quatro números inteiros representando a hora de início e fim do jogo.

# •	Saída

# Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)”.

hi, mi, hf, mf = map(int, input().split())

h = hf - hi
m = mf - mi

if m >= 60:
  m -= 60
  h += 1
elif m < 0:
  m += 60
  h -= 1
  
if h > 24 or (h == 24 and m > 0):
  h -= 24
elif h < 0:
  h += 24

if h == 0 and m == 0:
  h = 24

if hf - hi >= 24 and hf >= 24:
  h = hf - hi

print(f"O JOGO DUROU {h} HORA(S) E {m} MINUTO(S)")