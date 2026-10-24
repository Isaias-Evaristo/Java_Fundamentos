public class LimiteDeVelocidade {
    public static void main(String[] args) {

        int velocidade = 85;

        if (velocidade <= 60) {
            System.out.println("Dentro do limite!");
        } else if (velocidade <= 80) {
            System.out.println("Atenção!");
        } else {
            System.out.println("Velocidade muito alta!");
        }
    }
}