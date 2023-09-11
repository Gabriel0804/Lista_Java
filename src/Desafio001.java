import java.util.Scanner;

public class Desafio001 {

    public Desafio001(){ 

    }

        public void Executar() {
        int x, dobro, triplo;
        double raiz;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor:");
        x = sc.nextInt();
        dobro = x * 2;
        triplo = x * 3;
        raiz = Math.sqrt(x);
        System.out.println("O dobro do valor:" + dobro + " " + "O Triplo do valor:" + triplo + " " + "A raiz do valor:" + raiz);

    }

    public static void main(String[] args) {

        Desafio001 desafio001;
        desafio001 = new Desafio001();
        desafio001.Executar();
    }
}