public class PagamentoAbastecimento {
    public static void main(String[] args) {


        String cliente = "Paulo";
        double abastecimento = 25;
        double preco = 8;
        double valorDisponivel = 400;

        double valorTotal = preco * abastecimento;

        if (valorDisponivel >= valorTotal) {
            System.out.println("Pagamento APROVADO!");
            double troco = valorDisponivel - valorTotal;
            System.out.println("Troco: R$ " + troco);
        } else {
            System.out.println("Pagamento RECUSADO!");
        }


        System.out.println("==== POSTO DE COMBUSTÍVEL ====");
        System.out.println("Litros Abastecidos: " + abastecimento);
        System.out.println("Preço por Litro: R$ " + preco);
        System.out.println("Total do Abastecimento: R$ " + valorTotal);



    }
}
