package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem) {
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemMap.isEmpty()) {
            contagemMap.remove(palavra);

        } else {
            System.out.println("O Map está vazio!");
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
         for(int contagem : contagemMap.values()){
             contagemTotal = contagemTotal + contagem;
         }
        return contagemTotal;
  }
  public void exibirPalavras(){
      System.out.println(contagemMap);
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

         contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 1);
        contagemLinguagens.adicionarPalavras("C#", 6);

         System.out.println(contagemLinguagens.exibirContagemPalavras());
         contagemLinguagens.exibirPalavras();
    }
}