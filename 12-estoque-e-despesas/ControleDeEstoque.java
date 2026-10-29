import java.util.Locale;
import java.util.Scanner;

public class ControleDeEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual é o Produto:");
        String produto = sc.nextLine();
        System.out.println("Digite o Preço:");
        double preco = sc.nextDouble();
        System.out.println("Informe a Quantidade Desejada:");
        int quantidade = sc.nextInt();
        System.out.println();
        double valorTotal = preco * quantidade;

        System.out.println("====CONTROLE DE ESTOQUE====");

        System.out.println("Nome do Produto: " + produto);
        System.out.println("Preço Unitário: " + preco);
        System.out.println("Quantidade Recebida: " + quantidade);


        System.out.println("====RESUMO DO ESTOQUE====");
        System.out.println("Produto: " + produto);
        System.out.println("Preço Unitário: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidade);
        System.out.println("Valor Total: R$ " + valorTotal);

        sc.close();
    }

}
