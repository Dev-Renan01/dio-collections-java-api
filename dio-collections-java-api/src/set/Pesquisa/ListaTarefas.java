package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao, boolean tarefaConcluida) {
        tarefaSet.add(new Tarefa(descricao, tarefaConcluida));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaRemover);
        } else {
            System.out.println("O conjunto está vazio");
        }
        if (tarefaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefa() {
        System.out.println(tarefaSet);
    }

    public int contarTarefa() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isTarefaConcluida()) {
                tarefasConcluidas.add(t);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isTarefaConcluida()) {
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setTarefaConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaPendente = t;
                break;
            }
        }
        if (tarefaPendente != null) {
            if (tarefaPendente.isTarefaConcluida()) {
                tarefaPendente.setTarefaConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparLista() {
        if (!tarefaSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
         ListaTarefas listaTarefas = new ListaTarefas();

         listaTarefas.adicionarTarefa("Estudar Java", true);
        listaTarefas.adicionarTarefa("Fazer exercícios físicos", true);
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho", false);
        listaTarefas.adicionarTarefa("Ler livro", false);
        listaTarefas.adicionarTarefa("Preparar apresentação", true);

         listaTarefas.exibirTarefa();

         listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefa();

         System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefa());

         System.out.println(listaTarefas.obterTarefasPendentes());
         listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

         System.out.println(listaTarefas.obterTarefasConcluidas());

         listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefa();

         listaTarefas.limparLista();
        listaTarefas.exibirTarefa();
    }
}




