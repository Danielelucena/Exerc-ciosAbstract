package entidade;

public class LivroDeNaoFiccao extends Livro{
    private String genero;
    private String subgenero;
    private String recomendacao = "titulo1, titulo2, etc.";

    public LivroDeNaoFiccao(String titulo, String nomeAutor, int numeroPaginas) {
        super(titulo, nomeAutor, numeroPaginas);
    }

    public String getRecomendacao() {
        return recomendacao;
    }

    public void setRecomendacao(String recomendacao) {
        this.recomendacao = recomendacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSubgenero() {
        return subgenero;
    }

    public void setSubgenero(String subgenero) {
        this.subgenero = subgenero;
    }
}
