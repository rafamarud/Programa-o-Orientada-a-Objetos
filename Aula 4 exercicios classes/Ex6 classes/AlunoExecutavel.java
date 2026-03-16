package Ex6Objetos;
import java.util.Scanner;

public class AlunoExecutavel {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.print("Nome: ");
        a.nome = teclado.nextLine();
        System.out.print("Matrícula: ");
        a.matricula = teclado.nextLine();
        System.out.print("Nota 1: ");
        a.nota1 = teclado.nextDouble();
        System.out.print("Nota 2: ");
        a.nota2 = teclado.nextDouble();
        System.out.print("Nota 3: ");
        a.nota3 = teclado.nextDouble();

        double media = (a.nota1 + a.nota2 + a.nota3) / 3;

        System.out.println("\n--- Aluno ---");
        System.out.println("Nome: " + a.nome);
        System.out.println("Matrícula: " + a.matricula);
        System.out.println("Nota 1: " + a.nota1);
        System.out.println("Nota 2: " + a.nota2);
        System.out.println("Nota 3: " + a.nota3);
        System.out.printf("Média: %.2f%n", media);

        if (media >= 6) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}
