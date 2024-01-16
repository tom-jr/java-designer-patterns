package br.com.lab.package_001_strategy.com_strategy.model.interfaces;

import br.com.lab.package_001_strategy.sem_strategy.models.enums.EnumTipoDesconto;

import java.math.BigDecimal;

public interface DescontoCalculador {
    BigDecimal calcularDesconto(BigDecimal valor);

    EnumTipoDesconto getTipoDesconto();
}
