import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1RaizQuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Digite um número inteiro: ");
                int numero = scanner.nextInt();
                if (numero < 0)
                    throw new ArithmeticException("Número negativo não possui raiz real.");
                System.out.printf("Raiz quadrada de %d = %.4f%n", numero, Math.sqrt(numero));
                break;
            } catch (InputMismatchException e) {
                System.out.println("[Erro] Digite apenas números inteiros.");
                scanner.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("[Erro] " + e.getMessage());
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
