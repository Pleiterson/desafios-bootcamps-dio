// Animal

/*
Neste problema, você deverá ler 3 palavras que definem o tipo de animal
possível segundo o esquema abaixo, da esquerda para a direita.  Em seguida
conclua qual dos animais seguintes foi escolhido, através das três palavras
fornecidas.
*/

import animal from  '../../assets/animal.png';

/*
- Entrada

A entrada contém 3 palavras, uma em cada linha, necessárias para identificar
o animal segundo a figura acima, com todas as letras minúsculas.

- Saída

Imprima o nome do animal correspondente à entrada fornecida.
*/

let x = gets(); 
let y = gets(); 
let z = gets(); 

if ((x == "vertebrado") && (y == "ave")  && (z == "carnivoro")) {
  console.log("aguia\n");
}

if ((x == "vertebrado") && (y == "ave")  && (z == "onivoro")) {
  console.log("pomba\n");
}

if ((x == "vertebrado") && (y == "mamifero")  && (z == "onivoro")) {
  console.log("homem\n");
}

if ((x == "vertebrado") && (y == "mamifero")  && (z == "herbivoro")) {
  console.log("vaca\n");
}

if ((x == "invertebrado") && (y == "inseto")  && (z == "hematofago")) {
  console.log("pulga\n");
}

if ((x ==  "invertebrado") && (y == "inseto")  && (z == "herbivoro")) {
  console.log("lagarta\n");
}

if ((x  == "invertebrado") && (y == "anelideo") && (z == "hematofago")) {
  console.log("sanguessuga\n");
}

if ((x  == "invertebrado") && (y == "anelideo") && (z == "onivoro")) {
  console.log("minhoca\n");
}