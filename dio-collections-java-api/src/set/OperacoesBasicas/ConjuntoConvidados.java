package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
    this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite
            (int codigoConvite) {
        Convidado convidadoParaRemover = null ;
        for(Convidado c : convidadoSet){
            if(c.getCodigoconvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();

    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
    public static void main(String[] args){
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() +
                " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Thiago", 43);
        conjuntoConvidados.adicionarConvidado("Renan", 45);
        conjuntoConvidados.adicionarConvidado("Suany", 42);
        conjuntoConvidados.adicionarConvidado("David", 44);

        System.out.println("Convidados no conjunto:");
        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(43);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();
    }
}
