import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio033 {
    public Desafio033() {

    }

    public void Executar() {
        Scanner sc = new Scanner(System.in);

        List<String> nomePessoa = new ArrayList<>();
        List<Integer> idadePessoa = new ArrayList<>();

        // Lista de nomes com 10 pessoas
        nomePessoa.add("Gabriel");
        nomePessoa.add("Éricka");
        nomePessoa.add("Américo");
        nomePessoa.add("Marta");
        nomePessoa.add("Milton");
        nomePessoa.add("Cristiane");
        nomePessoa.add("Ricardo");
        nomePessoa.add("Regiane");
        nomePessoa.add("Júlia");
        nomePessoa.add("Ellen");

        // Preencher a lista de idades com as idades das 10 pessoas
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade de " + nomePessoa.get(i) + ": ");
            int idade = sc.nextInt();
            sc.nextLine(); 

            idadePessoa.add(idade);
        }

        int countMaioresDe18 = 0;

        for (int idade : idadePessoa) {
            if (idade > 18) {
                countMaioresDe18++;
            }
        }

        System.out.println("Quantidade de pessoas com mais de 18 anos: " + countMaioresDe18);
    }

    public static void main(String[] args) {
        Desafio033 desafio33;
        desafio33 = new Desafio033();
        desafio33.Executar();
    }
}