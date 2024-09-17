package list.ordenacao_de_pessoas;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas); // Passando uma lista existente para o ArrayList.
        Collections.sort(pessoasPorIdade); // Ordenando a lista de acordo com Comparable da classe Pessoa.
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        // Falando que queremos ordenar pessoasPorAltura através da classe ComparatorPorAltura. Se não passarmos esse valor, irá para o método Comparable.
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas listaDePessoas = new OrdenacaoPessoas();

        listaDePessoas.adicionarPessoa("João", 41, 1.50);
        listaDePessoas.adicionarPessoa("Maria", 23, 1.70);
        listaDePessoas.adicionarPessoa("Renato", 53, 1.60);
        listaDePessoas.adicionarPessoa("Fernando", 15, 1.80);
        listaDePessoas.adicionarPessoa("Joaquina", 32, 1.40);
        listaDePessoas.adicionarPessoa("Elias", 10, 1.20);

        System.out.println(listaDePessoas.listaPessoas);
        System.out.println(listaDePessoas.ordenarPorAltura());
        System.out.println(listaDePessoas.ordenarPorIdade());
    }
}
