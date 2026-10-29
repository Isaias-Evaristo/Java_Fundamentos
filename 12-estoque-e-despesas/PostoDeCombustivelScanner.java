import java.util.Locale;
import java.util.Scanner;

public class PostoDeCombustivelScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual é o nome do motorista?");
        String motorista = sc.nextLine();
        System.out.println("Qual é o tipo de combustível?");
        String combustivel = sc.nextLine();
        System.out.println("Digite o preço por litro do combustível:");
        double preco = sc.nextDouble();
        System.out.println("Qual é quantidade de litros desejada?");
        double quantidade = sc.nextDouble();
        System.out.println("Digite o valor do pagamento:");
        double pagamento = sc.nextDouble();

        double total = preco * quantidade;
        double troco = pagamento - total;

        System.out.println("=====POSTO DE COMBUSTÍVEL=====");
        System.out.println("Motorista: " + motorista);
        System.out.println("Combustível: " + combustivel);
        System.out.println("Total Abastecido: " + total + " R$");
        System.out.println("Valor Pago: " + pagamento + " R$");
        System.out.println("Troco: " + troco + " R$");

        sc.close();
    }
}
