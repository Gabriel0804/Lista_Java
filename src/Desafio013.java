import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Desafio013 {
    public Desafio013() {

    }

    public void Executar() {

        List<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Informe a quantidade de alunos");
        int qtdA = sc.nextInt();

        for (int i = 1; i <= qtdA; i++) {

            System.out.println("Informe o nome do aluno: ");
            String Nome = sc.next();
            lista.add(Nome);

        }

        int indiceSorteado = random.nextInt(lista.size());
        String alunoEscolhido = lista.get(indiceSorteado);

        System.out.println("O aluno escolhido para apagar o quadro : " + alunoEscolhido);

    }

    public static void main(String[] args) {
        Desafio013 desafio013;
        desafio013 = new Desafio013();
        desafio013.Executar();

    }
}