package pkg;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Joao", 20);
		Aluno aluno2 = new Aluno("Maria", 21);
		Aluno aluno3 = new Aluno("Pedro", 19);
		
		try {
			FileWriter arquivo = new FileWriter("Alunos.txt");
			BufferedWriter escritor = new BufferedWriter(arquivo);
			
			escritor.write(aluno1.getNome() + "," + aluno1.getIdade());
			escritor.newLine();
			
			escritor.write(aluno2.getNome() + "," + aluno2.getIdade());
			escritor.newLine();
			
			escritor.write(aluno3.getNome() + "," + aluno3.getIdade());
			escritor.newLine();
			
			escritor.close();
			arquivo.close();
			
			System.out.println("Alunos salvos no arquivo.txt");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
			
		

	}

}
