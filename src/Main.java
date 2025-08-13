import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Cusro Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Cusro js");
        curso1.setDescricao("Descrição curso js");
        curso1.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setData(LocalDate.now());
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setTitulo("Mentoria de Java");

        System.out.println(curso1);
        System.out.println(mentoria1);

    }

}