package pkg;

public class Carro {
    public String modelo;
    public int velocidadeAtual;
    public int velocidadeMaxima;
    

    public Carro(String modelo, int velocidadeAtual, int velocidadeMaxima) {
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
        
    }

    public int acelerar(int valor) {
        if (this.velocidadeAtual + valor <= this.velocidadeMaxima) {
            this.velocidadeAtual += valor;
            System.out.println("Velocidade aumentada: " + this.velocidadeAtual);
        } else {
            System.out.println("Velocidade nao pode ultrapassar o limite!");
        }
        return this.velocidadeAtual;
    }

    public int frear(int valor) {
        if (this.velocidadeAtual - valor >= 0) {
            this.velocidadeAtual -= valor;
            System.out.println("Velocidade reduzida para: " + this.velocidadeAtual);
        } else {
            System.out.println("Erro: Frenagem negada! Velocidade não pode ser negativa.");
        }
        return this.velocidadeAtual;
    }

    public boolean atingiuVelocidadeMaxima() {
        return this.velocidadeAtual == this.velocidadeMaxima;
    }
    
    public float calcularTempoViagem(double distancia) {
        if (this.velocidadeAtual <= 0) {
            return 0; 
        }
        
        return (float) (distancia / this.velocidadeAtual);
    }
    
    public static void main (String[]args) {
    	Carro c1 = new Carro("Gol", 100, 110);
    	
   
    	
    	System.out.println("Modelo: "+c1.modelo);
		System.out.println("Velocidade atual: "+c1.velocidadeAtual);
		System.out.println("Velocidade maxima: "+c1.velocidadeMaxima);
		
		c1.acelerar(11);
		c1.frear(50);
		double distancia = 100.0;
        float tempo = c1.calcularTempoViagem(distancia);
        if (tempo > 0) {
            System.out.println("Tempo estimado para " + distancia + "km: " + tempo + " horas");
        }
    }
}

