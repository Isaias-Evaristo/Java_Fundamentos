public class OperadorLogico {
    public static void main(String[] args) {

        String produto = "mouse";
        double preco = 25.50;
        int quantidade = 8;
        boolean disponivel = true;
        double valorTotal = quantidade * preco;

        if (quantidade >= 10 && disponivel == true) {
            System.out.println("Disponível!");
        } else {
            System.out.println("Indisponível!");
        }

        System.out.println("O valor total do " + produto + " é " + valorTotal);
    }
}