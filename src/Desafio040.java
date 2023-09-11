import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio040 {
   public Desafio040() {
   }

   public void Executar() {
      Scanner sc = new Scanner(System.in);

      List<String> nomesPessoas = new ArrayList<>();
      List<Double> alturaPessoas = new ArrayList<>();
      List<Integer> matriculaPessoas = new ArrayList<>();
      double maiorAltura = Double.MIN_VALUE; 
      double menorAltura = Double.MAX_VALUE;

      // Preencher a lista de nomes de 10 pessoas
      nomesPessoas.add("Daniel");
      nomesPessoas.add("Miguel");
      nomesPessoas.add("Gabriel");
      nomesPessoas.add("Leonardo");
      nomesPessoas.add("Ronalo");
      nomesPessoas.add("Romário");
      nomesPessoas.add("Juan");
      nomesPessoas.add("Diego");
      nomesPessoas.add("Juliano");
      nomesPessoas.add("Paulo");

      // Preencher a lista do tamanho com a altura das 10 pessoas
      for (int i = 0; i < 1; i++) {
         System.out.print("Digite a altura " + nomesPessoas.get(i) + ": ");
         double altura = sc.nextDouble();
         // sc.nextLine(); // Limpa o buffer

         alturaPessoas.add(altura);
         System.out.println("Digite a matrícula " + nomesPessoas.get(i) + ": ");
         int matricula = sc.nextInt();
         matriculaPessoas.add(matricula);

         if (altura > maiorAltura) {
            maiorAltura = altura;
        }
        if (altura < menorAltura) {
            menorAltura = altura;
        }
      }
      System.out.println("Nome do Aluno " + nomesPessoas);
      System.out.println("Pessoa com maior altura " + alturaPessoas.size());
      System.out.println("Código da matrícula " + matriculaPessoas);
      System.out.println("Nome do Aluno" + nomesPessoas); 
      System.out.println("Pessoa com menor altura " + alturaPessoas.size());
      System.out.println("Código da matrícula " + matriculaPessoas);

   }

   public static void main(String[] args) {
      Desafio040 desafio040 = new Desafio040();
      desafio040.Executar();
   }
}
