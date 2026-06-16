package pkg3;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		Produto produto = new Produto ("ABVC", "Exemplo de produto", 9.99, "Campo temporario");
		
		try {
			FileOutputStream arquivoSaida = new FileOutputStream("produto.ser");
			ObjectOutputStream objetoSaida = new ObjectOutputStream(arquivoSaida);
			
			objetoSaida.writeObject(produto);
			objetoSaida.close();
			arquivoSaida.close();
			
			System.out.println("Objeto serializado e salvo em produto.ser");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream arquivoEntrada = new FileInputStream("produto.ser");
			ObjectInputStream objetoEntrada = new ObjectInputStream(arquivoEntrada);
			
			Produto produtoDesserializado = (Produto) objetoEntrada.readObject();
			objetoEntrada.close();
			arquivoEntrada.close();
			
			System.out.println("Objeto disserializado: " + produtoDesserializado);
			System.out.println("Vai apresentar NULL: " + produtoDesserializado.getTemporario());	
		}catch (IOException | ClassNotFoundException e) {
			 e.printStackTrace();
		}

	}

}
