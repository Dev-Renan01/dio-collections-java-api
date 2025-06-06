package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade ){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));

    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtoNome = new TreeSet<>(produtoSet);
        return produtoNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtoPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPreco.addAll(produtoSet);
        return produtoPreco;
    }
    public static void main(String[] args) {
         CadastroProdutos cadastroProdutos = new CadastroProdutos();

         cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

         System.out.println(cadastroProdutos.produtoSet);
         System.out.println(cadastroProdutos.exibirProdutosPorNome());
         System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
