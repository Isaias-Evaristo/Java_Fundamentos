public class CondicionalSimples {
    public static void main(String[] args) {

        String nome = "Isaias";
        String produto = "Teclado";
        double precoUnitario = 50.00;
        int quantidade = 5;
        double total = precoUnitario * quantidade;

        System.out.println("Cliente: " + nome);
        System.out.println("Produto: " + produto);
        System.out.println("Valor total a pagar: " + total);

        if (total >= 200) {
            System.out.println("Parabéns! Você ganhou Frete Grátis!");
        } else {
            System.out.println("Frete normal: R$ 15.00");
        }
    }
}