package br.edu.unisep.Livraria.main;

import br.edu.unisep.Livraria.model.Livro;
import br.edu.unisep.Livraria.model.LivroDigital;
import br.edu.unisep.Livraria.service.Biblioteca;
import br.edu.unisep.Livraria.model.LivroFisico;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();


        Livro livro1 = new LivroDigital("Java para Iniciantes", "João Silva", "Tecnologia", "PDF");
        Livro livro2 = new LivroFisico("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Infantil", 96);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        while (true) {
            System.out.println("1 - Listar Livros");
            System.out.println("2 - Emprestar Livro");
            System.out.println("3 - Devolver Livro");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    biblioteca.listarLivros();
                    break;
                case 2:
                    System.out.print("Digite o título do livro para emprestar: ");
                    String tituloEmprestar = scanner.nextLine();
                    Livro livroEmprestar = biblioteca.buscarLivro(tituloEmprestar);
                    if (livroEmprestar != null) {
                        livroEmprestar.emprestar();
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o título do livro para devolver: ");
                    String tituloDevolver = scanner.nextLine();
                    Livro livroDevolver = biblioteca.buscarLivro(tituloDevolver);
                    if (livroDevolver != null) {
                        livroDevolver.devolver();
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}