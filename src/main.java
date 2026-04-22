
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);

        // ================= BOOTCAMP =================
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // ================= DEV GABRIEL =================
        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");

        System.out.println("Conteúdos inscritos (antes): " + devGabriel.getConteudosInscritos());
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos (depois): " + devGabriel.getConteudosInscritos());

        devGabriel.progredir();
        System.out.println("Conteúdos concluídos: " + devGabriel.getConteudosConcluidos());
        System.out.println("XP: " + devGabriel.calcularTotalXp());

        // ================= DEV JOÃO =================
        Dev devJoao = new Dev();
        devJoao.setNome("João");

        System.out.println("Conteúdos inscritos (antes): " + devJoao.getConteudosInscritos());
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos (depois): " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        System.out.println("Conteúdos concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


        
    }
}
