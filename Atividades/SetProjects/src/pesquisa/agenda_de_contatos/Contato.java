package pesquisa.agenda_de_contatos;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numeroTel;

    public Contato(String nome, int numeroTel){
        this.nome = nome;
        this.numeroTel = numeroTel;
    }

    public String getNome(){
        return this.nome;
    }

    public int getNumeroTel(){
        return this.numeroTel;
    }

    public void setNumeroTel(int numeroTel){
        this.numeroTel = numeroTel;
    }

    @Override
    public String toString(){
        return this.nome + " " + this.numeroTel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return numeroTel == contato.numeroTel && Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroTel);
    }
}
