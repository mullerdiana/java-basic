package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(Set<Contato> contatoSet) {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    
    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos(null);

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Laura", 1234560);
        agendaContatos.adicionarContato("Laura", 1);
        agendaContatos.adicionarContato("Laura", 12);
        agendaContatos.adicionarContato("Laura Rieck", 1);
        agendaContatos.adicionarContato("Contato 4", 1234560);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Contato"));
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Contato 4", 555));

    }
}
