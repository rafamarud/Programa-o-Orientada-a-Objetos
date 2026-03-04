package pkg;

import java.util.Scanner;

public class Ex3vetoresmatrizes {
	
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		
		double n, media=0, somatorio = 0;
		int j = 0;
		int[] vetor = new int[5];
		for(int i = 0; i<vetor.length; i++) {
			System.out.println("Digite a nota: "+(i+1));
			vetor[i] = teclado.nextInt();
			j++;
			somatorio += vetor[i];
		}
		media = somatorio/j;
		
		System.out.println("Media das notas: "+media);
	}
}
