package entidade;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, String idade, String numeroMatricula, String nomeCurso) {
    }

    public static void mostrarDados(String nome, String idade, String numeroMatricula, String nomeCurso){
    System.out.println(nome +','+idade+','+ numeroMatricula+','+nomeCurso);
}
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
