package operacoes_basicas.dicionario;

import java.util.Map;
import java.util.HashMap;

public class Dicionario {
    Map<String, String> dicionario;

    public Dicionario(){
        dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionario.isEmpty())
            dicionario.remove(palavra);
    }

    public void exibirPalavras(){
        for(Map.Entry<String, String> p : dicionario.entrySet()){
            System.out.println(p.getKey() + " - " + p.getValue());
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String p = null;
        if(!dicionario.isEmpty())
            p = dicionario.get(palavra);
        return p;
    }

    public static void main(String[] args){
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Arroz", "É um tipo de comida.");
        dicionario.adicionarPalavra("Skate", "É um veículo.");
        dicionario.adicionarPalavra("Computador", "É um dispositivo eletrônico.");
        dicionario.adicionarPalavra("Quadro", "Um lugar para armazenar figuras.");
        dicionario.exibirPalavras();
        dicionario.removerPalavra("Quadro");
        dicionario.exibirPalavras();
        System.out.println("Procurando definição para Skate: " + dicionario.pesquisarPorPalavra("Skate"));
    }
}
