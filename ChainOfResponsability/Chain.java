
interface Manipulador {
    void processarCompra(Compra compra);
}


abstract class ManipuladorCompra implements Manipulador {
    private Manipulador proximo;

    public void setProximo(Manipulador proximo) {
        this.proximo = proximo;
    }

    public void processarCompra(Compra compra) {
        if (podeProcessar(compra)) {
            processar(compra);
        } else if (proximo != null) {
            proximo.processarCompra(compra);
        } else {
            System.out.println("Nenhum manipulador disponível para processar a compra.");
        }
    }

    protected abstract boolean podeProcessar(Compra compra);

    protected abstract void processar(Compra compra);
}


class ManipuladorDezReais extends ManipuladorCompra {
    protected boolean podeProcessar(Compra compra) {
        return compra.getValor() <= 10;
    }

    protected void processar(Compra compra) {
        System.out.println("Compra de R$ " + compra.getValor() + " processada por ManipuladorDezReais.");
    }
}


class ManipuladorCinquentaReais extends ManipuladorCompra {
    protected boolean podeProcessar(Compra compra) {
        return compra.getValor() <= 50;
    }

    protected void processar(Compra compra) {
        System.out.println("Compra de R$ " + compra.getValor() + " processada por ManipuladorCinquentaReais.");
    }
}


class ManipuladorCemReais extends ManipuladorCompra {
    protected boolean podeProcessar(Compra compra) {
        return compra.getValor() <= 100;
    }

    protected void processar(Compra compra) {
        System.out.println("Compra de R$ " + compra.getValor() + " processada por ManipuladorCemReais.");
    }
}


class Compra {
    private int valor;

    public Compra(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
