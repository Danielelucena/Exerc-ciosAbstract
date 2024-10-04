package entidade;
import entidade.*;
public class Livro {
    private String titulo;
    private String nomeAutor;
    private int numeroPaginas;

    public Livro(String titulo, String nomeAutor, int numeroPaginas) {
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.numeroPaginas = numeroPaginas;
    }

    public Livro() {
    }

    public static void informarDetalhes(String titulo, String nomeAutor, int numeroPaginas){
        System.out.println(titulo+ nomeAutor+ numeroPaginas);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
