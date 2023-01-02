import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Java2");
        curso2.setDescricao("Descrição curso Java2");
        curso2.setCargaHoraria(4);

        //System.out.println(curso1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos Vinícius");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcos: " + devMarcos.getConteudosInscritos());

        devMarcos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Marcos: " + devMarcos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marcos: " + devMarcos.getConteudosConcluidos());

        System.out.println("XP: " + devMarcos.calcularTotalXp());

        System.out.println("------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());

        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
