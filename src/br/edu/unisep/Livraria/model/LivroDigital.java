package br.edu.unisep.Livraria.model;

public class LivroDigital extends Livro {
    private String formato;

    public LivroDigital(String titulo, String autor, String genero, String formato) {
        super(titulo, autor, genero);
        this.formato = formato;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro Digital: " + getTitulo() + " | Autor: " + getAutor() + " | Formato: " + formato);
    }

    // Getters e Setters
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
