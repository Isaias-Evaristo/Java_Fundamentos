public class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso");
    }
}