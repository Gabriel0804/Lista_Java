import java.util.Scanner;

public class Desafio021 {
    public Desafio021() {

    }

    public void Executar() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salário atual: R$ ");
        double salarioAtual = sc.nextDouble();

        double reajuste = 0.0;

        if (salarioAtual < 1700) {
            reajuste = 300.0;
        } else {
            reajuste = 200.0;
        }

        double novoSalario = salarioAtual + reajuste;

        System.out.println("Reajuste: R$ " + reajuste);
        System.out.println("Novo salário: R$ " + novoSalario);

    }

    public static void main(String[] args) {
        Desafio021 desafio021;
        desafio021 = new Desafio021();
        desafio021.Executar();

    }
}