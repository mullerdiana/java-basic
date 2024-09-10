import java.util.Scanner;

public class VelocidadeMedia {

    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;
        for (String velocidade : velocidades) {
            total += Double.parseDouble(velocidade.trim());
        }
        return total/velocidades.length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        System.out.println("Passe as velocidades separadas por vírgula:");
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");
        System.out.println("velocidades: "+velocidades);

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");

        scanner.close();
    }
    @Override
    public String toString() {
        return "Main []";
    }
}