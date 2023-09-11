import java.util.Scanner;

public class Desafio025 {
    public Desafio025() {

    }

    public void Executar() {
        double a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        a = sc.nextDouble();

        System.out.println("Informe o segundo numero :");
        b = sc.nextDouble();

        c = (Math.pow(a, 2)) + (-2 * (a * b)) + (Math.pow(b, 2));

        System.out.println("O quadrado da diferença entre:" + " " + a + " " + " e" + " " + b + " " + "=" + " " + c);
    }

    public static void main(String[] args) {
        Desafio025 desafio025;
        desafio025 = new Desafio025();
        desafio025.Executar();
    }
}