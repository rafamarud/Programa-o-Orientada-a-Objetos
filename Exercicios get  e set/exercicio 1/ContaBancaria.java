package pkg1;

public class ContaBancaria {
	private double saldo;
	private double limite;
	
	public ContaBancaria(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double saque(double valor) {
		if(valor > limite) {
			System.err.println("Saque maior que o limite!");
			return 0;
		}
		else {
		saldo -= valor;
		return saldo;
		}
	}
}
	
		
	
	

