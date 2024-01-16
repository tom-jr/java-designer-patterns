package br.com.lab.package_001_strategy.sem_strategy.service;

import br.com.lab.package_001_strategy.sem_strategy.models.Produto;
import br.com.lab.package_001_strategy.sem_strategy.models.enums.EnumTipoDesconto;
import com.sun.tools.javac.Main;

import java.math.BigDecimal;

public class ProdutoService {
    public static void main(String[] args) {
        Produto produto = Produto.builder()
                .nome("Cadeira Gamer")
                .valor(new BigDecimal("100.00"))
                .build();

        EnumTipoDesconto tipoDesconto = EnumTipoDesconto.BLACK_FRIDAY;
        BigDecimal valorDesconto = produto.calcularDesconto(tipoDesconto);
        System.out.printf("\nProduto %s no valor de: %s, Sai por: %s na promoção de %s%n",
                produto.getNome(),
                produto.getValor().toString(),
                produto.getValor().subtract(valorDesconto),
                tipoDesconto.getDescricao());
    }
}
