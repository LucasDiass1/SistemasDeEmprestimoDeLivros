package br.edu.unisep.Livraria.model;

public abstract class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private boolean disponivel;

    public Livro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = true; // Padrão: livro disponível
    }

    public abstract void exibirDetalhes();

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro não disponível.");
        }
    }

    public void devolver() {
        this.disponivel = true;
        System.out.println("Livro devolvido com sucesso!");
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}