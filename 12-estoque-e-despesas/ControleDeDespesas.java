import java.util.Locale;
import java.util.Scanner;

public class ControleDeDespesas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite sua renda mensal:");
        double renda = sc.nextDouble();
        System.out.println("Digite o valor da Água:");
        double agua = sc.nextDouble();
        System.out.println("Digite o valor da Internet:");
        double internet = sc.nextDouble();
        System.out.println("Digite o valor da Energia:");
        double energia = sc.nextDouble();

        double calculoTotal = (agua + internet + energia);
        double saldoRestante = (renda - calculoTotal);

        System.out.println("=====RESUMO FINANCEIRO=====");
        System.out.println("Renda Mensal: R$ " + renda);
        System.out.println("Água: R$ " + agua);
        System.out.println("Energia: R$ " + energia);
        System.out.println("Internet: R$ " + internet);
        System.out.println("Total de Despesas: R$ " + calculoTotal);
        System.out.println("Saldo Restante: R$ " + saldoRestante);

        sc.close();
    }
}
