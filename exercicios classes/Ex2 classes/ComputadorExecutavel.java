package Ex2Objetos;
import java.util.Scanner;

public class ComputadorExecutavel {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Objeto 1 - dados pelo usuário
        Computador c1 = new Computador();
        System.out.print("Marca: ");
        c1.marca = teclado.nextLine();
        System.out.print("Modelo: ");
        c1.modelo = teclado.nextLine();
        System.out.print("Tipo (notebook/tablet/etc): ");
        c1.tipo = teclado.nextLine();
        System.out.print("Preço: ");
        c1.preco = teclado.nextDouble();

        // Objeto 2 - valores fixos no código
        Computador c2 = new Computador();
        c2.marca = "Dell";
        c2.modelo = "Inspiron 15";
        c2.tipo = "Notebook";
        c2.preco = 3500.00;

        System.out.println("\n--- Computador 1 ---");
        System.out.println("Marca: " + c1.marca);
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Tipo: " + c1.tipo);
        System.out.println("Preço: R$ " + c1.preco);

        System.out.println("\n--- Computador 2 ---");
        System.out.println("Marca: " + c2.marca);
        System.out.println("Modelo: " + c2.modelo);
        System.out.println("Tipo: " + c2.tipo);
        System.out.println("Preço: R$ " + c2.preco);
    }
}
