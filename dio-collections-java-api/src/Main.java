import OperacoesBasicas.CarrinhoDeCompras;

public class Main {

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
