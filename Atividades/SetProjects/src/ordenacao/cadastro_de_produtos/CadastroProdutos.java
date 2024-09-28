package ordenacao.cadastro_de_produtos;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> listaProdutos;

    public CadastroProdutos(){
        listaProdutos = new HashSet<>();
    }

    public void adicionarProduto(String nome, double codigo, double preco, int quantidade){
        listaProdutos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        // TreeSet permite deixar o conjuto organizado.
        // TreeSet já organiza automaticamente o conjunto de acordo com o comparable
        Set<Produto> produtosPorNome = new TreeSet<>(listaProdutos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        // Informando o Comparator para o conjunto TreeSet.
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        // Adicionando a lista e o TreeSet irá organiza-la de acordo com o Comparator Selecionado.
        produtosPorPreco.addAll(listaProdutos);
        return produtosPorPreco;
    }

    public static void main(String[] args){
        CadastroProdutos listaProdutos = new CadastroProdutos();

        listaProdutos.adicionarProduto("Detergente", 321341, 1.99, 100);
        listaProdutos.adicionarProduto("Desodorante", 555555, 4.99, 50);
        listaProdutos.adicionarProduto("Sabonete em pó", 121221, 11.99, 30);
        listaProdutos.adicionarProduto("Bolacha de sal", 334413, 3.99, 90);
        listaProdutos.adicionarProduto("Água 500ml", 44123, 1.99, 55);

        System.out.println("Produtos por nome:");
        for(Produto p : listaProdutos.exibirProdutosPorNome()){
            System.out.println(p);
        }
        System.out.println("---");
        System.out.println("Produtos por preço:");
        for(Produto p : listaProdutos.exibirProdutosPorPreco()){
            System.out.println(p);
        }
    }
}
