public class Main {
    public static void main(String[] args) {
        // 2. OBJETO: a palavra mágica 'new' cria a conta de verdade na memória!
        ContaBancaria minhaConta = new ContaBancaria();

        // Preenchendo os ATRIBUTOS desse objeto específico
        minhaConta.numero = 1001;
        minhaConta.titular = "seu nome";
        minhaConta.saldo = 100.0;

        // Chamando o MÉTODO para executar a ação
        minhaConta.depositar(50.0);

        // Exibindo o saldo final
        System.out.println("Saldo atual: R$" + minhaConta.saldo);

    }
}

