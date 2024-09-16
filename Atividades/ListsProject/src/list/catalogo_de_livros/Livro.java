package list.catalogo_de_livros;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    public Livro(String titulo, String autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getAnoDePublicacao(){
        return this.anoDePublicacao;
    }

    public String toString(){
        return "Título: " + titulo + " - Autor: " + autor + " - ano de publicação: " + anoDePublicacao;
    }
}
