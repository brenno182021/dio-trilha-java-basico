package dispositivos.apps.aparelhoTelefonico;

import dispositivos.apps.aparelhoTelefonico.interfaces.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz");
    }

}
