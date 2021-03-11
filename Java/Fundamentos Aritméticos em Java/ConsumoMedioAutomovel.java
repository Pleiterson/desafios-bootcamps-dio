// Consumo Médio do Automóvel

/* Você deve calcular o consumo médio de um automóvel onde será informada a
distância total percorrida (em Km) e o total de combustível consumido (em
litros).

- Entrada

Você receberá dois valores: um valor inteiro X com a distância total percorrida
(em Km, e um valor real Y que representa o total de combustível consumido, com
um dígito após o ponto decimal.

- Saída

Exiba o valor que representa o consumo médio do automóvel (3 casas após a
vírgula), incluindo no final a mensagem "km/l". */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;

public class ConsumoMedioAutomovel {
    public static void main(String[] args) throws IOException {
        BigDecimal km;
        BigDecimal combustivel;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        km = new BigDecimal(br.readLine());
        combustivel = new BigDecimal(br.readLine());
        BigDecimal comMedio = km.divide(combustivel, MathContext.DECIMAL32).setScale(3, BigDecimal.ROUND_HALF_EVEN);
        
        System.out.println("" + comMedio + " km/l");
    }
}