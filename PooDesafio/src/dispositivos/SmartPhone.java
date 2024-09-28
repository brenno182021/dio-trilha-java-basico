package dispositivos;

import dispositivos.apps.aparelhoTelefonico.Telefone;
import dispositivos.apps.aparelhoTelefonico.interfaces.AparelhoTelefonico;
import dispositivos.apps.navegadorInternet.Safari;
import dispositivos.apps.navegadorInternet.interfaces.NavegadorInternet;
import dispositivos.apps.reprodutorMusical.AppleMusic;
import dispositivos.apps.reprodutorMusical.interfaces.ReprodutorMusical;

public class SmartPhone {
    private String marca;

    // colocar depois para verificar a marca a ser criada para ja incializar com um
    // reprodutor de acordo com o dispositivo
    private ReprodutorMusical reprodutorMusical = new AppleMusic();

    private NavegadorInternet navegadorInternet = new Safari();

    private AparelhoTelefonico aparelhoTelefonico = new Telefone();

    public SmartPhone() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public void setNavegadorInternet(NavegadorInternet navegadorInternet) {
        this.navegadorInternet = navegadorInternet;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public void setAparelhoTelefonico(AparelhoTelefonico aparelhoTelefonico) {
        this.aparelhoTelefonico = aparelhoTelefonico;
    }

}
