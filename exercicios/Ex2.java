package pkg;
import java.util.Scanner;

public class RendimentoTaxi {

    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);


        
        System.out.println("Odometro inicio do dia: ");
        float odometroInicial = teclado.nextFloat();

        System.out.println("Odometro final do dia: ");
        float odometroFinal = teclado.nextFloat();

        System.out.println("Quantidade de litros de combustível gasto: ");
        float litrosGastos = teclado.nextFloat();

        System.out.println("Valor total recebido dos passageiros (R$): ");
        float valorRecebido = teclado.nextFloat();

       
        float totalQuilometragem = odometroFinal - odometroInicial;
        float mediaConsumo = totalQuilometragem / litrosGastos;
        float lucroLiquido = valorRecebido - (litrosGastos * 4.9f);

        
        System.out.println("\nTotal de quilometragem percorrida: " + totalQuilometragem + " km");
        System.out.println("Média de consumo: " + mediaConsumo +"km/l");
        System.out.println("Lucro líquido do dia: R$ " +lucroLiquido);

        
    }
}
