package pkg;

public class Time {
	
	public String nome;
	public float golsMarcados;
	public float golsSofridos;
	
	public Time(String nome, float golsMarcados, float golsSofridos) {
		this.nome = nome;
		this.golsMarcados = golsMarcados;
		this.golsSofridos = golsSofridos;
	}
	
	 public void marcarGol(int gol) {
		 this.golsMarcados += gol;
	 }
	 
	 public void sofrerGol(int gol) {
		 this.golsSofridos += gol;
		
	 }
	 
	 public void saldoDeGols() {
		 float saldo = this.golsMarcados = this.golsSofridos;
		 System.out.println("Saldo de Gols: " + saldo);
	 }
	 
	 public void resultadoDaPartida() {
		 if((this.golsMarcados - this.golsSofridos) > 0) {
			 System.out.println("Vitoria!");
		 }
		 if((this.golsMarcados - this.golsSofridos) == 0) {
			 System.out.println("Empate!");
		 }
		 if((this.golsMarcados - this.golsSofridos) < 0) {
			 System.out.println("Derrota!");
		 }
	 }

	public static void main(String[] args) {
		
		Time time1 = new Time("Cruzeiro", 2, 1);
        
        System.out.println("Time: " + time1.nome);
        
        
        time1.marcarGol(1); 
        time1.sofrerGol(1); 
        
        
        time1.saldoDeGols();
        time1.resultadoDaPartida();
        
        
        System.out.println("Gols Marcados: " + time1.golsMarcados);
        System.out.println("Gols Sofridos: " + time1.golsSofridos);
    }

}
