import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio037 {
    public Desafio037() {

    }

    public void Executar() {
        Scanner sc = new Scanner(System.in);

        List<String> nomesFuncionarios = new ArrayList<>();
        List<Double> salariosFuncionarios = new ArrayList<>();

        nomesFuncionarios.add("Matheus");
        nomesFuncionarios.add("Leonardo");
        nomesFuncionarios.add("Gabriel");

        for (int i = 0; i < nomesFuncionarios.size(); i++) {
            System.out.print("Digite o salário de " + nomesFuncionarios.get(i) + ":R$ ");
            double salario = sc.nextDouble();
            sc.nextLine(); 

            salariosFuncionarios.add(salario);
        }

        for (int i = 0; i < nomesFuncionarios.size(); i++) {
            double salario = salariosFuncionarios.get(i);
            double salarioReajustado = calcularSalarioReajustado(salario);
            salariosFuncionarios.set(i, salarioReajustado);
        }

        for (int i = 0; i < nomesFuncionarios.size(); i++) {
            System.out.println(
                    "Salário de " + nomesFuncionarios.get(i) + " reajustado: R$" + salariosFuncionarios.get(i));
        }
    }

    private double calcularSalarioReajustado(double salario) {
        if (salario <= 300.00) {
            return salario * 1.5; 
        } else {
            return salario * 1.3; 
        }
    }

    public static void main(String[] args) {
        Desafio037 desafio37;
        desafio37 = new Desafio037();
        desafio37.Executar();
    }
}