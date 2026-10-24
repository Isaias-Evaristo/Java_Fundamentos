import java.util.Scanner;

public class ScannerBasico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Qual é sua idade?");
        int idade = sc.nextInt();

        System.out.println("Olá, " + nome + "! você tem " + idade + " anos");

        sc.close();
    }
}