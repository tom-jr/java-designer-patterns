package br.com.lab.package_003_hook_methods.with_pattern.model;

public class PedidoComImpressao extends Pedido{
    public PedidoComImpressao(String produto) {
        super(produto);
    }

    @Override
    protected void hook1() {
        System.out.println("Imprimindo Nota fiscal ...");
    }
}
