import java.util.Scanner;

public class Desafio002 {

    public Desafio002() {

    }

    public void Executar() {
        double num1, num2, res;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a primeira nota:");
        num1 = sc.nextDouble();
        System.out.println("Informe a segunda nota:");
        num2 = sc.nextDouble();

        res = (num1 + num2) / 2;

        System.out.println("A média da nota" + " " + res);
    }

    public static void main(String[] args) {

        Desafio002 desafio002;
        desafio002 = new Desafio002();
        desafio002.Executar();
    }
}