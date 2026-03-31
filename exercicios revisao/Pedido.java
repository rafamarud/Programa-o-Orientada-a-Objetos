package pkg;

public class Pedido {

    String numero;
    String produto;
    double preco;
    double quantidade;

    public Pedido(String numero, String produto, double preco, double quantidade) {
        this.numero = numero;
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return this.preco * this.quantidade;
    }

    public double calcularDesconto(double percentual) {
        return calcularSubtotal() * (percentual / 100);
    }

    public double calcularTotal(double percentualDesconto) {
        return calcularSubtotal() - calcularDesconto(percentualDesconto);
    }

    public String resumoPedido() {
        return "Pedido nº: " + numero + 
               " | Produto: " + produto + 
               " | Qtd: " + quantidade + 
               " | Subtotal: R$ " + calcularSubtotal();
    }

    public static void main(String[] args) {
        
        Pedido p1 = new Pedido("101", "Teclado Gamer", 150.0, 2);
        
        System.out.println(p1.resumoPedido());
        System.out.println("Desconto (10%): R$ " + p1.calcularDesconto(10));
        System.out.println("Total Final: R$ " + p1.calcularTotal(10));
    }
}


