// Validador de senhas com requisitos

/* Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o
novo sistema de cadastro, e pediram a sua ajuda. Sua task é fazer o código que
valide as senhas que são cadastradas, para isso você deve atentar aos requisitos
a seguir:
- A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e
um número;
- A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
- Além disso, a senha pode ter de 6 a 32 caracteres.

- Entrada

A entrada contém vários casos de teste e termina com final de arquivo. Cada
linha tem uma string S, correspondente a senha que é inserida pelo usuário no
momento do cadastro.

- Saída

A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha
cada item dos requisitos solicitados anteriormente, ou “Senha invalida.”, se
um ou mais requisitos não forem atendidos. */

function validadorDeSenha(senha) {
    return /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z])(?!.*[_])\w{6,32}$/.test(senha)
  }
  
  let senha = "";
  
  do {
    senha = gets();
    if (senha !== "") {
      let valido = validadorDeSenha(senha);
      console.log("Senha " + (valido ? "valida." : "invalida."));
    }
  } while (senha !== "");