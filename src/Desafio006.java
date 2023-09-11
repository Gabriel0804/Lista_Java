import java.util.Scanner;

public class Desafio006 {
    public Desafio006() {

    }

    public void Executar() {
        double largura, altura, ar, art;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o a altura em metros:");
        altura = sc.nextInt();

        System.out.println("Informe o largura em metros:");
        largura = sc.nextInt();

        ar = largura * altura;
        
        System.out.println("\n Área da parede :" + " " + ar + " " + "m²");
        art = ar / 2;
        System.out.println("\n O quantidade de tinta necessária:" + " " + art + " " + "L");

    }

    public static void main(String[] args) {

        Desafio006 desafio06;
        desafio06 = new Desafio006();
        desafio06.Executar();
    }
}