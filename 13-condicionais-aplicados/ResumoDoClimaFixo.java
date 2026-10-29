public class ResumoDoClimaFixo {
    public static void main(String[] args) {

        String cidade = "Recife";
        double temperatura = 10;

        System.out.println("==== RESUMO DO CLIMA ====");
        System.out.println("Cidade: " + cidade);
        System.out.println("Temperatura: " + temperatura + "°C");

        if (temperatura < 15) {
            System.out.println("Frio!");
        } else if (temperatura < 25) {
            System.out.println("Agradável!");
        } else if (temperatura >= 35) {
            System.out.println("Muito Quente!");
        }   else {
            System.out.println("Quente!");
        }
    }
}
