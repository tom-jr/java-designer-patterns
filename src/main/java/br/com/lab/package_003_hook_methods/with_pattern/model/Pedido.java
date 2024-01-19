package br.com.lab.package_003_hook_methods.with_pattern.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pedido {
    private String produto;

    public Pedido(String produto) {
        this.produto = produto;
    }

    public final void processarPedido() {
        System.out.println("Processando pedido do produto: " + produto);
        this.verificarEstoque();
        this.prepararPedido();
        this.hook1();
        this.enviarPedido();
    }

    protected abstract void hook1();

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
