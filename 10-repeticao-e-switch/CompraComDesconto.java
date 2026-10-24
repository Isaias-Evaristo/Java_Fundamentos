import java.util.Locale;
import java.util.Scanner;

public class CompraComDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual é o nome do produto?");
        String produto = sc.nextLine();

        System.out.println("Digite o preço:");
        double preco = sc.nextDouble();

        System.out.println("Digite a quantidade desejada:");
        int quantidade = sc.nextInt();

        double subTotal = quantidade * preco;
        double desconto = 0;

        for (int contador = 1; contador <= quantidade; contador++) {
            System.out.println("Quantidade de item: " + contador);
        }

        if (quantidade <= 4) {
            desconto = 0;
        } else if (quantidade <= 9) {
            desconto = 10;
        } else {
            desconto = 20;
        }

        double valorTotal = subTotal - desconto;

        System.out.println("===== RESUMO DA COMPRA =====");
        System.out.println("Produto: " + produto);
        System.out.println("Total de itens: " + quantidade);
        System.out.println("Subtotal: R$ " + subTotal);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total a pagar: R$ " + valorTotal);

        sc.close();
    }
}