import java.util.Scanner;


public class KmLitro {

	public static void main (String[]args){
		
		double km;
		double litro;
		double consumo;
		
		// leitura de entrada de dados do usuário 
		Scanner console = new Scanner(System.in);
		
		System.out.println("Digite KM: ");
		km = console.nextDouble();
		
		System.out.println("Digite litro: ");
		litro = console.nextDouble();
		
		consumo = (km/litro);
		
		System.out.println("O seu carro fez " +consumo+ " KM/L.");
		
	}
}
