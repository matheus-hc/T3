public class TesteChain {
    public static void main(String[] args) {
        // Configurando a cadeia de manipuladores
        ManipuladorCompra manipuladorDezReais = new ManipuladorDezReais();
        ManipuladorCompra manipuladorCinquentaReais = new ManipuladorCinquentaReais();
        ManipuladorCompra manipuladorCemReais = new ManipuladorCemReais();

        manipuladorDezReais.setProximo(manipuladorCinquentaReais);
        manipuladorCinquentaReais.setProximo(manipuladorCemReais);

        // Processando diferentes compras
        Compra compra1 = new Compra(20);
        Compra compra2 = new Compra(80);
        Compra compra3 = new Compra(150);

        manipuladorDezReais.processarCompra(compra1);
        manipuladorDezReais.processarCompra(compra2);
        manipuladorDezReais.processarCompra(compra3);
    }
}