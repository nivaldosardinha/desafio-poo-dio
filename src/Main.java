import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        Curso curso2 = new Curso();
        curso2.setTitulo("curso java script");
        curso2.setDescricao("descrição curso java script");
        curso2.setCargaHoraria(8);
        System.out.println(curso1);
        System.out.println(curso2);
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("mentoria Java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);
    }
}
