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
        System.out.println("Deseja se cadastrar: ");

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        Pessoa pessoa = new Pessoa(nome, idade);
        pessoa.mostrarDados(nome,idade);

    }
}
