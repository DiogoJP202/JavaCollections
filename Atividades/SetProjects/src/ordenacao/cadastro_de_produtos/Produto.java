package ordenacao.cadastro_de_produtos;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String nome;
    private double codigo;
    private double preco;
    private int quantidade;

    public Produto(String nome, double codigo, double preco, int quantidade){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    @Override
    public String toString(){
        return "Produto: " + nome + ", ID: " + codigo + ", R$ " + preco + ", quantidade: " + quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(codigo, produto.codigo) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    // Ordenação natural:
    @Override
    public int compareTo(Produto p){
        return getNome().compareToIgnoreCase(p.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto>{
    // Ordenação personalizada:
    @Override
    public int compare(Produto p1, Produto p2){
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}