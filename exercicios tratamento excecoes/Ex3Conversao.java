import java.util.Scanner;

public class Ex3Conversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String para int
        try {
            System.out.print("Digite um número inteiro (será lido como texto): ");
            String entrada = scanner.nextLine();
            int numero = Integer.parseInt(entrada);
            System.out.println("Convertido para int: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("[Erro] Não foi possível converter para int: " + e.getMessage());
        }

        // String para double
        try {
            System.out.print("Digite um número decimal (será lido como texto): ");
            String entrada = scanner.nextLine();
            double numero = Double.parseDouble(entrada);
            System.out.println("Convertido para double: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("[Erro] Não foi possível converter para double: " + e.getMessage());
        }

        scanner.close();
    }
}
