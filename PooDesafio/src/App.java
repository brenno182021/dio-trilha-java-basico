import dispositivos.SmartPhone;

public class App {
    public static void main(String[] args) throws Exception {

        SmartPhone smartPhone = new SmartPhone();

        smartPhone.setMarca("Iphone");

        smartPhone.getReprodutorMusical().selecionarMusica("It's My Life");

        smartPhone.getReprodutorMusical().tocar();

        smartPhone.getReprodutorMusical().pausar();

        smartPhone.getNavegadorInternet().exibirPagina("https://www.google.com/");

        smartPhone.getNavegadorInternet().atualizarPagina();
        smartPhone.getNavegadorInternet().adicionarNovaAba();

        smartPhone.getAparelhoTelefonico().atender();
        smartPhone.getAparelhoTelefonico().ligar();
        smartPhone.getAparelhoTelefonico().iniciarCorreioVoz();
    }
}
