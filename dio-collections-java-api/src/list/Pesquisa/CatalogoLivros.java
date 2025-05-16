package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros(){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo,
                               String autor,
                               int anoDepublicacao){

        livros.add( new Livro(titulo, autor, anoDepublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosporAutor = new ArrayList<>();

        if(!livros.isEmpty()){
            for(Livro l : livros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosporAutor.add(l);
                }
            }
        }
        return livrosporAutor;
    }

    private List<Livro> pesquisaPorIntervalosAno(int inicio, int fim){
        List<Livro> pesquisaAno = new ArrayList<>();
        if(!livros.isEmpty()){
            for(Livro l : livros){
                if(l.getAnoDepublicacao() >= inicio && l.getAnoDepublicacao() <= fim){
                    pesquisaAno.add(l);
                }
            }
        }
        return pesquisaAno;
    }
    public Livro pesquisarTitulo(String titulo){
        Livro pesquisandoLivro = null;
        if(!livros.isEmpty()){
            for(Livro l : livros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    pesquisandoLivro = l;
                    break;
                }
            }
        }
        return pesquisandoLivro;
    }

    public static void main(String[] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("livro 01", "autor 01", 2020);
        catalogoLivros.adicionarLivro("livro 01", "autor 02", 2021);
        catalogoLivros.adicionarLivro("livro 02", "autor 02", 2022);
        catalogoLivros.adicionarLivro("livro 03", "autor 03", 2023);
        catalogoLivros.adicionarLivro("livro 04", "autor 04", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor 01"));
        System.out.println(catalogoLivros.pesquisaPorIntervalosAno(2020, 2021));
        System.out.println(catalogoLivros.pesquisarTitulo("Livro 03"));

    }
}
