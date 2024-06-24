package Observer;

import java.util.ArrayList;
import java.util.List;

interface Observador {
    void atualizar(int valor);
}

class Contador {
    private int valor;
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void incrementar() {
        valor++;
        notificarObservadores();
    }

    public int getValor() {
        return valor;
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(valor);
        }
    }
}

class ExibidorContador implements Observador {
    public void atualizar(int valor) {
        System.out.println("Valor do contador atualizado para: " + valor);
    }
}