import java.util.Scanner;

public class Desafio026 {
    public Desafio026() {

    }

    public void Executar() {
        Double r, v;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o Raio da esfera em metros:");
        r = sc.nextDouble();

        v = 4 * Math.PI * (Math.pow(r, 3));

        System.out.printf("O volume da esfera é :%.2fm³%n", v);
    }

    public static void main(String[] args) {
        Desafio026 desafio026;
        desafio026 = new Desafio026();
        desafio026.Executar();
    }
}