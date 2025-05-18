package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

     public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Alunos(nome, matricula, media));
    }

     public void removerAlunoPorMatricula(long matricula) {
         Alunos removerAluno = null;
         if (!alunosSet.isEmpty()) {
             for (Alunos a : alunosSet) {
                 if (a.getMatricula() == matricula) {
                     removerAluno = a;
                     break;
                 }
             }
             alunosSet.remove(removerAluno);
         } else {
             throw new RuntimeException("O conjunto está vazio!");
         }
         if (removerAluno == null) {
             System.out.println("Matricula [" + matricula +  "] não encontrada!");
        }
     }

    public Set<Alunos> exibirAlunosPorNome(){
        Set<Alunos> exibirNomeAlunos = new TreeSet<>(alunosSet);
        return exibirNomeAlunos;
    }

    public Set<Alunos> exibirAlunosPorNota(){
        Set<Alunos> exibirNotasAlunos = new TreeSet<>(new ComparatorPorNota());
        exibirNotasAlunos.addAll(alunosSet);
        return exibirNotasAlunos;
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }
    public static void main(String[] args) {
         GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

         System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunosSet);

         gerenciadorAlunos.removerAlunoPorMatricula(000L);
         gerenciadorAlunos.removerAlunoPorMatricula(123457L);

         gerenciadorAlunos.exibirAlunos();
         gerenciadorAlunos.exibirAlunosPorNome();
         gerenciadorAlunos.exibirAlunosPorNota();
    }

}
