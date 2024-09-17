package list.tarefas;
// Importando o List e ArrayList.
import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    // Criando uma lista do tipo "list.tarefas.Tarefa" da classe que criamos.
    // Atribuindo o nome de "tarefaList"
    private List<Tarefa> tarefaList;

    public ListaDeTarefas(){
        // Sempre que instaciarmos a classe list.tarefas.ListaDeTarefas, criaremos um atributo com uma lista vazia.
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){

        /*
            O método equalsIgnoreCase é uma função disponível na classe String em Java que compara duas strings, ignorando a diferença entre maiúsculas e minúsculas.
        */
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args){
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        System.out.println("O número total de elementos na lista é: " + listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.adicionarTarefa("list.tarefas.Tarefa 01");
        System.out.println("O número total de elementos na lista é: " + listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.adicionarTarefa("list.tarefas.Tarefa 01");
        System.out.println("O número total de elementos na lista é: " + listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.adicionarTarefa("list.tarefas.Tarefa 02");
        System.out.println("O número total de elementos na lista é: " + listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.adicionarTarefa("list.tarefas.Tarefa 03");
        System.out.println("O número total de elementos na lista é: " + listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.removerTarefa("list.tarefas.Tarefa 01");
        System.out.println("O número total de elementos na lista é: " + listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.obterDescricoesTarefas();
    }
}
