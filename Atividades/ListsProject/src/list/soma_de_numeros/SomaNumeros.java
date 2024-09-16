package list.soma_de_numeros;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
    List<Numero> numeros;

    public SomaNumeros(){
        numeros = new ArrayList<>();
    }

    public void adicionaNumero(int numero){
          numeros.add(new Numero(numero));
    }

    public List<Numero> calculaSoma(int numero){
        List<Numero> numerosSomados = new ArrayList<>();
        if(numeros.isEmpty()){
            System.out.println("Lista vazia.");
        } else {
            for(Numero n : numeros){
                Numero sum  = new Numero(n.getNumero() + numero);
                numerosSomados.add(sum);
            }
        }
        return numerosSomados;
    }

    public Numero encontrarMaiorNumero(){
        Numero maiorNumero = new Numero(0);
        if(numeros.isEmpty()){
            System.out.println("Lista vazia.");
        } else {
            for(Numero n : numeros){
                if(n.getNumero() > maiorNumero.getNumero())
                    maiorNumero.setNumero(n.getNumero());
            }
        }
        return maiorNumero;
    }

    public Numero encontrarMenorNumero(){
        Numero menorNumero = new Numero(0);
        if(numeros.isEmpty()){
            System.out.println("Lista vazia.");
        } else {
            for(Numero n : numeros){
                if(n.getNumero() < menorNumero.getNumero())
                    menorNumero.setNumero(n.getNumero());
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(numeros);
    }

    public static void main(String[] args){
        SomaNumeros listaNumeros = new SomaNumeros();

        listaNumeros.adicionaNumero(5);
        listaNumeros.adicionaNumero(10);
        listaNumeros.adicionaNumero(15);
        listaNumeros.adicionaNumero(20);
        listaNumeros.adicionaNumero(25);
        listaNumeros.adicionaNumero(30);

        System.out.println(listaNumeros.calculaSoma(5));
        System.out.println(listaNumeros.encontrarMaiorNumero());
        System.out.println(listaNumeros.encontrarMenorNumero());
        listaNumeros.exibirNumeros();
    }
}
