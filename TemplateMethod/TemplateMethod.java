package TemplateMethod;

abstract class ProcessoFabricacao {

    public final void fabricarProduto() {
        prepararMateriais();
        moldarProduto();
        if (precisaPolimento()) {
            polirProduto();
        }
        embalarProduto();
    }

    protected abstract void prepararMateriais();

    protected abstract void moldarProduto();

    protected abstract void embalarProduto();

    protected boolean precisaPolimento() {
        return true;
    }

    private void polirProduto() {
        System.out.println("Polindo o produto.");
    }
}

class ProcessoFabricacaoMadeira extends ProcessoFabricacao {
    protected void prepararMateriais() {
        System.out.println("Preparando madeira para fabricação.");
    }

    protected void moldarProduto() {
        System.out.println("Moldando a madeira para criar o produto.");
    }

    protected void embalarProduto() {
        System.out.println("Embalando o produto de madeira.");
    }

    protected boolean precisaPolimento() {
        return false;
    }
}

class ProcessoFabricacaoPlastico extends ProcessoFabricacao {
    protected void prepararMateriais() {
        System.out.println("Preparando plástico para fabricação.");
    }

    protected void moldarProduto() {
        System.out.println("Injetando o plástico para criar o produto.");
    }

    protected void embalarProduto() {
        System.out.println("Embalando o produto de plástico.");
    }
}
