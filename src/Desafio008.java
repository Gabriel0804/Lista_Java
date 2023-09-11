import java.util.Scanner;

public class Desafio008 {
    public Desafio008() {

    }

    public void Executar() {
        double salario, novoSalario;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o preço o salário:");
        salario = sc.nextInt();

        novoSalario = salario * 1.15;

        System.out.println("\n Novo salário com 15% de aumento:" + novoSalario);

    }

    public static void main(String[] args) {

        Desafio008 desafio008;
        desafio008 = new Desafio008();
        desafio008.Executar();
    }
}