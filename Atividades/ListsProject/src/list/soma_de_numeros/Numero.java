package list.soma_de_numeros;

public class Numero {
    private int numero;

    public Numero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String toString(){
        return  Integer.toString(this.numero);
    }
}
