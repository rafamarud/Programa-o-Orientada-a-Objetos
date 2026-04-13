import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a marca: ");
        String marca = teclado.nextLine();

        System.out.println("Digite o modelo: ");
        String modelo = teclado.nextLine();

        System.out.println("Digite o ano: ");
        int ano = teclado.nextInt();

        Carro c = new Carro(marca, modelo, ano);

        c.exibeDetalhes();
    }
}
