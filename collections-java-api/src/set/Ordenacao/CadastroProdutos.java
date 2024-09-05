package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exiProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 9", 15.90, 7);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 199.90, 7);
        cadastroProdutos.adicionarProduto(9L, "Produto 9", 135.90, 7);
        cadastroProdutos.adicionarProduto(3L, "Produto 2", 5.90, 7);
        cadastroProdutos.adicionarProduto(9L, "Produto 8", 5.90, 7);


        cadastroProdutos.exibirProdutosPorNome();
        System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.exiProdutosPorPreco());
    }

}
