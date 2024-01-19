package br.com.lab.package_003_hook_methods.with_pattern.service;

import br.com.lab.package_003_hook_methods.with_pattern.model.Pedido;
import br.com.lab.package_003_hook_methods.with_pattern.model.PedidoComImpressao;

public class PedidoService {
    public static void main(String[] args) {
        Pedido pedido = new PedidoComImpressao("Livro Sci fi");
        pedido.processarPedido();
    }
}
