package list.Pesquisa;

public class Livro {
        private String titulo;
        private String autor;
        private int anoDepublicacao;


    public Livro(String titulo, String autor, int anoDepublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDepublicacao = anoDepublicacao;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDepublicacao() {
        return anoDepublicacao;
    }

    public void setAnoDepublicacao(int anoDepublicacao) {
        this.anoDepublicacao = anoDepublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoDepublicacao=" + anoDepublicacao +
                '}';
    }
}
