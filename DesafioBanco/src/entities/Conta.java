package entities;

import interfaces.IConta;

public abstract class Conta  implements IConta {

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected String tipoConta;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;


    public Conta(Cliente cliente, Banco banco, String tipoConta){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.tipoConta = tipoConta;
        this.banco = banco;
    }


    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
        }else {
            throw new RuntimeException("Saldo insuficiente!");
        }

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (this.saldo >= valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }else {
            throw new RuntimeException("Saldo insuficiente!");
        }

    }

    protected void imprimirInfosComuns() {
        System.out.println("Titular: "+ this.cliente.getNome());
        System.out.println("Banco: " + this.banco.getNome());
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println("Tipo Conta: " + this.tipoConta);
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public int getNumero() {
        return numero;
    }


    public double getSaldo() {
        return saldo;
    }

    public Banco getBanco() {
        return banco;
    }

}
