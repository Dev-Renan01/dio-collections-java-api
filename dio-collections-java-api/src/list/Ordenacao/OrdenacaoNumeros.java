package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<OrdenacaoNumeros>{
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }
    @Override
    public int compareTo(OrdenacaoNumeros o) {
        return 0;
    }

    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> menorMaior = new ArrayList<>(this.numerosList);
        if(!this.numerosList.isEmpty()){
            Collections.sort(menorMaior);
            return menorMaior;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> menorMaior = new ArrayList<>(this.numerosList);
        if(!this.numerosList.isEmpty()){
           menorMaior.sort(Collections.reverseOrder());
           return menorMaior;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exibirNumeros(){
        if(!this.numerosList.isEmpty()){
            System.out.println(this.numerosList);
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(4);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(0);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(9);

        numeros.exibirNumeros();
        System.out.println(numeros.ordenarAscendente());
        numeros.exibirNumeros();
        System.out.println(numeros.ordenarDescendente());
        numeros.exibirNumeros();
    }
}
