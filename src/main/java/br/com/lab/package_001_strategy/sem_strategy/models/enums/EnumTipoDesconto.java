package br.com.lab.package_001_strategy.sem_strategy.models.enums;

import br.com.lab.package_001_strategy.sem_strategy.models.Produto;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public enum EnumTipoDesconto {
    BLACK_FRIDAY("Black Friday"),
    NATAL("Natal");

    private final String descricao;

    EnumTipoDesconto(String descricao) {
        this.descricao = descricao;
    }

}
