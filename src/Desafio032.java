import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio032 {
    public Desafio032() {

    }

    public void Executar() {

        Scanner sc = new Scanner(System.in);

        List<String> nomeAlunos = new ArrayList<>();
        List<Integer> idadesAlunos = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o nome do aluno: ");
            String nome = sc.nextLine();
            nomeAlunos.add(nome);

            System.out.println("Digite a idade do aluno: ");
            int idade = sc.nextInt();
            sc.nextLine();

            idadesAlunos.add(idade);

        }

        double somaIdades = 0;

        for (int idade : idadesAlunos) {
            somaIdades += idade;
        }

        double idadeMediaTurma = somaIdades / idadesAlunos.size();

        System.out.println("A idade média da turma é: " + idadeMediaTurma);
    }

    public static void main(String[] args) {
        Desafio032 desafio032;
        desafio032 = new Desafio032();
        desafio032.Executar();

    }
}