package list.ordenacao_de_numeros;

import java.util.Comparator;

public class Numero implements Comparable<Numero>{
    private int numero;

    public Numero(int numero){
        this.numero = numero;
    }

    @Override
    public int compareTo(Numero numero){
        return Integer.compare(this.numero, numero.getNumero());
    }

    public int getNumero(){
        return numero;
    }

    @Override
    public String toString(){
        return Integer.toString(numero);
    }
}

class ComparatorDecrescente implements Comparator<Numero>{

    @Override
    public int compare(Numero n1, Numero n2){
        return Integer.compare(n2.getNumero(), n1.getNumero());
    }
}