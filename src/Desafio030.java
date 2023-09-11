import java.util.Scanner;

public class Desafio030 {
    public Desafio030() {

    }

    public void Executar() {

        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros = 5;

        int maiorNumero = Integer.MIN_VALUE; 
        int menorNumero = Integer.MAX_VALUE; 

        for (int i = 1; i <= quantidadeNumeros; i++) {
            
            System.out.println("Digite o número " + i + ": ");
            int numero = sc.nextInt();

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
            if (numero < menorNumero) {
                menorNumero = numero;
            }

        }

       System.out.println("O maior número é: " + maiorNumero);
       System.out.println("O menor número é: " + menorNumero);

    }

    public static void main(String[] args) {
        Desafio030 desafio030;
        desafio030 = new Desafio030();
        desafio030.Executar();

    }
}