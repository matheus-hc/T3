package Visitor;

public class TesteVisitor {
    public static void main(String[] args) {
        Elemento[] elementos = { new Circulo(5), new Quadrado(4) };

        CalculadoraArea calculadoraArea = new CalculadoraArea();
        for (Elemento elemento : elementos) {
            elemento.aceitar(calculadoraArea);
        }
    }
}