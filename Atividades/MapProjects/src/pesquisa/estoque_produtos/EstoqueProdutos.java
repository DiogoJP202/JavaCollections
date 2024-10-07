package pesquisa.estoque_produtos;

import java.util.Map;
import java.util.HashMap;
//  Importação para manipular números decimais.
import java.text.DecimalFormat;

public class EstoqueProdutos {
    Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos(){
        estoqueProdutos = new HashMap<>();
    }

    public void adicionarProdutor(long id, String nome, double preco, int qtd){
        // Usando um id como chave e uma classe como valor.
        estoqueProdutos.put(id, new Produto(nome, preco, qtd));
    }

    public void imprimirProdutos(){
        // inteiração sobre um map.
        for(Map.Entry<Long, Produto> p : estoqueProdutos.entrySet()){
            System.out.println(p.getKey() + " - " + p.getValue());
        }
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        // Definindo um padrão para um número decimal, no caso, duas casas pós a vírgula.
        DecimalFormat df = new DecimalFormat("#.00");
        if(!estoqueProdutos.isEmpty()){
            // inteiração sobre os valores da nossa lista map.
            for(Produto p : estoqueProdutos.values()){
                valorTotalEstoque += p.getPreco() * p.getQtd();
            }
        }
        // Retornando valor com apenas duas casas decímais pós vírgula.
        return Double.parseDouble(df.format(valorTotalEstoque));
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        // Pegando o menor valor de um decímal.
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutos.isEmpty()){
            for(Produto p : estoqueProdutos.values()){
                if(p.getPreco() > maiorPreco){
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBatato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutos.isEmpty()){
            for(Produto p : estoqueProdutos.values()){
                if(p.getPreco() < menorPreco){
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaisCaro = null;
        // Pegando o mair valor de um decímal.
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutos.isEmpty()){
            for(Produto p : estoqueProdutos.values()){
                if(p.getPreco() * p.getQtd() > maiorPreco){
                    maiorPreco = p.getPreco() * p.getQtd();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args){
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProdutor(1, "PS5", 3999.49, 20);
        estoque.adicionarProdutor(2, "Smart TV", 1399.99, 9);
        estoque.adicionarProdutor(3, "Cadeira Gamer", 500, 40);
        estoque.adicionarProdutor(4, "Skate", 309.99, 32);
        estoque.adicionarProdutor(5, "Geladeira", 7000, 2);

        estoque.imprimirProdutos();
        System.out.println(estoque.calcularValorTotalEstoque());
        System.out.println(estoque.obterProdutoMaisCaro());
        System.out.println(estoque.obterProdutoMaisBatato());
        System.out.println(estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
