import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4Array {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Carlos", "Maria", "João", "Lucia"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Posições disponíveis: 0 a 4");
        try {
            System.out.print("Digite um índice: ");
            int indice = scanner.nextInt();

            if (indice < 0 || indice >= nomes.length)
                throw new ArrayIndexOutOfBoundsException("Índice " + indice + " não existe no array.");

            System.out.println("Nome na posição " + indice + ": " + nomes[indice]);

        } catch (InputMismatchException e) {
            System.out.println("[Erro] Digite apenas números inteiros.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("[Erro] " + e.getMessage());
        }
        scanner.close();
    }
}
