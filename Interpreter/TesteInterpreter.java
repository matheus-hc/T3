package Interpreter;

import java.util.Map;

public class TesteInterpreter {
    public static void main(String[] args) {
        String expressao = "x y +";
        Avaliador avaliador = new Avaliador(expressao);

        // Definindo valores para as variáveis
        Map<String, Integer> variaveis = Map.of("x", 10, "y", 5);

        // Interpretando a expressão
        int resultado = avaliador.interpretar(variaveis);
        System.out.println("Resultado da expressão '" + expressao + "': " + resultado);
    }
}