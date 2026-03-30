import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex6Premio {
    public static void main(String[] args) {
        double premio = 5000.0;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.printf("Prêmio total: R$ %.2f%n", premio);
            System.out.print("Quantos ganhadores dividirão o prêmio? ");
            int ganhadores = scanner.nextInt();

            if (ganhadores == 0)
                throw new ArithmeticException("Número de ganhadores não pode ser zero.");

            double parte = premio / ganhadores;
            System.out.printf("Cada ganhador recebe: R$ %.2f%n", parte);

        } catch (InputMismatchException e) {
            System.out.println("[Erro] Digite apenas números inteiros.");
        } catch (ArithmeticException e) {
            System.out.println("[Erro] " + e.getMessage());
        }
        scanner.close();
    }
}
