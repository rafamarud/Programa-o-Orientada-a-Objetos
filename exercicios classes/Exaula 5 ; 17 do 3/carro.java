package Exaula5;

public class carro {
	public String marca;
	public String modelo;
	
	public void dados(String ma, String mo) {
		
		this.marca = ma;
		this.modelo = mo;
		
		
		
	}
	
	public String[] retornaCarro(){
	
		return new String[] {marca, modelo};
			
	}
}


