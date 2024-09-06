package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroDoContatoPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroDoContatoPorNome = agendaContatoMap.get(nome);
        }
        return numeroDoContatoPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Dalva", 99468);
        agendaContatos.adicionarContato("Lucas", 99575);
        agendaContatos.adicionarContato("Diana", 99135);
        agendaContatos.adicionarContato("Laura", 98234);
        agendaContatos.adicionarContato("Diana", 99999);

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Laura");
        agendaContatos.exibirContatos();

        System.out.println("Resultado da consulta de telefone para o nome Diana: " + agendaContatos.pesquisarPorNome("Diana"));

    }

}
