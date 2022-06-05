import me.dio.desafio.dominio.Bootcamp;
import me.dio.desafio.dominio.Curso;
import me.dio.desafio.dominio.Dev;
import me.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Instanciando um curso
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição do curso Java");
        curso1.setCargaHoraria(8);

        //Instanciando um segundo curso
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Script");
        curso2.setDescricao("descrição do curso Java Script");
        curso2.setCargaHoraria(8);

        //Instanciando a mentoria
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("descrição da mentoria de java");
        mentoria1.setData(LocalDate.now());

        //Instanciando um bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descrição do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Rafael: " + devRafael.getConteudosInscritos());
        devRafael.progredir();
        System.out.println("Conteudos Concluidos de Rafael: " + devRafael.getConteudosConcluidos());

        System.out.println("------------------------------------------------");
        System.out.println("Conteudos Inscritos de Rafael: " + devRafael.getConteudosInscritos());
        System.out.println("XP: " + devRafael.calcularXpTotal());

        System.out.println("==========================================================");
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos Concluidos de Camila: " + devCamila.getConteudosConcluidos());

        System.out.println("------------------------------------------------");
        System.out.println("Conteudos Inscritos de Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP: " + devCamila.calcularXpTotal());


    }
}
