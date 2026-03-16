package Ex1Objetos;
import java.util.Scanner;

public class CarroExecutavel {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Carro c1 = new Carro();
        System.out.print("Marca do carro 1: ");
        c1.marca = teclado.nextLine();
        System.out.print("Modelo do carro 1: ");
        c1.modelo = teclado.nextLine();
        System.out.print("Ano de fabricação do carro 1: ");
        c1.anoFabricacao = teclado.nextInt();
        teclado.nextLine();

        Carro c2 = new Carro();
        System.out.print("Marca do carro 2: ");
        c2.marca = teclado.nextLine();
        System.out.print("Modelo do carro 2: ");
        c2.modelo = teclado.nextLine();
        System.out.print("Ano de fabricação do carro 2: ");
        c2.anoFabricacao = teclado.nextInt();

        System.out.println("\n--- Carro 1 ---");
        System.out.println("Marca: " + c1.marca);
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Ano: " + c1.anoFabricacao);

        System.out.println("\n--- Carro 2 ---");
        System.out.println("Marca: " + c2.marca);
        System.out.println("Modelo: " + c2.modelo);
        System.out.println("Ano: " + c2.anoFabricacao);
    }
}
