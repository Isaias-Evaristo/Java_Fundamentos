public class ResumoDoBoletimFixo {
    public static void main(String[] args) {


        String nome = "Paulo";
        double nota = 8;

        System.out.println("==== RESUMO DO BOLETIM ====");
        System.out.println("Aluno: " + nome);
        System.out.println("Nota: " + nota);

        if (nota >= 7) {
            System.out.println(nome + " APROVADO!");
        } else if (nota >= 5) {
            System.out.println(nome + " RECUPERAÇÃO!");
        } else {
            System.out.println(nome + " REPROVADO!");
        }
    }
}
