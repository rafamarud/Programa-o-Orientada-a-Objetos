package Ex5Objetos;
import java.util.Scanner;

public class ProdutoExecutavel {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produto p = new Produto();

        System.out.print("Nome do produto: ");
        p.nome = teclado.nextLine();
        System.out.print("Preço: ");
        p.preco = teclado.nextDouble();
        System.out.print("Quantidade em estoque: ");
        p.quantidadeEmEstoque = teclado.nextInt();

        double totalEstoque = p.preco * p.quantidadeEmEstoque;

        System.out.println("\n--- Produto ---");
        System.out.println("Nome: " + p.nome);
        System.out.println("Preço: R$ " + p.preco);
        System.out.println("Quantidade: " + p.quantidadeEmEstoque);
        System.out.println("Valor total em estoque: R$ " + totalEstoque);
    }
}
