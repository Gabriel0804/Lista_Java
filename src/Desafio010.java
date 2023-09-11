import java.util.Scanner;

public class Desafio010 {
    public Desafio010() {

    }

    public void Executar() {
        double Kmp, Dal, pre;

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de Km percorrido:");
        Kmp = sc.nextDouble();

        System.out.print("Informe a quantidade de dias alugados:");
        Dal = sc.nextDouble();

        pre = (Kmp * 0.15) + (Dal * 60);

        System.out.println("Preço a pagar:" + " " + "R$" + pre);

    }

    public static void main(String[] args) {
        Desafio010 desafio010;
        desafio010 = new Desafio010();
        desafio010.Executar();

    }
}