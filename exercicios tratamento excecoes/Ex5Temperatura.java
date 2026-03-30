import java.util.Scanner;

public class Ex5Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius (ex: 25.5): ");
        String entrada = scanner.nextLine();

        try {
            double celsius = Double.parseDouble(entrada);
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("%.1f°C = %.1f°F%n", celsius, fahrenheit);
        } catch (NumberFormatException e) {
            System.out.println("[Erro] Valor inválido: use ponto como separador decimal (ex: 25.5).");
        }
        scanner.close();
    }
}
