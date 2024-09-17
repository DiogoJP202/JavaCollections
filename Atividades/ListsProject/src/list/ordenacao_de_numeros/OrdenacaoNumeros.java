package list.ordenacao_de_numeros;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros {
    private List<Numero> listaNumeros;

    public OrdenacaoNumeros(){
        listaNumeros = new ArrayList<>();
    }

    public List<Numero> mostrarNumeros(){
        return listaNumeros;
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(new Numero(numero));
    }

    public List<Numero> ordenarAscendente(){
        List<Numero> numerosOrdenados = new ArrayList<>(listaNumeros);
        Collections.sort(numerosOrdenados);
        return numerosOrdenados;
    }

    public List<Numero> ordenarDescendente(){
        List<Numero> numerosOrdenados = new ArrayList<>(listaNumeros);
        Collections.sort(numerosOrdenados, new ComparatorDecrescente());
        return numerosOrdenados;
    }


    public static void main(String[] args){
        OrdenacaoNumeros listaDeNumeros = new OrdenacaoNumeros();

        listaDeNumeros.adicionarNumero(5);
        listaDeNumeros.adicionarNumero(25);
        listaDeNumeros.adicionarNumero(30);
        listaDeNumeros.adicionarNumero(10);
        listaDeNumeros.adicionarNumero(20);
        listaDeNumeros.adicionarNumero(15);

        System.out.println(listaDeNumeros.mostrarNumeros());
        System.out.println(listaDeNumeros.ordenarDescendente());
        System.out.println(listaDeNumeros.ordenarAscendente());
    }
}
