package operacoes_basicas.agenda_de_contatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    // Não aceita tipo primitivo.
    // Passando que nosso conjunto vai ser formado de uma chave "String" com valores "Integer".
    private Map<String, Integer> listaContatos;

    public AgendaContatos(){
        // Criando construtor do map.
        listaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        // Usamos put, para adicionar valores no conjunto.
        listaContatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!listaContatos.isEmpty()){
            // Quando precisamos remover podemos apenas passar o valor da chave.
            listaContatos.remove(nome);
        }
    }

    public void exibirContatos(){
        for(Map.Entry<String, Integer> entry : listaContatos.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public Integer pesquisarNumeroPorNome(String nome){
        Integer telefone = null;
        if(!listaContatos.isEmpty()){
            // Retorna o valor da chave passada.
             telefone = listaContatos.get(nome);
        }
        return telefone;
    }

    public static void main(String[] args){
        AgendaContatos listaContatos = new AgendaContatos();

        listaContatos.adicionarContato("Diogo", 111);
        listaContatos.adicionarContato("Cleber", 112);
        listaContatos.adicionarContato("Felipe", 113);
        listaContatos.adicionarContato("Roberto", 114);
        listaContatos.adicionarContato("Maria", 115);
        listaContatos.adicionarContato("Anais", 116);
        // Caso a chave for repitida, o "put" na classe ira substituir o valor do map pelo valor passado.
        listaContatos.adicionarContato("Anais", 117);

        listaContatos.exibirContatos();
        System.out.println("---");
        listaContatos.removerContato("Cleber");
        listaContatos.removerContato("Maria");
        listaContatos.exibirContatos();

        System.out.println("Contato de Diogo: " + listaContatos.pesquisarNumeroPorNome("Diogo"));
    }
}
