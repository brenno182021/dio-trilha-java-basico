package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public CatalogoLivros(List<Livro> livroList) {
        this.livroList = livroList;
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            livroList.forEach(livro -> {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            });
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervalorAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosorIntervalorAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            livroList.forEach(livro -> {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosorIntervalorAnos.add(livro);
                }
            });
        }
        return livrosorIntervalorAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public List<Livro> getLivroList() {
        return livroList;
    }

    public void setLivroList(List<Livro> livroList) {
        this.livroList = livroList;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1","Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1","Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2","Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3","Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4","Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervalorAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
