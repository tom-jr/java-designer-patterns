package br.com.lab.package_001_strategy.com_strategy.model;

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
    private BigDecimal desconto;
}
