package ordenacao.lista_de_alunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private final String nome;
    private final String matricula;
    private final double media;

    public Aluno(String nome, String matricula, double media){
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome(){
        return this.nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public double getMedia(){
        return this.media;
    }

    @Override
    public int compareTo(Aluno aluno){
        return getNome().compareToIgnoreCase(aluno.getNome());
    }

    @Override
    public String toString(){
        return "Aluno: " + nome + ", Média: " + media + ", Matrícula: " + matricula + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
}

class ComparatorPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2){
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}