package list.carrinho_de_compras;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private List<Item> itemCarrinho;

    public CarrinhoDeCompras(){
        this.itemCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.itemCarrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item item : this.itemCarrinho){
            if(item.getNome().equalsIgnoreCase(nome))
                itemParaRemover.add(item);
        }
        this.itemCarrinho.removeAll(itemParaRemover);
    }

    public void calcularValorTotal(){
        double total = 0;
        for(Item item : this.itemCarrinho){
            double produto = item.getPreco() * item.getQuantidade();
            total += produto;
        }
        System.out.println("Valor total do carrinho: " + total);
    }

    public void exibirItens(){
        System.out.println(itemCarrinho);
    }

    public static void main(String[] args){
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Playstation 5", 2500.0, 2);
        carrinhoDeCompras.adicionarItem("Jogo de cartas the binding of isaac", 250.0, 1);
        carrinhoDeCompras.adicionarItem("Cortador de grama", 100, 5);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
        carrinhoDeCompras.removerItem("cortador de grama");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();
    }
}
