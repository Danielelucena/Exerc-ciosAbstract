package aplicacao;

import entidade.Aluno;
import entidade.Pessoa;

import java.util.Scanner;

public class Aplicacao extends Aluno {
    public Aplicacao(String nome, int idade) {
        super(nome, idade);
    }
    public Aplicacao(String nome, int idade, int numeroMatricula, String nomeCurso) {
        super(nome, idade, numeroMatricula, nomeCurso);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja se cadastrar ");
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade:");
        String idade = sc.nextLine();
        System.out.println("Digite seu numero de Matricula:");
        String numeroMatricula = sc.nextLine();
        System.out.println("Digite seu curso desejado");
        String nomeCurso = sc.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade, numeroMatricula, nomeCurso);
        pessoa.mostrarDados(nome,idade,numeroMatricula,nomeCurso);

    }
}
