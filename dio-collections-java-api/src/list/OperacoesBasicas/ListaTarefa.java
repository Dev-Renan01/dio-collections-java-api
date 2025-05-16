package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atributo
    private List<Tarefa> tarefaList;


    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public ListaTarefa(List<Tarefa> tarefaList) {
        this.tarefaList = tarefaList;

    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao) {
       List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList ){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);

    }

    public int obterNumeroTotalTarefa() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefa()  {
        System.out.println(tarefaList);
    }

    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }

    public void setTarefaList(List<Tarefa> tarefaList) {
        this.tarefaList = tarefaList;
    }


    public static void main (String[] args){

        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é:" + listaTarefa.obterNumeroTotalTarefa());

        listaTarefa.adicionarTarefa("Tarefa 01");
        listaTarefa.adicionarTarefa("Tarefa 02");
        listaTarefa.adicionarTarefa("Tarefa 03");
        System.out.println("O número total de elementos na lista é:" + listaTarefa.obterNumeroTotalTarefa());

        listaTarefa.removerTarefa("Tarefa 01");
        System.out.println("O número total de elementos na lista é:" + listaTarefa.obterNumeroTotalTarefa());

        listaTarefa.obterDescricoesTarefa();


    }
}




