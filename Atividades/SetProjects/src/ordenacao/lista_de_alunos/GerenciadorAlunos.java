package ordenacao.lista_de_alunos;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> listaAlunos;

    public GerenciadorAlunos(){
        listaAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, String matricula, double media){
        listaAlunos.add(new Aluno(nome, matricula, media));
        System.out.println("Aluno adicionado.");
    }

    public void removerAluno(String matricula){
        for(Aluno a : listaAlunos){
            if(a.getMatricula().equalsIgnoreCase(matricula)){
                listaAlunos.remove(a);
                System.out.println("Aluno removido.");
                break;
            }
        }
    }

    public void exibirAlunos(){
        for(Aluno a : listaAlunos){
            System.out.println(a);
        }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(listaAlunos);
        for(Aluno a : alunosPorNome){
            System.out.println(a);
        }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(listaAlunos);
        for(Aluno a : alunosPorNota){
            System.out.println(a);
        }
    }

    public static void main(String[] args){
        GerenciadorAlunos listaAlunos = new GerenciadorAlunos();

        listaAlunos.adicionarAluno("Diogo", "323212", 8.5);
        listaAlunos.adicionarAluno("Alan", "254212", 4.1);
        listaAlunos.adicionarAluno("Felipe", "899854", 7.1);
        listaAlunos.adicionarAluno("João", "120032", 5.5);
        listaAlunos.adicionarAluno("Renato", "110099", 7.2);

        listaAlunos.exibirAlunos();
        System.out.println("---");
        listaAlunos.exibirAlunosPorNome();
        System.out.println("---");
        listaAlunos.removerAluno("120032");
        listaAlunos.exibirAlunosPorNota();
    }
}