public class FormaDePagamento {
    public static void main(String[] args) {

        String cliente = "Paulo";
        int opcao = 4;

        System.out.println("==== RESUMO DO SISTEMA ====");
        System.out.println("Cliente: " + cliente);
        System.out.println("Opção: " + opcao);

        switch (opcao) {
            case 1:
                System.out.println("Pix");
                break;
            case 2:
                System.out.println("Cartão de Débito");
                break;
            case 3:
                System.out.println("Cartão de Credito");
                break;
            case 4:
                System.out.println("Dinheiro");
                break;
            default:
                System.out.println("Forma de pagamento Inválida!");
        }

    }
}
