import java.util.Scanner;

public class ConsumoMedio {

	public static void main(String[] args) {

		// leitura de entrada de dados do usu�rio
		Scanner console = new Scanner(System.in);

		//entrada
		System.out.println("Dist�ncia: ");
		double distancia = Double.parseDouble(console.nextLine());

		System.out.println("Combust�vel: ");
		double combustivel = Double.parseDouble(console.nextLine());

		//processamento
		double consumo = (distancia / combustivel);

		//sa�da
		System.out.println("O seu carro fez " + consumo + " KM/L.");

	}
}
