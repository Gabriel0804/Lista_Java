import java.util.Scanner;

public class Desafio005 {
    public Desafio005() {

    }

    public void Executar() {
        double num, res;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor em reais:");
        num = sc.nextInt();

        res = num / 5;
        System.out.println("O valor em doletas:" + " " + "$" + res);

    }

    public static void main(String[] args) {

        Desafio005 desafio005;
        desafio005 = new Desafio005();
        desafio005.Executar();
    }
}