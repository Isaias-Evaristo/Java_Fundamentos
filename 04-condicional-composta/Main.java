public class Main {
    public static void main(String[] args) {

        String nome = "Joao";
        double n1 = 5.5;
        double n2 = 4.0;
        double media = (n1 + n2) / 2;

        System.out.println("A média de " + nome + " foi " + media);

        if (media >= 7) {
            System.out.println("Parabéns, você foi APROVADO!");
        } else if (media >= 5) {
            System.out.println("Atenção você está de RECUPERAÇÃO!");
        } else {
            System.out.println("Infelizmente você foi REPROVADO!");
        }
    }
}