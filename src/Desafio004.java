import java.util.Scanner;

public class Desafio004 {
    public Desafio004() {

    }

    public void Executar() {
        int num, res;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da tabuada:");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            res = num * i;
            System.out.println(num + " " + "*" + " " + i + " " + "=" + " " + res);
        }

    }

    public static void main(String[] args) {

        Desafio004 desafio004;
        desafio004 = new Desafio004();
        desafio004.Executar();
    }

}