import java.util.Scanner;

public class Desafio023 {
    public Desafio023() {

    }

    public void Executar() {
        float alt, lar, comp, v;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a Altura em metros:");
        alt = sc.nextFloat();

        System.out.println("Informe a Largura metros:");
        lar = sc.nextFloat();

        System.out.println("Informe o Comprimento metros:");
        comp = sc.nextFloat();

        v = alt * lar * comp;

        System.out.println("A caixa D' água possui um volume de :" + v + " " + "m³");

    }

    public static void main(String[] args) {
        Desafio023 desafio023;
        desafio023 = new Desafio023();
        desafio023.Executar();
    }
}