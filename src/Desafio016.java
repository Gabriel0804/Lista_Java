import java.util.Scanner;

public class Desafio016 {
    public Desafio016() {

    }

    public void Executar() {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero:");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O número é impar");
        }

    }

    public static void main(String[] args) {
        Desafio016 desafio016;
        desafio016 = new Desafio016();
        desafio016.Executar();
    }
}