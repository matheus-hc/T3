package Strategy;

public class TesteStrategy {
    public static void main(String[] args) {
        // Cria um pedido com a estratégia de pagamento de cartão de crédito
        Pedido pedido1 = new Pedido(new PagamentoCartaoCredito());
        pedido1.processarPagamento(100.00);

        // Altera a estratégia de pagamento para transferência bancária e processa o
        // pagamento
        pedido1.setEstrategiaPagamento(new PagamentoTransferencia());
        pedido1.processarPagamento(200.00);
    }
}