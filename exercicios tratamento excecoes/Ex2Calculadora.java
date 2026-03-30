import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro número: ");
            double a = scanner.nextDouble();

            System.out.print("Digite o operador (+, -, *, /): ");
            String op = scanner.next();

            System.out.print("Digite o segundo número: ");
            double b = scanner.nextDouble();

            double resultado;
            switch (op) {
                case "+": resultado = a + b; break;
                case "-": resultado = a - b; break;
                case "*": resultado = a * b; break;
                case "/":
                    if (b == 0)
                        throw new ArithmeticException("Divisão por zero não é permitida.");
                    resultado = a / b;
                    break;
                default:
                    throw new IllegalArgumentException("Operador inválido: " + op);
            }
            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("[Erro] Digite apenas números válidos.");
        } catch (ArithmeticException e) {
            System.out.println("[Erro] " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("[Erro] " + e.getMessage());
        }
        scanner.close();
    }
}
