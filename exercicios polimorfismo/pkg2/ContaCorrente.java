package pkg2;

public class ContaCorrente extends ContaBancaria {
	public double saldoinicial;
	public double taxas;
	
	public ContaCorrente(double saldoinicial, double taxas) {
		this.saldoinicial = saldoinicial;
		this.taxas = taxas;
	}
	
	public void calcularSaldo() {
		double saldofinal = saldoinicial - taxas;
		System.out.println("Saldo atual: " +saldofinal);
	}
}
