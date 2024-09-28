package operacoes_basicas.conjunto_convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // Criando o atributo do conjunto.
    private Set<Convidado> convidadoSet;

    // Criando o Constructor para que cada instância feita, se crie um novo conjunto.
    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        // Criando uma instância de Convidado com os valores dos parâmetros e adicionando ela no conjunto "ConvidadosSet".
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        // Não precisamos criar um conjunto de valores porque o "codigoConvite" é único.
        Convidado convidadosRemovidos = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite) {
                convidadosRemovidos = c;
                break;
            }
        }
        convidadoSet.remove(convidadosRemovidos);
    }

    public void contarConvidados(){
        System.out.println("São " + convidadoSet.size() + " convidados.");
    }

    public void exibirConvidados(){
        for(Convidado c : convidadoSet){
            System.out.println("Nome: " + c.getNome() + " | Código: " + c.getCodigoConvite());
        }
    }

    public static void main(String[] args){
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Diogo", 0);
        convidados.adicionarConvidado("Felipe", 1);
        convidados.adicionarConvidado("Daniel", 2);
        convidados.adicionarConvidado("Will", 3);
        convidados.adicionarConvidado("Fabricio", 4);
        convidados.adicionarConvidado("João", 5);

        convidados.exibirConvidados();
        convidados.contarConvidados();

        convidados.removerConvidado(4);
        convidados.removerConvidado(2);
        convidados.exibirConvidados();
        convidados.contarConvidados();
    }
}