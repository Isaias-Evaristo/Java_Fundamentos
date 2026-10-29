import java.util.Scanner;

public class CentralDeAtendimento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite a opção desejada:");
        int opcao = sc.nextInt();

        System.out.println("==== CENTRAL DE ATENDIMENTO ====");
        System.out.println("Cliente: " + nome);
        System.out.println("Opção: " + opcao);

        switch (opcao) {
            case 1:
                System.out.println("Consultar Pedidos:");
                break;
            case 2:
                System.out.println("Solicitar Suporte:");
                break;
            case 3:
                System.out.println("Falar com Atendimento:");
                break;
            case 4:
                System.out.println("Encerrar Atendimento:");
                break;
            default:
                System.out.println("Opção Inválida!");
        }
        
        sc.close();
    }
}
