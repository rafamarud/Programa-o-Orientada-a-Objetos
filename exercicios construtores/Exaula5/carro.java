package Exaula5;

public class carro {
	public String marca;
	public String modelo;
	
	public carro(String marcaCarro, String modeloCarro) {
		System.out.println("Estou no construtor");
		marca = marcaCarro;
		modelo = modeloCarro;
	}
	
	public void dados(String ma, String mo) {
		
		this.marca = ma;
		this.modelo = mo;
		
		
		
	}
	
	public carro(String marca) {
		System.out.println("Estou no outro construtor");
		this.marca = marca;
	}
	
	public String[] retornaCarro(){
	
		return new String[] {marca, modelo};
			
	}
}


