import java.util.Scanner;

public class Desafio009 {
    public Desafio009() {

    }

    public void Executar() {
        double tc, tf;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celcius:");
        tc = sc.nextDouble();

        tf = (tc * 1.8) + 32;
        System.out.println("Temperatura em Fahrenheit:" + " " + tf);

    }

    public static void main(String[] args) {
        Desafio009 desafio009;
        desafio009 = new Desafio009();
        desafio009.Executar();
    }
}