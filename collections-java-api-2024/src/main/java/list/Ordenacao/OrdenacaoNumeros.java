package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> integerList;

    public OrdenacaoNumeros() {
        this.integerList = new ArrayList<>();
    }

    public OrdenacaoNumeros(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public void adicionarNumero(int numero){
        integerList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(integerList);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(integerList);
        numerosDescendente.sort(Collections.reverseOrder());
        return numerosDescendente;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "integerList=" + integerList +
                '}';
    }

}
