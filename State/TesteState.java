package State;

public class TesteState {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        // Processando o pedido quando está pendente
        pedido.processar();

        // Alterando o estado para enviado e processando o pedido
        pedido.setEstado(new EstadoPedidoEnviado());
        pedido.processar();

        // Alterando o estado para entregue e processando o pedido
        pedido.setEstado(new EstadoPedidoEntregue());
        pedido.processar();
    }
}