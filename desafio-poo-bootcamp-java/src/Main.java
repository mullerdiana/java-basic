import java.time.LocalDate;

import br.com.bootcamp.desafio.dominio.Bootcamp;
import br.com.bootcamp.desafio.dominio.Curso;
import br.com.bootcamp.desafio.dominio.Dev;
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
    

// System.out.println(curso1);
// System.out.println(curso2);
// System.out.println(mentoria1);

Bootcamp bootcamp1 = new Bootcamp();
bootcamp1.setNome("Bootcamp Java SpringBoot");
bootcamp1.setDescricao("Descrição Bootcamp Java SpringBoot");
bootcamp1.getConteudos().add(curso1);
bootcamp1.getConteudos().add(curso2);
bootcamp1.getConteudos().add(mentoria1);


Dev devDiana = new Dev();
devDiana.setNome("Diana");
devDiana.inscreverBootcamp(bootcamp1);
System.out.println("Conteúdos Inscritos" + devDiana.getConteudosInscritos());
devDiana.progredir();
System.out.println("Conteúdos Inscritos" + devDiana.getConteudosInscritos());
System.out.println("Conteúdos Concluídos" + devDiana.getConteudosConcluidos());
System.out.println("Pontuação dessa aluna" + devDiana.calcularTotalXp());

Dev devNome1 = new Dev();
devNome1.setNome("Nome");
}
}
