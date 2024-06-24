package Interator;

import java.util.Iterator;

public class TesteIterator {
    public static void main(String[] args) {
        ColecaoNumeros colecao = new ColecaoNumeros();
        colecao.adicionarNumero(1);
        colecao.adicionarNumero(2);
        colecao.adicionarNumero(3);

        // Criando e usando o iterador
        Iterator<Integer> iterador = colecao.criarIterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}