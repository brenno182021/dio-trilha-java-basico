package entities;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente,banco,"CP");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Estrato Conta Poupanca ===");
        imprimirInfosComuns();
    }
}
