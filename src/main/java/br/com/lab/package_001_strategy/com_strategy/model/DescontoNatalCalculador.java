package br.com.lab.package_001_strategy.com_strategy.model;

import br.com.lab.package_001_strategy.com_strategy.model.interfaces.DescontoCalculador;
import br.com.lab.package_001_strategy.sem_strategy.models.enums.EnumTipoDesconto;

import java.math.BigDecimal;

public class DescontoNatalCalculador implements DescontoCalculador {
    @Override
    public BigDecimal calcularDesconto(BigDecimal valor) {
        return valor.multiply(new BigDecimal("0.1"));
    }

    @Override
    public EnumTipoDesconto getTipoDesconto() {
        return EnumTipoDesconto.NATAL;
    }
}
