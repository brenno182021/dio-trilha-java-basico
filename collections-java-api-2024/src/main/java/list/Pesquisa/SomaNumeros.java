package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> ints;

    public SomaNumeros(){
        this.ints = new ArrayList<Integer>();
    }

    public SomaNumeros(List<Integer> ints) {
        this.ints = ints;
    }

    public void adicionarNumero(int numero){
        ints.add(numero);
    }

    public int calcularSoma(){
        int total = 0;

        for (int anInt : ints) {
            total += anInt;
        }

        return total;
    }

    public int encontrarMaiorNumero(){
        int maiornumero = Integer.MIN_VALUE;

        for (int anInt : ints) {
            if (anInt > maiornumero)
                maiornumero = anInt;
        }

        return maiornumero;
    }

    public int encontrarMenorNumero(){
        int menornumero = Integer.MAX_VALUE;

        for (int anInt : ints) {
            if (anInt < menornumero)
                menornumero = anInt;
        }

        return menornumero;
    }

    public void exibirNumeros(){
        System.out.println(ints);
    }

    public List<Integer> getInts() {
        return ints;
    }

    public void setInts(List<Integer> ints) {
        this.ints = ints;
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "ints=" + ints +
                '}';
    }
}
