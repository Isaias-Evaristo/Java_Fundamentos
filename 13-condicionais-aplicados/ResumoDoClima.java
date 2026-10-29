import java.util.Locale;
import java.util.Scanner;

public class ResumoDoClima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome da cidade:");
        String cidade = sc.nextLine();
        System.out.println("Digite a Temperatura:");
        double temperatura = sc.nextDouble();

        System.out.println("==== RESUMO DO CLIMA ====");
        System.out.println("Cidade: " + cidade);
        System.out.println("Temperatura: " + temperatura + " °C");

        if (temperatura < 15) {
            System.out.println(temperatura + " °C" + " Frio!");
        } else if (temperatura < 25) {
            System.out.println(temperatura + " °C" + " Agradável!");
        } else if (temperatura >= 35) {
            System.out.println(temperatura + " °C" + " Muito quente!");
        } else {
            System.out.println(temperatura + " °C" + " Quente!");
        }

        sc.close();
    }

}
