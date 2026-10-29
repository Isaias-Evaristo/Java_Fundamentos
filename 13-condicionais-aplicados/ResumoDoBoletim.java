import java.util.Locale;
import java.util.Scanner;

public class ResumoDoBoletim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite sua nota:");
        double nota = sc.nextDouble();

        System.out.println("==== RESUMO DO BOLETIM ====");
        System.out.println("Aluno: " + nome);
        System.out.println("Nota: " + nota);

        if (nota >= 7) {
            System.out.println(nome + " APROVADO!");
        } else if (nota >= 5) {
            System.out.println(nome + " RECUPERAÇÃO!");
        } else {
            System.out.println(nome + " REPROVADO!");
        }
        
        sc.close();
    }
}
