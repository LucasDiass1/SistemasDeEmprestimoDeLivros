package br.edu.unisep.Livraria.model;

public class LivroFisico extends Livro {
    private int numeroPaginas;

    public LivroFisico(String titulo, String autor, String genero, int numeroPaginas) {
        super(titulo, autor, genero);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro Físico: " + getTitulo() + " | Autor: " + getAutor() + " | Páginas: " + numeroPaginas);
    }

    // Getters e Setters
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}