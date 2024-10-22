import entities.*;

public class Main {
    public static void main(String[] args) {
        Cliente glayson = new Cliente("Glayson");

        Banco bancoDoBrasil = new Banco("Banco do Brasil");
        Banco bancoBradesco = new Banco("Bradesco");

        Conta cc = new ContaCorrente(glayson, bancoDoBrasil);
        Conta poupanca = new ContaPoupanca(glayson, bancoBradesco);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
