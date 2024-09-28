package pesquisa.lista_de_tarefas;

import java.util.Objects;

public class Tarefas {
    private String descricao;
    private Boolean concluido;

    public Tarefas(String descricao){
        this.descricao = descricao;
        this.concluido = false;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public Boolean getConcluido(){
        return this.concluido;
    }

    public void setConcluido(Boolean concluido){
        this.concluido = concluido;
    }

    @Override
    public String toString(){
        return this.descricao + " está " + (this.getConcluido() ? "Concluido(a)." : "Pendente.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefas tarefas = (Tarefas) o;
        return Objects.equals(descricao, tarefas.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(descricao);
    }
}
