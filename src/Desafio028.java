import java.util.Scanner;

public class Desafio028 {
    public Desafio028() {

    }

    public void Executar() {
        double litros, Km, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a kilometragem:");
        Km = sc.nextDouble();

        System.out.println("Informe a quantidade de Litros de combustivel");
        litros = sc.nextDouble();

        c = Km / litros;

        System.out.println("O consumo de combustivel durante a viagem foi:" + c + "Km/L");

    }

    public static void main(String[] args) {
        Desafio028 desafio028;
        desafio028 = new Desafio028();
        desafio028.Executar();

    }
}