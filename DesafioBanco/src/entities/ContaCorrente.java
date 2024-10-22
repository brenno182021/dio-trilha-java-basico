package entities;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente,Banco banco) {
        super(cliente,banco,"CC");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Estrato Conta Corrente ===");
        imprimirInfosComuns();
    }


}
