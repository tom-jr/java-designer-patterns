package br.com.lab.package_001_strategy.sem_strategy.models;

import br.com.lab.package_001_strategy.sem_strategy.models.enums.EnumTipoDesconto;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto {
    private String nome;
    private BigDecimal valor;


    public BigDecimal calcularDesconto(EnumTipoDesconto tipoDesconto) {
        BigDecimal desconto = BigDecimal.ZERO;
        switch (tipoDesconto) {
            case BLACK_FRIDAY:
                desconto = this.valor.multiply(new BigDecimal("0.2"));
                break;
            case NATAL:
                desconto = this.valor.multiply(new BigDecimal("0.1"));
                break;
        }
        return desconto;
    }
}
