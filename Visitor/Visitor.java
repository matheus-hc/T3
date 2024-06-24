package Visitor;

interface Elemento {
    void aceitar(Visitor visitor);
}

interface Visitor {
    void visitar(Circulo circulo);

    void visitar(Quadrado quadrado);
}

class Circulo implements Elemento {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}

class Quadrado implements Elemento {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}

class CalculadoraArea implements Visitor {
    public void visitar(Circulo circulo) {
        double area = Math.PI * Math.pow(circulo.getRaio(), 2);
        System.out.println("Área do círculo: " + area);
    }

    public void visitar(Quadrado quadrado) {
        double area = Math.pow(quadrado.getLado(), 2);
        System.out.println("Área do quadrado: " + area);
    }
}