package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatosMap;

    public AgendaContatos() {
        this.contatosMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer numero){
        contatosMap.put( nome, numero);
    }
    public void removerContato(String nome) {
        if (!contatosMap.isEmpty()) {
            contatosMap.remove(nome);
        }else{
            System.out.println("O cotato de: '" + nome + "' não existe!");
        }
    }
    public void exibirContatos(){
        System.out.println(contatosMap);
    }
    public Integer pesquisarNome(String nome){
        Integer numeroNome = null;
        if(!contatosMap.isEmpty()){
            numeroNome = contatosMap.get(nome);
        }
        return numeroNome;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

         agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

         agendaContatos.removerContato("Maria");

        agendaContatos.exibirContatos();

         String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }
}
