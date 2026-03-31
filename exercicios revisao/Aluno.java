package pkg;

public class Aluno {
	
	public String nome;
	public Float nota1;
	public Float nota2;
	public Float nota3;
	
	public Aluno(String nome,Float nota1, Float nota2, Float nota3) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public float calcularMedia() {
		return (nota1 + nota2 + nota3)/2;
	}
	
	public boolean aprovado() {
		return calcularMedia() >=7;
	}
	
	public float maiorNota() {
		float maior = nota1;
        if (nota2 > maior) maior = nota2;
        if (nota3 > maior) maior = nota3;
        return maior;
    }

	public float menorNota() {
		float menor = nota1;
		if (nota2 < menor) menor = nota2;
        if (nota3 < menor) menor = nota3;
        return menor;		
	}


public static void main(String[]args) {
	
	Aluno a1 = new Aluno("Joao", 5f, 6f, 8f);
	float media = a1.calcularMedia();
	
	System.out.println("Nome aluno: "+a1.nome);
	
	System.out.println("Notas do aluno:");
	System.out.println("Nota1: "+a1.nota1);
	System.out.println("Nota2:"+a1.nota2);
	System.out.println("Nota3:"+a1.nota3);
	
	System.out.println("Maior nota:  "+a1.menorNota());
	
	System.out.println("Menor nota: "+a1.maiorNota());
	
	System.out.println("Media do aluno: "+ media);
	
	System.out.println("Aprovado?: "+a1.aprovado());
	}
}
	
	
	


