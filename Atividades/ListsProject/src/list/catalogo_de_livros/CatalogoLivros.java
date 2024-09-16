package list.catalogo_de_livros;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros(){
        livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoDePublicacao){
        livros.add(new Livro(titulo, autor, anoDePublicacao));
    }

    public void removerLivro(String titulo){
        List<Livro> livrosRemovidos = new ArrayList<>();
        for(Livro livro : livros){
            if(livro.getTitulo().equalsIgnoreCase(titulo))
                livrosRemovidos.add(livro);
        }
        livros.removeAll(livrosRemovidos);
    }

    public void exibirTodosOsLivros(){
        System.out.println(livros);
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livrosPorTitulo = null;
        if(livros.isEmpty())
            System.out.println("Lista vazia.");
        else {
            for(Livro l : livros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(livros.isEmpty()){
            System.out.println("Lista vazia.");
        }
        else {
            for(Livro l : livros){
                if(l.getAutor().equalsIgnoreCase(autor))
                    livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloDeAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if(livros.isEmpty())
            System.out.println("Lista vazia.");
        else {
            for (Livro l : livros) {
                if (anoInicial <= l.getAnoDePublicacao() && l.getAnoDePublicacao() <= anoFinal) {
                    livrosPorIntervalo.add(l);
                }
            }
        }
        return livrosPorIntervalo;
    }

    public static void main(String[] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Divergente", "Veronica Roth", 2004);
        catalogoLivros.adicionarLivro("Insurgente", "Veronica Roth", 2007);
        catalogoLivros.adicionarLivro("Insurgente", "Veronica Roth", 2008);
        catalogoLivros.adicionarLivro("Convergente", "Veronica Roth", 2010);
        catalogoLivros.adicionarLivro("Convergente", "Veronica Roth", 2011);
        catalogoLivros.adicionarLivro("Quatro", "Veronica Roth", 2015);
        catalogoLivros.adicionarLivro("Só depende de você", "Sara kuburic", 2024);

        System.out.println(catalogoLivros.pesquisarPorAutor("Veronica Roth"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloDeAnos(2000, 2010));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Insurgente"));
    }
}
