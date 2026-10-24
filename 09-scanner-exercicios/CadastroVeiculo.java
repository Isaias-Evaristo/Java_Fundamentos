import java.util.Locale;
import java.util.Scanner;

public class CadastroVeiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome do proprietário:");
        String proprietario = sc.nextLine();

        System.out.println("Digite o modelo do veículo:");
        String modelo = sc.nextLine();

        System.out.println("Digite o ano de fabricação:");
        int anoFabricacao = sc.nextInt();

        System.out.println("Digite o preço do veículo:");
        double preco = sc.nextDouble();

        System.out.println("O veículo está disponível? (true/false)");
        boolean disponivel = sc.nextBoolean();

        System.out.println("==== CADASTRO DE VEÍCULOS ====");
        System.out.println("Proprietário: " + proprietario);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoFabricacao);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Disponível: " + disponivel);

        sc.close();
    }
}