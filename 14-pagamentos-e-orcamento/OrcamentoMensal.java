import java.util.Locale;
import java.util.Scanner;

public class OrcamentoMensal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite seu salário:");
        double salario = sc.nextDouble();

        System.out.println("Digite o valor da despesa da água:");
        double agua = sc.nextDouble();

        System.out.println("Digite o valor da despesa da energia:");
        double energia = sc.nextDouble();

        System.out.println("Digite o valor da despesa da internet:");
        double internet = sc.nextDouble();

        double calculodaDespesa = (agua + energia + internet);


        System.out.println("==== RESUMO DAS DESPESAS ====");
        System.out.println("Cliente: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Água: R$ " + agua);
        System.out.println("Energia: R$ " + energia);
        System.out.println("Internet: R$ " + internet);
        System.out.println("Total de despesas: R$ " + calculodaDespesa);

        if (calculodaDespesa <= salario) {
            System.out.println("Orçamento APROVADO!");
            double valorRestante = salario - calculodaDespesa;
            System.out.println("Valor restante: R$ " + valorRestante);
        } else {
            System.out.println("Orçamento INSUFICIENTE!");

        }

        sc.close();
    }
}
