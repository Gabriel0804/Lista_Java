import java.util.Scanner;

public class Desafio029 {
    public Desafio029() {

    }

    public void Executar() {
        Double mes, prestacao, juros, novaPrestacao;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de meses: ");
        mes = sc.nextDouble();

        System.out.println("Digite o valor da prestação: ");
        prestacao = sc.nextDouble();

        System.out.println("Digite a taxa de juros: ");
        juros = sc.nextDouble();

        novaPrestacao = prestacao * juros * mes;

        System.out.println("O novo valor da prestação é: " + novaPrestacao); 
    }

    public static void main(String[] args) {
        Desafio029 desafio029;
        desafio029 = new Desafio029();
        desafio029.Executar();

    }
}