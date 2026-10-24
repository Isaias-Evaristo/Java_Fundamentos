import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu peso:");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura em metros:");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso!");
        } else if (imc < 25) {
            System.out.println("Peso ideal!");
        } else if (imc < 30) {
            System.out.println("Levemente acima do peso!");
        } else if (imc < 35) {
            System.out.println("Obesidade Grau I");
        } else if (imc < 40) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        System.out.println("O cálculo do IMC é: " + imc);

        sc.close();
    }
}