package Interpreter;

import java.util.Map;
import java.util.Stack;

interface Expressao {
    int interpretar(Map<String, Integer> variaveis);
}

class Variavel implements Expressao {
    private String nome;

    public Variavel(String nome) {
        this.nome = nome;
    }

    public int interpretar(Map<String, Integer> variaveis) {
        if (variaveis.containsKey(nome)) {
            return variaveis.get(nome);
        }
        return 0;
    }
}

class Adicao implements Expressao {
    private Expressao esquerda;
    private Expressao direita;

    public Adicao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public int interpretar(Map<String, Integer> variaveis) {
        return esquerda.interpretar(variaveis) + direita.interpretar(variaveis);
    }
}

class Subtracao implements Expressao {
    private Expressao esquerda;
    private Expressao direita;

    public Subtracao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public int interpretar(Map<String, Integer> variaveis) {
        return esquerda.interpretar(variaveis) - direita.interpretar(variaveis);
    }
}

class Avaliador {
    private Expressao expressao;

    public Avaliador(String expressao) {
        Stack<Expressao> pilha = new Stack<>();

        for (String token : expressao.split(" ")) {
            if (token.equals("+")) {
                Expressao direita = pilha.pop();
                Expressao esquerda = pilha.pop();
                pilha.push(new Adicao(esquerda, direita));
            } else if (token.equals("-")) {
                Expressao direita = pilha.pop();
                Expressao esquerda = pilha.pop();
                pilha.push(new Subtracao(esquerda, direita));
            } else {
                pilha.push(new Variavel(token));
            }
        }
        this.expressao = pilha.pop();
    }

    public int interpretar(Map<String, Integer> variaveis) {
        return expressao.interpretar(variaveis);
    }
}
