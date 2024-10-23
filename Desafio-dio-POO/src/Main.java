import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrocap mentoria de java");
        mentoria1.setData((LocalDate.now()));

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGlayson = new Dev();
        devGlayson.setNome("glayson");
        devGlayson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos "+devGlayson.getNome()+": " + devGlayson.getConteudosInscritos());
        devGlayson.progredir();
        devGlayson.progredir();
        devGlayson.progredir();
        System.out.println("-");
        System.out.println("Conteudo inscritos "+devGlayson.getNome()+": " + devGlayson.getConteudosInscritos());
        System.out.println("Conteudo Concluidos "+devGlayson.getNome()+": " + devGlayson.getConteudosConcluidos());
        System.out.println("XP: " + devGlayson.calcularTotalXp());


        System.out.println("------------------------");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo inscritos "+devJoao.getNome()+": " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudo inscritos "+devJoao.getNome()+": " + devJoao.getConteudosInscritos());
        System.out.println("Conteudo Concluidos "+devJoao.getNome()+": " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }
}
