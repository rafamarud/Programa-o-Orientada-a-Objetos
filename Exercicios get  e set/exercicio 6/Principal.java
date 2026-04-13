import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite a idade: ");
        int idade = teclado.nextInt();

        teclado.nextLine();
        System.out.println("Digite o CPF: ");
        String cpf = teclado.nextLine();

        Pessoa p = new Pessoa(nome, idade, cpf);

        if (p.verificaMaiorDeIdade()) {
            System.out.println(p.getNome() + " é maior de idade.");
        } else {
            System.out.println(p.getNome() + " não é maior de idade.");
        }
    }
}
