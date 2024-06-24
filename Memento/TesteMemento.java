package Memento;

public class TesteMemento {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Historico historico = new Historico();

        // Adiciona texto e salva o estado
        editor.adicionarTexto("Primeira linha\n");
        historico.setMemento(editor.salvar());

        // Adiciona mais texto e salva o estado novamente
        editor.adicionarTexto("Segunda linha\n");
        historico.setMemento(editor.salvar());

        // Adiciona mais texto
        editor.adicionarTexto("Terceira linha\n");

        // Restaura o estado anterior
        editor.restaurar(historico.getMemento());

        // Imprime o texto restaurado
        System.out.println("Texto restaurado:\n" + editor.getTexto());
    }
}