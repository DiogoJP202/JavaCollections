package list.ordenacao_de_pessoas;

import java.util.Comparator;

// Implementa o Comparable para a classe Pessoa e passando que tipo generico ela irá comparar, no caso, <Pessoa>.
public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Método que fará a comparação:
    // Aqui ele já deixa preparado como será feito a comparação quando o a ordenação for requisitada.
    @Override
    public int compareTo(Pessoa pessoa){
        // Usando o método compare da classe Integer para comparar dois valores.
        return Integer.compare(this.idade, pessoa.getIdade());
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }

    public String toString(){
        return "Pessoa: " + " Nome = " + nome + " Idade = " + idade + " Altura = " + altura + ";";
    }
}

class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        // Usando o método compare da classe Double para comparar dois valores.
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
