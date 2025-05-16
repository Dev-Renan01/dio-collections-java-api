package set;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoconvite;

    public Convidado(String nome, int codigoconvite) {
        this.nome = nome;
        this.codigoconvite = codigoconvite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoconvite() {
        return codigoconvite;
    }

    public void setCodigoconvite(int codigoconvite) {
        this.codigoconvite = codigoconvite;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodigoconvite() == convidado.getCodigoconvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoconvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoconvite=" + codigoconvite +
                '}';
    }
}
