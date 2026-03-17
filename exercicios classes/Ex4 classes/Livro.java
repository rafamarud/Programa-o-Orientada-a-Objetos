package Ex4Objetos;
import java.util.Scanner;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Livro l = new Livro();

        System.out.print("Título: ");
        l.titulo = teclado.nextLine();
        System.out.print("Autor: ");
        l.autor = teclado.nextLine();
        System.out.print("Ano de publicação: ");
        l.anoPublicacao = teclado.nextInt();

        System.out.println("\n--- Livro ---");
        System.out.println("Título: " + l.titulo);
        System.out.println("Autor: " + l.autor);
        System.out.println("Ano: " + l.anoPublicacao);
    }
}
