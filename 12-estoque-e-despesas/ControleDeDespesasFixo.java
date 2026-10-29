public class ControleDeDespesasFixo {
    public static void main(String[] args) {


        double renda = 6000;
        double energia = 900;
        double agua = 400;
        double internet = 250;

        double totaldeDespesas = (energia + agua + internet);
        double saldoRestante = (renda - totaldeDespesas);


        System.out.println("====CONTROLE DE DESPESAS====");
        System.out.println("Renda Mensal: R$ " + renda);
        System.out.println("Despesas: " + " Energia: R$ " + energia + " Água: R$ " + agua + " internet: R$ " + internet);
        System.out.println("Total das Despesas:  R$ " + totaldeDespesas);
        System.out.println("Saldo Restante: R$ " + saldoRestante);

    }
}
