// Domingo de Manhã

/*
Domingo é dia de feira. Logo de manhã muitas pessoas se deslocam para o polo
de lazer da Parangaba, onde acontece uma feira, conhecida por ser a maior da
cidade. Na feira da Parangaba você pode encontrar de tudo.

Todos os domingos, Bino faz compras na feira. Ele sempre marca com seu amigo
Cino de se encontrarem no terminal de ônibus da Parangaba às 8h, para irem
juntos comprar na feira. Porém, muitas vezes Bino acorda muito tarde e se
atrasa para o encontro com seu amigo.

Sabendo que Bino leva de 30 a 60 minutos para chegar ao terminal. Diga o atraso
máximo de Bino.

- Entrada

A entrada consiste em múltiplos casos teste. Cada caso de tese contém uma única
linha contendo um horário H (5:00 ≤ H ≤ 9:00) que Bino acordou. A entrada
termina com final de arquivo (EOF).

- Saída

Para cada caso de teste, imprima "Atraso maximo: X" (sem aspas), X indica o
atraso maximo (em minutos) de Bino no encontro com Cino.
*/

import java.io.IOException;
import java.util.Scanner;

public class Domingo {
  public static void main(String[] args) throws IOException {
  	Scanner leitor = new Scanner(System.in);
    
  	while (leitor.hasNext()) {
  		String[] relogio = leitor.nextLine().split(":");    		
  		int hora = Integer.parseInt(relogio[0]);
  		int min = Integer.parseInt(relogio[1]);
  		int atraso = 0;
  		
  		if (hora >= 7) {
  		  atraso = 60 * (hora - 7) + min;
  		}
  		
  		System.out.println("Atraso maximo: " + atraso);
  	}
  }
}