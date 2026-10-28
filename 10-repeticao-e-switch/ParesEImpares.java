import java.util.Scanner;

public class ParesEImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = sc.nextInt();

        System.out.println("Digite um segundo número maior que o primeiro:");
        int numero2 = sc.nextInt();

        if (numero2 > numero) {

            System.out.println("Escolha uma opção:");
            System.out.println("1 - Mostrar números pares");
            System.out.println("2 - Mostrar números ímpares");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Mostrando números pares...");
                    for (int i = numero; i <= numero2; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                    break;

                case 2:
                    System.out.println("Mostrando números ímpares...");
                    for (int i = numero; i <= numero2; i++) {
                        if (i % 2 != 0) {
                            System.out.println(i);
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } else {
            System.out.println("O segundo número precisa ser maior que o primeiro.");
        }

        sc.close();
    }
}
