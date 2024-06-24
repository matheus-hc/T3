package Memento;

class EditorMemento {
    private String estado;

    public EditorMemento(String estado) {
        this.estado = estado;
    }

    public String getEstadoSalvo() {
        return estado;
    }
}

class EditorTexto {
    private StringBuilder texto = new StringBuilder();

    public void adicionarTexto(String novoTexto) {
        texto.append(novoTexto);
    }

    public String getTexto() {
        return texto.toString();
    }

    public EditorMemento salvar() {
        return new EditorMemento(texto.toString());
    }

    public void restaurar(EditorMemento memento) {
        texto = new StringBuilder(memento.getEstadoSalvo());
    }
}

class Historico {
    private EditorMemento memento;

    public EditorMemento getMemento() {
        return memento;
    }

    public void setMemento(EditorMemento memento) {
        this.memento = memento;
    }
}
