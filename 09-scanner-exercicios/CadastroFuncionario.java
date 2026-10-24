import java.util.Locale;
import java.util.Scanner;

public class CadastroFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        System.out.println("Digite seu salário:");
        double salario = sc.nextDouble();

        System.out.println("Funcionário está ativo? (true/false):");
        boolean funcionarioAtivo = sc.nextBoolean();

        if (funcionarioAtivo) {
            System.out.println("Funcionário Ativo!");
        } else {
            System.out.println("Funcionário Inativo!");
        }

        System.out.println("Cadastro realizado!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Salário: R$ " + salario);

        sc.close();
    }
}