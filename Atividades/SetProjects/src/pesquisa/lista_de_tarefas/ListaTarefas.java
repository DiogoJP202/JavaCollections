package pesquisa.lista_de_tarefas;

import java.util.Set;
import java.util.HashSet;

public class ListaTarefas {
    Set<Tarefas> listaTarefas;

    public ListaTarefas(){
        listaTarefas = new HashSet<>();
    }

    public void adicionarTarefas(String descricao){
        listaTarefas.add(new Tarefas(descricao));
        System.out.println("Tarefa adicionada.");
    }

    public void removerTarefas(String descricao){
        for(Tarefas t : listaTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                listaTarefas.remove(t);
                System.out.println("Tarefa removida!");
                break;
            }
        }
    }

    public void exibirTarefas(){
        for(Tarefas f : listaTarefas){
            System.out.println(f);
        }
    }

    public void contarTarefas(){
        System.out.println("São " + listaTarefas.stream().count() + " tarefas.");
    }

    public Set<Tarefas> obterTarefasConcluidas(){
        Set<Tarefas> tarefasConcluidas = new HashSet<>();
        for(Tarefas f : listaTarefas){
            if(f.getConcluido()) tarefasConcluidas.add(f);
        }
        return tarefasConcluidas;
    }

    public Set<Tarefas> obterTarefasPendentes(){
        Set<Tarefas> tarefasPendentes = new HashSet<>();
        for(Tarefas f : listaTarefas){
            if(!f.getConcluido()) tarefasPendentes.add(f);
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefas f : listaTarefas){
            if(f.getDescricao().equalsIgnoreCase(descricao)){
                if(!f.getConcluido()) f.setConcluido(true);
                System.out.println("Tarefa marcada como concluída.");
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefas f : listaTarefas){
            if(f.getDescricao().equalsIgnoreCase(descricao)){
                if(f.getConcluido()) f.setConcluido(false);
                System.out.println("Tarefa marcada como pendente.");
                break;
            }
        }
    }

    public void limparListaTarefas(){
        listaTarefas.clear();
        System.out.println("Lista esvaziada.");
    }

    public static void main(String[] args){
        ListaTarefas todoList = new ListaTarefas();

        todoList.adicionarTarefas("Varrer o chão");
        todoList.adicionarTarefas("Jogar");
        todoList.adicionarTarefas("Duolingo");
        todoList.adicionarTarefas("Estudar");
        todoList.adicionarTarefas("Dançar");

        todoList.contarTarefas();
        todoList.exibirTarefas();

        todoList.removerTarefas("Varrer o chão");
        todoList.marcarTarefaConcluida("Duolingo");
        todoList.marcarTarefaConcluida("Estudar");
        System.out.println(todoList.obterTarefasConcluidas());
        System.out.println(todoList.obterTarefasPendentes());

        todoList.marcarTarefaPendente("Duolingo");
        System.out.println(todoList.obterTarefasPendentes());

        todoList.limparListaTarefas();
        todoList.contarTarefas();
    }
}
