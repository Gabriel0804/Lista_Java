import java.util.Scanner;

public class Desafio017 {
    public Desafio017() {

    }

    public void Executar() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá meu nome é " + nome);

        String nomeMaiusculo = nome.toUpperCase();
        System.out.println("Nome em maiúsculas: " + nomeMaiusculo);

        String nomeMinusculo = nome.toLowerCase();
        System.out.println("Nome em minúsculas: " + nomeMinusculo);

        int quantidadeLetras = nome.replace(" ", "").length();
        System.out.println("Quantidade de letras ao todo: " + quantidadeLetras);

        String[] partesNome = nome.split(" ");
        String primeiroNome = partesNome[0];
        int letrasPrimeiroNome = primeiroNome.length();
        System.out.println("Quantidade de letras no primeiro nome: " + letrasPrimeiroNome);

    }

    public static void main(String[] args) {
        Desafio017 desafio017;
        desafio017 = new Desafio017();
        desafio017.Executar();

    }
}