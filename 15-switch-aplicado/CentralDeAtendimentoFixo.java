public class CentralDeAtendimentoFixo {
    public static void main(String[] args) {

        String cliente = "João";
        int opcao = 4;

        System.out.println("==== CENTRAL DE ATENDIMENTO ====");
        System.out.println("Cliente: " + cliente);
        System.out.println("Opção: " + opcao);

        switch (opcao) {
            case 1:
                System.out.println("Consultar Pedidos:");
                break;
            case 2:
                System.out.println("Solicitar Suporte:");
                break;
            case 3:
                System.out.println("Falar com Atendente:");
                break;
            case 4:
                System.out.println("Encerrar Atendimento:");
                break;
            default:
                System.out.println("Opção Inválida");
        }

    }
}
