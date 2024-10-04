package entidade;

public class LivroDeFiccao extends Livro{
    private String genero;
    private String subGenero;
    private String trechoLivro = "Está é a sinopse";

    public LivroDeFiccao(String titulo, String nomeAutor, int numeroPaginas) {
        super(titulo, nomeAutor, numeroPaginas);
    }

    public LivroDeFiccao(String titulo, String nomeAutor, int numeroPaginas, String genero, String subGenero) {
        super(titulo, nomeAutor, numeroPaginas);
        this.genero = genero;
        this.subGenero = subGenero;
    }
    public static void sinopseDoLivro(String trechoLivro){
        System.out.println(trechoLivro);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSubGenero() {
        return subGenero;
    }

    public void setSubGenero(String subGenero) {
        this.subGenero = subGenero;
    }

    public String getTrechoLivro() {
        return trechoLivro;
    }

    public void setTrechoLivro(String trechoLivro) {
        this.trechoLivro = trechoLivro;
    }
}
