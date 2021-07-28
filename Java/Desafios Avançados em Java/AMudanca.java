// A Mudança

/*
vide arquivo em assets mudanca.png

Hermione está criando um novo Vira Tempo especialmente para programadores. É
impressionante as vantagens que ele oferece e o conforto pra codar que ele tem.
O artefato ainda está em desenvolvimento e ele prometeu consertar os bugs e
colocar uns apetrechos melhores e, em troca, pediu um sistema simples para o
modo Standy Bay. O problema é que o artefato por si só sempre tem o ângulo de
inclinação do Sol/Lua (de 0 a 360). Valendo um Vira Tempo, caso deseja aceitar:
dada em grau da inclinação do Sol/Lua, informe em qual período do dia ele se
encontra.

•	Entrada

A entrada contém um número inteiro M (0 ≤ M ≤ 360) representando o grau do
Sol/Lua. Como a posição muda constantemente seu programa receberá diversos
casos a cada segundo (EOF).

•	Saída

Imprima uma saudação referente ao período do dia que ele se encontra: "Boa
Tarde!!", "Boa Noite!!", "Bom Dia!!" e "De Madrugada!!".
*/

import java.io.IOException;
import java.util.Scanner;

public class AMudanca {
  public static void main(String[] args) throws IOException {
  	Scanner leitor = new Scanner(System.in);
  	String msg;
  	
  	while (leitor.hasNext()) {
  		int graus = leitor.nextInt();
  		
  		if (graus == 360 || graus >= 0 && graus < 90) msg = "Bom Dia!!";
  		else if (graus >= 90 && graus < 180) msg = "Boa Tarde!!";
  		else if (graus >= 180 && graus < 270) msg = "Boa Noite!!";
  		else msg = "De Madrugada!!";
  		
  		System.out.println(msg);
  	}
  	
  	leitor.close();
  }
}