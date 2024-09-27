package conjunto_de_palavras_unicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> conjuntoPalavras;

    public ConjuntoPalavrasUnicas(){
        conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        Palavra palavraRemovida = null;
        for(Palavra p : conjuntoPalavras){
            if(p.getPalavra().equalsIgnoreCase(palavra)){
                palavraRemovida = p;
                break;
            }
        }
        conjuntoPalavras.remove(palavraRemovida);
    }

    public void verificarPalavra(String palavra){
        if(conjuntoPalavras.contains(new Palavra(palavra)))
            System.out.println("'" + palavra + "'" + " está presente no conjunto.");
        else
            System.out.println("'" + palavra + "'" + " não está presente no conjunto.");
    }

    public void exibirPalavrasUnicas(){
        System.out.println("Conjunto das palavras:");
        for(Palavra p : conjuntoPalavras){
            System.out.println(p);
        }
    }

    public static void main(String[] args){
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("Banana");
        palavrasUnicas.adicionarPalavra("Joji");
        palavrasUnicas.adicionarPalavra("joji");
        palavrasUnicas.adicionarPalavra("Amaem");

        palavrasUnicas.exibirPalavrasUnicas();
        palavrasUnicas.removerPalavra("joji");
        palavrasUnicas.verificarPalavra("joji");
        palavrasUnicas.verificarPalavra("Joji");
        palavrasUnicas.exibirPalavrasUnicas();
    }
}
