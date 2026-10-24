public class PostoDeCombustivel {
    public static void main(String[] args) {

        String motorista = "Carlos";
        String combustivel = "Gasolina";
        double precoPorLitro = 6.00;
        double quantidadeDeLitros = 20;
        double valorPago = 150;

        double total = precoPorLitro * quantidadeDeLitros;
        double troco = valorPago - total;

        System.out.println("==== POSTO DE COMBUSTÍVEL ====");
        System.out.println("Motorista: " + motorista);
        System.out.println("Combustível: " + combustivel);
        System.out.println("Preço por litro: R$ " + precoPorLitro);
        System.out.println("Litros abastecidos: " + quantidadeDeLitros);

        System.out.println("==== RESUMO DO PAGAMENTO ====");
        System.out.println("Total abastecido: R$ " + total);
        System.out.println("Valor pago: R$ " + valorPago);
        System.out.println("Troco: R$ " + troco);
    }
}