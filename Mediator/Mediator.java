package Mediator;

import java.util.ArrayList;
import java.util.List;

// Interface do mediador
interface Mediador {
    void enviarMensagem(String mensagem, Usuario remetente);
}

// Implementação concreta do mediador
class MediadorChat implements Mediador {
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void enviarMensagem(String mensagem, Usuario remetente) {
        for (Usuario usuario : usuarios) {
            // Enviar mensagem para todos os usuários, exceto o remetente
            if (usuario != remetente) {
                usuario.receberMensagem(mensagem);
            }
        }
    }
}

// Classe de usuário
class Usuario {
    private String nome;
    private Mediador mediador;

    public Usuario(String nome, Mediador mediador) {
        this.nome = nome;
        this.mediador = mediador;
    }

    public void enviarMensagem(String mensagem) {
        System.out.println(nome + " enviou mensagem: " + mensagem);
        mediador.enviarMensagem(mensagem, this);
    }

    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu mensagem: " + mensagem);
    }
}
