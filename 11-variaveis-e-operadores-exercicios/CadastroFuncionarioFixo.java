public class CadastroFuncionarioFixo {
    public static void main(String[] args) {

        String nome = "Marcos Oliveira";
        int idade = 28;
        double salario = 3200.50;
        boolean funcionarioAtivo = true;

        if (funcionarioAtivo) {
            System.out.println("Funcionário ativo!");
        } else {
            System.out.println("O funcionário está inativo!");
        }

        System.out.println("Cadastro realizado!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Salário: R$ " + salario);
    }
}