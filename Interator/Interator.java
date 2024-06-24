package Interator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ColecaoNumeros {
    private List<Integer> numeros = new ArrayList<>();

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public Iterator<Integer> criarIterator() {
        return new IteratorNumeros();
    }

    private class IteratorNumeros implements Iterator<Integer> {
        private int indice = 0;

        public boolean hasNext() {
            return indice < numeros.size();
        }

        public Integer next() {
            if (hasNext()) {
                return numeros.get(indice++);
            }
            return null;
        }
    }
}