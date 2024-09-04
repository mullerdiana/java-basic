package list.Ordenacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaLista;

    public OrdenacaoPessoa() {
        this.pessoaLista = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, int altura){
        pessoaLista.add(new Pessoa(nome, idade, altura));
    }
    
    public List<Pessoa> ordenarPessoaPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaLista);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    
}
