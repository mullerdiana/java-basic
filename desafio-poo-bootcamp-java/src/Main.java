import java.time.LocalDate;

import br.com.bootcamp.desafio.dominio.Curso;
import br.com.bootcamp.desafio.dominio.Mentoria;

public class Main {
public static void main(String[] args) {
    // Instanciando os objetos
    Curso curso1 = new Curso();
    curso1.setTitulo("curso Java");
    curso1.setDescricao("Descrição do curso de Java");
    curso1.setCargaHoraria(60);
   
    Curso curso2 = new Curso();
    curso2.setTitulo("Java Script");
    curso2.setDescricao("Descrição do curso de Java Script");
    curso2.setCargaHoraria(50);
    
    Mentoria mentoria1 = new Mentoria();

    mentoria1.setTitulo("Mentoria Java");
    mentoria1.setDescricao(null);
    mentoria1.setData(LocalDate.now());
    

System.out.println(curso1);
System.out.println(curso2);
System.out.println(mentoria1);

}
}
