public class DescontoPorValor {
    public static void main(String[] args) {

        String cliente = "Paulo";
        double preco = 600;
        double desconto = 0;


        if (preco >= 500) {
            desconto = 0.20;
            System.out.println("Desconto Aplicado: " + (desconto * 100) + "%");
        } else if (preco >= 200) {
            desconto = 0.10;
            System.out.println("Desconto Aplicado: " + (desconto * 100) + "%");
        } else {
            desconto = 0;
            System.out.println("Sem desconto");
        }

        double valorDoDesconto = preco * desconto;
        double precoFinal = preco - valorDoDesconto;

        System.out.println("Valor do desconto: R$ " + valorDoDesconto);
        System.out.println("Preço final: R$ " + precoFinal);


        System.out.println("==== RESUMO DA COMPRA ====");
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor da compra: R$ " + preco);
        System.out.println("Valor do desconto: R$ " + valorDoDesconto);
        System.out.println("Total a pagar: R$ " + precoFinal);

    }
}
