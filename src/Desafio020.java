import java.util.Scanner;

public class Desafio020 {

    public Desafio020() {

    }

    public void Executar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:  ");
        String frase = sc.nextLine();

        String fraseSubstituida = frase.replaceAll("[Aa]", "&");

        System.out.println("Frase com as letras 'A' ou 'a' substituídas por '&':");
        System.out.println(fraseSubstituida);

    }

    public static void main(String[] args) {
        Desafio020 desafio020;
        desafio020 = new Desafio020();
        desafio020.Executar();
    }
}