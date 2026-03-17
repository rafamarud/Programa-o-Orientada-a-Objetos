package Ex3Objetos;
import java.util.Scanner;

public class Pessoa {
    String nome;
    int idade;
    String genero;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.print("Nome: ");
        p.nome = teclado.nextLine();
        System.out.print("Idade: ");
        p.idade = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Gênero: ");
        p.genero = teclado.nextLine();

        System.out.println("\n--- Pessoa ---");
        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
        System.out.println("Gênero: " + p.genero);
    }
}
