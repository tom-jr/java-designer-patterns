package br.com.lab.package_003_hook_methods.no_pattern.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pedido {
    private String produto;

    public Pedido(String produto) {
        this.produto = produto;
    }

    public void processarPedido() {
        System.out.println("Processando pedido do produto: " + produto);
        this.verificarEstoque();
        this.prepararPedido();
        this.enviarPedido();
    }

    private void enviarPedido() {
        System.out.println("Enviando pedido...");
    }

    private void prepararPedido() {
        System.out.println("Preparando pedido...");
    }

    private void verificarEstoque() {
        System.out.println("Verificando estoque...");
    }
}
