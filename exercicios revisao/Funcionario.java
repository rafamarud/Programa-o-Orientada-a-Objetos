package pkg;

public class Funcionario {
	
	public String nome;
	public float salario;
	public int horaextra;
	
	public Funcionario(String nome,float salario, int horaextra) {
		this.nome = nome;
		this.salario = salario;
		this.horaextra= horaextra;
	}
	
	public float calcularValorHoraExtra(){
		 return horaextra*50;
	 }
	public float calcluarPagamentoTotal() {
		return salario + calcularValorHoraExtra();
	}
	
	public void adicionarEstoque(int horas) {
            this.horaextra += horas;
            System.out.println("Horas extra atualizadas: " + this.horaextra);
        }
	
	public float salarioAnual() {
		return this.salario * 12;
	}
	
	public static void main (String[]args) {
		
		Funcionario f1 = new Funcionario("Joao", 1300f, 12);
		
		float pagamentohoraextra = f1.calcularValorHoraExtra();
		float pagamentototal = f1.calcluarPagamentoTotal();
		float salarioanual = f1.salarioAnual();
		
		System.out.println("Nome: "+f1.nome);
		System.out.println("Salario: "+f1.salario);
		System.out.println("Hora extra: "+f1.horaextra);
		System.out.println("Valor hora extra: "+pagamentohoraextra);
		System.out.println("Valor total: "+pagamentototal);
		System.out.println("Salario anual sem hora extra: "+salarioanual);
	}
	
    }
	
	


