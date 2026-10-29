public class PagamentoCompra {
    public static void main(String[] args) {


        String produto = "Teclado";
        int quantidade = 90;
        double preco = 9;
        double valorDisponivel = 500;

        double valorTotal = preco * quantidade;

        System.out.println("==== RESUMO DA COMPRA ====");
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade Disponível: " + quantidade);
        System.out.println("Preço do Produto: R$ " + preco);
        System.out.println("Valor total da Compra: R$ " + valorTotal);


        if (valorDisponivel >= valorTotal) {
            System.out.println("Pagamento Aprovado!");
            double troco = valorDisponivel - valorTotal;
            System.out.println("Troco R$ " + troco);
        } else {
            System.out.println("Pagamento RECUSADO!");
        }


    }
}
