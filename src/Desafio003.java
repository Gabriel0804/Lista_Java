import java.util.Scanner;

public class Desafio003 {

    public Desafio003() {

    }

    public void Executar() {
        double num1, res, res2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a medida em metros :");
        num1 = sc.nextDouble();

        res = num1 * 100;
        res2 = num1 * 1000;

        System.out.println("A medida em centímetros" + " " + res + " " + "medida em milímetros" + " " + res2);
    }

    public static void main(String[] args) {

        Desafio003 desafio003;
        desafio003 = new Desafio003();
        desafio003.Executar();
    }
}