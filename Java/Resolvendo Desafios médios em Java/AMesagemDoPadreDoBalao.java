// A Mesagem do Padre do Balão

/*
Ao voltar de um intenso jogo de RPG na casa de um amigo, o padre do balão
desapareceu misteriosamente! Todos estão loucos a procura do padre pelos céus.
Enquanto isso, coisas estranhas estão acontecendo em sua casa, como ele
conseguir se comunicar com um menino!

Existem exatamente 26 lâmpadas penduradas na parede sa sala do padre, numeradas
de 1 a 26 da esquerda para a direita. Além disso, há uma letra do alfabeto
pintada na parede embaixo de cada lâmpada. Quando o padre do balão quer enviar
uma mensagem, as luzes de alguma forma piscam, uma a uma, as lâmpadas
correspondentes a cada letra de sua mensagem. Por exemplo, se ele quer enviar
a mensagem HELP, ele irá piscar, nesta ordem, as lâmpadas acima das letras
H, E, L e P.

Dada a letra associada a cada lâmpada e a ordem das lâmpadas que foram piscadas
por Will, decifre a mensagem que ele enviou!

- Entrada

A entrada contém vários casos de teste. A primeira linha de cada caso contém
uma string de exatamente 26 letras maiúsculas contendo todas as letras do
alfabeto inglês. A primeira letra da string está associada à lâmpada 1; a
segunda letra está associada à lâmpada 2; e assim por diante. A próxima linha
contém um inteiro N (1 ≤ N ≤ 104), o número de lâmpadas que foram piscadas.
A terceira linha contém N inteiros li (1 ≤ li ≤ 26), indicando as lâmpadas que
foram piscadas, em ordem.

- Saída

Para cada caso de teste, imprima uma única linha contendo a mensagem enviada
pelo padre do balão.
*/

import java.io.IOException;
import java.util.Scanner;

public class Problem {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
		while (leitor.hasNext()) {
			String alphabet = leitor.next();
			String word = "";
			int letters = leitor.nextInt();
			
			for (int i = 0; i < letters; i++) {
				int letter = leitor.nextInt() -1;
				
				word += alphabet.charAt(letter);
			}
			System.out.println(word);
		}
	}
}