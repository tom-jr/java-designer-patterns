package br.com.lab.package_001_strategy.com_strategy.service;

import br.com.lab.package_001_strategy.com_strategy.model.DescontoNatalCalculador;
import br.com.lab.package_001_strategy.com_strategy.model.Produto;
import br.com.lab.package_001_strategy.com_strategy.model.interfaces.DescontoCalculador;

import java.math.BigDecimal;

public class ProdutoService {


    public static void main(String[] args) {
        DescontoCalculador descontoCalculador = new DescontoNatalCalculador();
        Produto produto = Produto.builder()
                .nome("Fones headset")
                .valor(new BigDecimal("200"))
                .build();

        produto.setDesconto(descontoCalculador.calcularDesconto(produto.getValor()));


        System.out.printf("\nProduto %s no valor de: %s, Sai por: %s na promoção de %s%n",
                produto.getNome(),
                produto.getValor().toString(),
                produto.getValor().subtract(produto.getDesconto()),
                descontoCalculador.getTipoDesconto().getDescricao());
    }
}
