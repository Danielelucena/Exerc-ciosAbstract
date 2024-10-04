package entidade;

public class LivroDidatico extends Livro{
    private String disciplina;
    private int anoEscolar;
    private int nivelDeEnsino;

    public LivroDidatico(String titulo , String nomeAutor, int numeroPaginas) {
        super(titulo, nomeAutor, numeroPaginas);
    }

    public LivroDidatico(String titulo, String nomeAutor, int numeroPaginas, String disciplina, int anoEscolar, int nivelDeEnsino) {
        super(titulo, nomeAutor, numeroPaginas);
        this.disciplina = disciplina;
        this.anoEscolar = anoEscolar;
        this.nivelDeEnsino = nivelDeEnsino;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getAnoEscolar() {
        return anoEscolar;
    }

    public void setAnoEscolar(int anoEscolar) {
        this.anoEscolar = anoEscolar;
    }

    public int getNivelDeEnsino() {
        return nivelDeEnsino;
    }

    public void setNivelDeEnsino(int nivelDeEnsino) {
        this.nivelDeEnsino = nivelDeEnsino;
    }
}
