package Mediator;

public class TesteMediator {
    public static void main(String[] args) {
        MediadorChat mediador = new MediadorChat();

        Usuario usuario1 = new Usuario("Alice", mediador);
        Usuario usuario2 = new Usuario("Bob", mediador);
        Usuario usuario3 = new Usuario("Charlie", mediador);

        mediador.adicionarUsuario(usuario1);
        mediador.adicionarUsuario(usuario2);
        mediador.adicionarUsuario(usuario3);

        usuario1.enviarMensagem("Olá a todos!");
        usuario2.enviarMensagem("Olá, Alice!");
    }
}
