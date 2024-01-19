package br.com.lab.package_003_hook_methods.no_pattern.service;

import br.com.lab.package_003_hook_methods.no_pattern.model.Pedido;

public class PedidoService {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Tênis");
        pedido.processarPedido();
    }
}
