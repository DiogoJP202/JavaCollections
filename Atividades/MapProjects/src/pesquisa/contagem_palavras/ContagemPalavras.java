package pesquisa.contagem_palavras;

import java.util.Map;
import java.util.HashMap;

public class ContagemPalavras {
    Map<String, Integer> palavras;

    public ContagemPalavras(){
        palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        System.out.println("Palavra '" + palavra + "' adicionada.");
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (palavras.isEmpty()){
            System.out.println("Lista vazia.");
        } else {
            System.out.println("Palavra '" + palavra + "' removida.");
            palavras.remove(palavra);
        }
    }

    public void exibirContagemPalavras(){
        if (!palavras.isEmpty()){
            for (Map.Entry<String, Integer> p : palavras.entrySet()){
                System.out.println("Palavra: " + p.getKey() + " - Contagem: " + p.getValue());
            }
        }
    }

    public String encontrarPalavraMaisFrequente(){
        String palavra = null;
        int contagem = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> p : palavras.entrySet()){
            if(p.getValue() > contagem){
                contagem = p.getValue();
                palavra = p.getKey();
            }
        }
        return palavra;
    }

    public static void main(String[] args){
        ContagemPalavras texto = new ContagemPalavras();

        texto.adicionarPalavra("falar", 50);
        texto.adicionarPalavra("subir", 30);
        texto.adicionarPalavra("conta", 40);
        texto.adicionarPalavra("sua", 300);
        texto.adicionarPalavra("depressão", 10);
        texto.adicionarPalavra("outra", 100);

        texto.exibirContagemPalavras();
        texto.removerPalavra("sua");

        System.out.println("Palavra mais repetida: " + texto.encontrarPalavraMaisFrequente());
    }
}