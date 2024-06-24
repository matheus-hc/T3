package State;

interface EstadoPedido {
    void processar(Pedido pedido);
}

class EstadoPedidoPendente implements EstadoPedido {
    public void processar(Pedido pedido) {
        System.out.println("Pedido pendente: aguardando confirmação");
    }
}

class EstadoPedidoEnviado implements EstadoPedido {
    public void processar(Pedido pedido) {
        System.out.println("Pedido enviado: em trânsito");
    }
}

class EstadoPedidoEntregue implements EstadoPedido {
    public void processar(Pedido pedido) {
        System.out.println("Pedido entregue: finalizado");
    }
}

class Pedido {
    private EstadoPedido estado;

    public Pedido() {
        estado = new EstadoPedidoPendente();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void processar() {
        estado.processar(this);
    }
}