package Command;

public class TesteCommand {
    public static void main(String[] args) {
        // Criando dispositivos
        Dispositivo tv = new Dispositivo("TV");
        Dispositivo radio = new Dispositivo("Rádio");

        // Criando comandos
        Comando comandoLigarTV = new ComandoLigar(tv);
        Comando comandoDesligarTV = new ComandoDesligar(tv);
        Comando comandoLigarRadio = new ComandoLigar(radio);
        Comando comandoDesligarRadio = new ComandoDesligar(radio);

        // Criando controle remoto
        ControleRemoto controleRemotoTV = new ControleRemoto(comandoLigarTV, comandoDesligarTV);
        ControleRemoto controleRemotoRadio = new ControleRemoto(comandoLigarRadio, comandoDesligarRadio);

        // Usando controle remoto para ligar e desligar dispositivos
        controleRemotoTV.pressionarBotaoLigar();
        controleRemotoTV.pressionarBotaoDesligar();
        controleRemotoRadio.pressionarBotaoLigar();
        controleRemotoRadio.pressionarBotaoDesligar();
    }
}