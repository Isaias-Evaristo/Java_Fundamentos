import java.util.Locale;
import java.util.Scanner;

public class CadastroPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual é o seu nome?");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();

        System.out.println("===== CADASTRO REALIZADO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " m");

        sc.close();
    }
}