package dispositivos.apps.reprodutorMusical;

import dispositivos.apps.reprodutorMusical.interfaces.ReprodutorMusical;

public class AppleMusic implements ReprodutorMusical {

    private boolean statusMusica;

    private String musica;

    public AppleMusic() {

    }

    public AppleMusic(boolean statusMusica, String musica) {
        this.statusMusica = statusMusica;
        this.musica = musica;
    }

    @Override
    public void tocar() {
        System.out.println("Musica Tocando: " + musica);
    }

    @Override
    public void pausar() {
        statusMusica = false;
        System.out.println("Musica Pausada");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica Selecionada: " + musica);
        this.musica = musica;
    }

    public void setStatusMusica(boolean statusMusica) {
        this.statusMusica = statusMusica;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

}
