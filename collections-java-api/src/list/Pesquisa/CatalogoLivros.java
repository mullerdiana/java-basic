package list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    //atributo

    private List<Livro> livroLista;

    public CatalogoLivros() {this.livroLista = new ArrayList<>();}

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroLista.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroLista.isEmpty()){
            for (Livro l : livroLista) {
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroLista.isEmpty()){
            for (Livro l : livroLista) {
                if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
    Livro livroPorTitulo = null;
    if(!livroLista.isEmpty()){
        for (Livro l : livroLista) {
           if(l.getTitulo().equalsIgnoreCase(titulo)){
            livroPorTitulo = l;
            break;
           } 
        }
    }
    return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 1990);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 1995);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2000);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2020);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1995,1998));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 4"));
    }
}
