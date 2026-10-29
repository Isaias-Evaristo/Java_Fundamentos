public class BoletimEscolarFixo {
    public static void main(String[] args) {

        String aluno = "Paulo";
        double nota1 = 8.00;
        double nota2 = 7.00;

        double media = (nota1 + nota2) / 2;

        System.out.println("====BOLETIM ESCOLAR====");
        System.out.println("Aluno: " + aluno);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println(aluno + " foi  APROVADO!");
        } else if (media >= 5) {
            System.out.println(aluno + " está em RECUPERAÇÃO!");
        } else {
            System.out.println(aluno + " foi REPROVADO!");
        }


    }
}
