import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
		ControleDeGastos g1 = new ControleDeGastos();
		
		System.out.print("Informe o valor: ");
		double valor = entrada.nextDouble();
		
		g1.valorPagar(valor);
	}
}
