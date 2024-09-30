package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public CarrinhoDeCompras(List<Item> itemList) {
        this.itemList = itemList;
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        itemList.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
    }

    public double calcularValorTotal(){
        double valorTotal = 0.00;
        for (Item i : itemList){
            valorTotal += (i.getPreco() * i.getQuantidade());
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("biscoito", 2.00, 2);
        carrinhoDeCompras.adicionarItem("pao", 5.00, 3);
        carrinhoDeCompras.adicionarItem("margarina", 10.00, 2);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("biscoito");

        carrinhoDeCompras.exibirItens();

        System.out.println("o valor total das compras deu: " + carrinhoDeCompras.calcularValorTotal());
    }
}
