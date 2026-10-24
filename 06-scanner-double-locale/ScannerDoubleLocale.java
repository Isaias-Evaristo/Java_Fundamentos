import java.util.Scanner;
import java.util.Locale;

public class ScannerDoubleLocale {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome do produto:");
        String nome = sc.nextLine();

        System.out.println("Digite o preço unitário do produto:");
        double preco = sc.nextDouble();

        System.out.println("Digite a quantidade:");
        int quantidade = sc.nextInt();

        double total = preco * quantidade;

        if (quantidade >= 6) {
            System.out.println("Disponível!");
        } else {
            System.out.println("Indisponível!");
        }

        System.out.println("O valor total é de: " + total);

        sc.close();
    }
}