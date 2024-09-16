package list.tarefas;

// Criando uma estrutura para cada tarefa da nossa lista.
public class Tarefa {
    private String descricao;

    // Constructor
    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    // Modifica como será mostrando quando pedir para mostrar a lista. No caso, foi quando "obterDescricoesTarefas" é execultado.
    @Override
    public String toString(){
        return this.descricao;
    }
}
