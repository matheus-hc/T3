package TemplateMethod;

public class TesteTemplateMethod {
    public static void main(String[] args) {
        // Fabricação de um produto de madeira
        System.out.println("Fabricação de um produto de madeira:");
        ProcessoFabricacao processoMadeira = new ProcessoFabricacaoMadeira();
        processoMadeira.fabricarProduto();

        System.out.println();

        // Fabricação de um produto de plástico
        System.out.println("Fabricação de um produto de plástico:");
        ProcessoFabricacao processoPlastico = new ProcessoFabricacaoPlastico();
        processoPlastico.fabricarProduto();
    }
}