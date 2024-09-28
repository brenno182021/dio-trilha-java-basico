package dispositivos.apps.navegadorInternet;

import dispositivos.apps.navegadorInternet.interfaces.NavegadorInternet;

public class Safari implements NavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Pagina da url: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina");
    }

}
