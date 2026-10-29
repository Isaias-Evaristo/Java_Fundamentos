import java.util.Locale;
import java.util.Scanner;

public class BoletimEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite sua Primeira Nota:");
        double primeiraNota = sc.nextDouble();
        System.out.println("Digite sua Segunda Nota:");
        double segundaNota = sc.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        System.out.println("====BOLETIM ESCOLAR====");
        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: " + primeiraNota);
        System.out.println("Nota 2: " + segundaNota);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Situação: " + nome + " foi APROVADO!");
        } else if (media >= 5) {
            System.out.println("Situação: " + nome + " está em RECUPERAÇÃO!");
        } else {
            System.out.println("Situação: " + nome + " foi REPROVADO!");
        }

        sc.close();
    }
}
