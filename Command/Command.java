package Command;

interface Comando {
    void executar();
}

class ComandoLigar implements Comando {
    private Dispositivo dispositivo;

    public ComandoLigar(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void executar() {
        dispositivo.ligar();
    }
}

class ComandoDesligar implements Comando {
    private Dispositivo dispositivo;

    public ComandoDesligar(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void executar() {
        dispositivo.desligar();
    }
}

class Dispositivo {
    private String nome;

    public Dispositivo(String nome) {
        this.nome = nome;
    }

    public void ligar() {
        System.out.println(nome + " ligado");
    }

    public void desligar() {
        System.out.println(nome + " desligado");
    }
}

class ControleRemoto {
    private Comando botaoLigar;
    private Comando botaoDesligar;

    public ControleRemoto(Comando botaoLigar, Comando botaoDesligar) {
        this.botaoLigar = botaoLigar;
        this.botaoDesligar = botaoDesligar;
    }

    public void pressionarBotaoLigar() {
        botaoLigar.executar();
    }

    public void pressionarBotaoDesligar() {
        botaoDesligar.executar();
    }
}
