package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public ListaTarefa(List<Tarefa> tarefaList) {
        this.tarefaList = tarefaList;
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefaList.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        //tarefaList.forEach(tarefa -> System.out.println(tarefa.getDescricao()));
        System.out.println(tarefaList);
    }

    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }

    public void setTarefaList(List<Tarefa> tarefaList) {
        this.tarefaList = tarefaList;
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();


        System.out.println(" o numero toal de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");

        System.out.println(" o numero toal de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 2");

        System.out.println(" o numero toal de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
