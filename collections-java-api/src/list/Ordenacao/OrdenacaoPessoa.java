package list.Ordenacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaLista;

    public OrdenacaoPessoa() {
        this.pessoaLista = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double d) {
        pessoaLista.add(new Pessoa(nome, idade, d));
    }

    public List<Pessoa> ordenarPessoaPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaLista);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaLista);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Nome 1", 23, 1.79);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 13, 1.48);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 3, 0.89);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 43, 1.78);

        System.out.println(ordenacaoPessoa.ordenarPessoaPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
