package aplicacao;

import entidade.*;

import java.util.Scanner;

public class Aplicacao extends Livro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que livro deseja ");
        String nomeLivro = sc.nextLine();

        if(nomeLivro == "matematica"){
            System.out.println("O livro é didatico");
            Livro pessoa = new Livro("titulo", "nomeAutor", 30);
            pessoa.informarDetalhes("titulo", "nomeAutor", 30);
        }

    }

}
