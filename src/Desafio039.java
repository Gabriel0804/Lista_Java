import java.io.StringReader;

public class Desafio039 {
    public Desafio039() {

    }

    public void Executar() {
        int i;
        for (i = 0; i <= 120; i++) {
            if ((i % 3) == 0 && (i % 4) == 0) {
                System.out.println("O número " + i + "  é divisivel por 3 e 4");
            } else {
                if ((i % 3) == 0) {
                    System.out.println("O número " + i + " é divisivel por 3");

                } else {
                    if ((i % 4) == 0) {
                        System.out.println("O número " + i + " é divisivel por 4");
                    } else {
                        System.out.println("O número " + i + " não é divisivel por 3 ou 4");
                    }

                }
            }

        }

    }

    public static void main(String[] args) {
        Desafio039 desafio039;
        desafio039 = new Desafio039();
        desafio039.Executar();
    }

}