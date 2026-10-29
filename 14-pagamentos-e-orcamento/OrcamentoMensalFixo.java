public class OrcamentoMensalFixo {
    public static void main(String[] args) {

        String cliente = "Paulo";
        double salario = 4000;
        double agua = 250;
        double energia = 500;
        double internet = 300;

        double despesas = (agua + energia + internet);

        System.out.println("==== RESUMO DAS DESPESAS ====");

        System.out.println("Cliente: " + cliente);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Energia: R$ " + energia);
        System.out.println("Água: R$ " + agua);
        System.out.println("Internet: R$ " + internet);
        System.out.println("Total de despesas: R$ " + despesas);

        if (despesas <= salario) {
            System.out.println("Orçamento dentro do limite!");
            double restodoSalario = salario - despesas;
            System.out.println("Valor restante: R$ " + restodoSalario);
        } else {
            System.out.println("Orçamento insuficiente!");
        }


    }
}
