import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o lado A: ");
        double ladoA = teclado.nextDouble();

        System.out.println("Digite o lado B: ");
        double ladoB = teclado.nextDouble();

        System.out.println("Digite o lado C: ");
        double ladoC = teclado.nextDouble();

        Triangulo t = new Triangulo(ladoA, ladoB, ladoC);

        if (t.verificaEquilatero()) {
            System.out.println("O triângulo é equilátero.");
        } else {
            System.out.println("O triângulo não é equilátero.");
        }
    }
}
