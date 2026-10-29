public class ControleDeEstoqueFixo {
    public static void main(String[] args) {


        String produto = "Caneta";
        double preco = 4.00;
        int quantidade = 25;

        double total = preco * quantidade;

        System.out.println("====CONTROLE DE ESTOQUE====");
        System.out.println("Produto: " + produto);
        System.out.println("Preço: " + preco + " R$");
        System.out.println("Quantidade Recebida: " + quantidade);

        System.out.println("====RESUMO DO ESTOQUE====");
        System.out.println("Produto Armazenado: " + produto);
        System.out.println("Quantidade em Estoque: " + quantidade);
        System.out.println("Valor total em estoque: " + total + " R$");


    }

}
