package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class SalvarPedido implements AcaoAposGerarPedido {

    public void executar(Pedido pedido) {
        System.out.println("SALVANDO PEDIDO NO BD");
    }

}
