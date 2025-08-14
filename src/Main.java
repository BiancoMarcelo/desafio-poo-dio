import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Cusro Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Cusro js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setData(LocalDate.now());
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setTitulo("Mentoria de Java");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);



        Dev dev = new Dev();
        dev.setNome("Marcelo Bianco");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + dev.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + dev.getConteudosConcluidos());
        System.out.println(dev.calcularTotalXp());
        dev.progredir();
        System.out.println("Conteudos Concluidos " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());
        dev.progredir();
        System.out.println("XP: " + dev.calcularTotalXp());


        Dev dev1 = new Dev();
        dev1.setNome("João");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + dev1.getConteudosInscritos());



    }

}