package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;


public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void  removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
        dicionarioMap.remove(palavra);
        }else{
            System.out.println("O Dicionário está vazio!");
        }
    }

    public void exibirPalavras(){
        if(!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);
        }else{
            System.out.println("O Dicionário está vazio!");
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String p = null;
        if(!dicionarioMap.isEmpty()){
            p = dicionarioMap.get(palavra);

        }else{
            System.out.println("\"O Dicionário está vazio!\"");
        }
        if(p != palavra) {
            System.out.println(" Palavra não '" + palavra + "' encontrada!");
        }
        return p;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

         dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.\n");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.\n");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.\n");

         dicionario.exibirPalavras();

         String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

         dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }

}
