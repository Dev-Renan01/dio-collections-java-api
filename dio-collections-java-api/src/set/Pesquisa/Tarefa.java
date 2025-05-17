package set.Pesquisa;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean tarefaConcluida;

    public Tarefa(String descricao, boolean tarefaConcluida) {
        this.descricao = descricao;
        this.tarefaConcluida = tarefaConcluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return isTarefaConcluida() == tarefa.isTarefaConcluida() && Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao(), isTarefaConcluida());
    }

    @Override
    public String toString() {
        return "{ Descricao = " + descricao +
                ", TarefaConcluida = " + tarefaConcluida +
                " }\n";
    }
}
