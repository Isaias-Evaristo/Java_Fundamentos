import java.util.Locale;
import java.util.Scanner;

public class SituacaoDoAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua nota:");
        double nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("Aluno Aprovado!");
        } else if (nota >= 6) {
            System.out.println("Aluno em Recuperação!");
        } else {
            System.out.println("Aluno Reprovado!");
        }

        System.out.println("A nota é: " + nota);

        sc.close();
    }
}