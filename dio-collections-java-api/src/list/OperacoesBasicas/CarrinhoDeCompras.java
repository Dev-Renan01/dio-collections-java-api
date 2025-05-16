package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
   private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }


    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        itens.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itens.isEmpty()) {
            for (Item i : itens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itens.removeAll(itensParaRemover);
        } else {
            System.out.println("O carrinho está vazio!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itens.isEmpty()) {
            for (Item item : itens) {
                double valorDoItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorDoItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("O carrinho está vasio!");
        }
    }


    public void exibirItens(){
        if(!itens.isEmpty()){
            System.out.println(itens);
        }else{
            System.out.println("O carrinho está vasio!");
        }

    }
   public static void main(String[] args) {
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    carrinhoDeCompras.adicionarItem("Tv", 2000d, 4);
    carrinhoDeCompras.adicionarItem("Notebook", 3500d, 1);
    carrinhoDeCompras.adicionarItem("Teclado", 35d, 2);
    carrinhoDeCompras.adicionarItem("Mouse", 2d, 8);

    carrinhoDeCompras.exibirItens();
    carrinhoDeCompras.removerItem("Mouse");
    carrinhoDeCompras.exibirItens();
    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
