package agenda_de_contatos;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
    Set<Contato> contatos;

    public AgendaContatos(){
        contatos = new HashSet<>();
    }

    public void adicionaContato(String nome, int numeroTel){
        contatos.add(new Contato(nome, numeroTel));
    }

    public void exibirContatos(){
        for(Contato c : contatos){
            System.out.println(c);
        }
    }

    public void pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatos){
            if(c.getNome().startsWith(nome)) contatosPorNome.add(c);
        }
        for(Contato c : contatosPorNome){
            System.out.println(c);
        }
    }

    public void atualizarNumeroContato(String nome, int numeroTel){
        for(Contato c : contatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                System.out.println("O número de " + c.getNome() + ": " + c.getNumeroTel() + " foi atualizado para: " + numeroTel);
                c.setNumeroTel(numeroTel);
                break;
            }
        }
    }

    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionaContato("Diogo", 11111);
        agendaContatos.adicionaContato("Franscisco", 11112);
        agendaContatos.adicionaContato("Roberto", 11113);
        agendaContatos.adicionaContato("Júlia", 11114);
        agendaContatos.adicionaContato("Maria", 11115);
        agendaContatos.adicionaContato("Fernanda", 11116);
        agendaContatos.adicionaContato("Julios", 11117);
        agendaContatos.adicionaContato("Romério", 11118);
        agendaContatos.adicionaContato("Maria", 11119);

        agendaContatos.exibirContatos();

        agendaContatos.pesquisarPorNome("Diogo");
        agendaContatos.pesquisarPorNome("Maria");
        agendaContatos.atualizarNumeroContato("Maria", 666 );
        agendaContatos.pesquisarPorNome("Maria");
    }
}
