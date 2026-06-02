package pkg2;

public class Gato implements Animal {

	@Override
	public void emitirSom() {
		System.out.println("Miau");
		
	}

	@Override
	public void exibirInfo() {
		System.out.println("Classe Gato: ");
		
	}

	@Override
	public boolean verificarVacina() {
		System.out.println("Verificando vacinação do gato...");
		return true;
	}
	
	

}
