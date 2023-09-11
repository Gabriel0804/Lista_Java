import java.util.Scanner;

public class Desafio035 { 
   public Desafio035() {
   }
   public void Executar() {
      for (int i = 1; i <= 100; i++) {
         if (i % 3 == 0) {
             System.out.println(i);
         }
     }
   }
   public static void main(String[] args) {
      Desafio035 desafio035 = new Desafio035();
      desafio035.Executar();
   }  
}

