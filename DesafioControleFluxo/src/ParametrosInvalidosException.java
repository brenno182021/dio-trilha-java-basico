public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException() {
        super("Ocorreu algo aqui");
    }

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }

}
