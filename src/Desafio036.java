import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio036 {
    public Desafio036() {

    }

    public void Executar() {

        Scanner sc = new Scanner(System.in);

        List<String> nomesPessoas = new ArrayList<>();
        List<Integer> idadesPessoas = new ArrayList<>();
        List<String> nacionalidadesPessoas = new ArrayList<>();

        nomesPessoas.add("Leonardo");
        nomesPessoas.add("Marlon");
        nomesPessoas.add("Carlos");
        nomesPessoas.add("Ana");
        nomesPessoas.add("Marcos");
        nomesPessoas.add("Henrique");
        nomesPessoas.add("Sandro");
        nomesPessoas.add("Felipe");
        nomesPessoas.add("Gabriel");
        nomesPessoas.add("Ericka");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade de " + nomesPessoas.get(i) + ": ");
            int idade = sc.nextInt();
            sc.nextLine(); 
            idadesPessoas.add(idade);

            System.out.print("Digite a nacionalidade de " + nomesPessoas.get(i) + ": ");
            String nacionalidade = sc.nextLine();
            nacionalidadesPessoas.add(nacionalidade);

        }

        int aptosAVotar = 0;
        int naoAptosAVotar = 0;

        for (int i = 0; i < 10; i++) {
            int idade = idadesPessoas.get(i);
            String nacionalidade = nacionalidadesPessoas.get(i);

            if (idade > 16 && nacionalidade.equalsIgnoreCase("brasileira")) {
                aptosAVotar++;
            } else {
                naoAptosAVotar++;
            }
        }

        System.out.println("Pessoas aptas a votar: " + aptosAVotar);
        System.out.println("Pessoas não aptas a votar: " + naoAptosAVotar);
    }

    public static void main(String[] args) {
        Desafio036 desafio036;
        desafio036 = new Desafio036();
        desafio036.Executar();

    }

}