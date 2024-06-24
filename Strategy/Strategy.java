package Strategy;

interface EstrategiaPagamento {
    void processarPagamento(double valor);
}

class PagamentoCartaoCredito implements EstrategiaPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
    }
}

class PagamentoTransferencia implements EstrategiaPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado por transferência bancária.");
    }
}

class Pedido {
    private EstrategiaPagamento estrategiaPagamento;

    public Pedido(EstrategiaPagamento estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
    }

    public void setEstrategiaPagamento(EstrategiaPagamento estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
    }

    public void processarPagamento(double valor) {
        estrategiaPagamento.processarPagamento(valor);
    }
}