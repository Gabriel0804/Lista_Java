public class Desafio034 {
    public Desafio034() {

    }

    public void Executar() {
        int i, soma = 0;
        for (i = 1; i <= 1000; i++) {
            soma = soma + i;
        }
        System.out.println("O valor da soma de 1 a 1000:" + soma);

    }

    public static void main(String[] args) {
        Desafio034 desafio034;
        desafio034 = new Desafio034();
        desafio034.Executar();
    }
}