// Conversão de Tempo

/* Você terá o desafio de ler um valor inteiro, que é o tempo de duração em
segundos de um determinado evento em uma loja, e informe-o expresso no formato
horas:minutos:segundos.

- Entrada

O arquivo de entrada contém um valor inteiro N.

- Saída

Imprima o tempo lido no arquivo de entrada (segundos), convertido para
horas:minutos:segundos, conforme exemplo fornecido. */

let tempo;
let horas, minutos, segundos;

tempo = parseInt(gets());

  if (tempo >= 3600) {
    let rest = tempo % 3600;
    
    horas = parseInt((tempo - rest) / 3600);
    let rest2 = rest % 60;
    
    minutos = parseInt((rest - rest2) / 60);
    segundos = parseInt(rest2);
    console.log(horas + ":" + minutos + ":" + segundos);
  } else if (tempo >= 60) {
    let rest = tempo % 60;

    minutos = parseInt((tempo - rest) / 60);
    segundos = parseInt(rest);
    console.log("0:" + minutos + ":" + segundos);
  } else if (tempo < 60) {
    segundos = tempo;
    
    console.log("0:0:" + segundos);
  }