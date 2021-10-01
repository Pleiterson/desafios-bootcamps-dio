// Conversão de Tempo

/*
Você terá o desafio de ler um valor inteiro, que é o tempo de duração em
segundos de um determinado evento em uma loja, e informe-o expresso no formato
horas:minutos:segundos.

- Entrada

O arquivo de entrada contém um valor inteiro N.

- Saída

Imprima o tempo lido no arquivo de entrada (segundos), convertido para
horas:minutos:segundos, conforme exemplo fornecido.
*/

import java.util.Scanner;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sec, min, hour, time, rest, rest2;
    
    time = input.nextInt();
    
    if (time >= 3600) {
      rest = time % 3600;
      hour = (int)((time - rest) / 3600);
      rest2 = rest % 60;
      min = (int)((rest - rest2) / 60);
      sec = (int)(rest2);
      
      System.out.println(hour + ":" + min + ":" + sec);
    } else if (time >= 60) {
      rest = time % 60;
      min = (int)((time - rest) / 60);
      sec = (int)(rest);
      
      System.out.println("0:" + min + ":" + sec);
    } else if (time < 60) {
      sec = time;
      
      System.out.println("0:0:" + sec);
    }
  }
}