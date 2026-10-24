import java.util.Locale;
import java.util.Scanner;

public class PrecoComDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o preço do produto:");
        double preco = sc.nextDouble();

        System.out.println("Digite o desconto:");
        double desconto = sc.nextDouble();

        double precoFinal = preco - desconto;

        System.out.println("O preço final é: R$ " + precoFinal);

        sc.close();
    }
}