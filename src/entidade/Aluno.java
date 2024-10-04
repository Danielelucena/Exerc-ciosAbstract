package entidade;

public class Aluno extends Pessoa{
    private int numeroMatricula;
    private String nomeCurso;


    public Aluno(String nome, int idade) {
        super(nome, idade);
    }

    public Aluno(String nome, int idade, int numeroMatricula, String nomeCurso) {
        super(nome, idade);
        this.numeroMatricula = numeroMatricula;
        this.nomeCurso = nomeCurso;
    }
public int nM(int numeroMatricula){
    numeroMatricula+=1;
    return numeroMatricula;
}
    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}
