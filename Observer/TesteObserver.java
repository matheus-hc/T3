package Observer;

public class TesteObserver {
    public static void main(String[] args) {
        Contador contador = new Contador();
        ExibidorContador exibidor = new ExibidorContador();

        // Adiciona o observador ao contador
        contador.adicionarObservador(exibidor);

        // Incrementa o contador (o observador será notificado)
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
    }
}