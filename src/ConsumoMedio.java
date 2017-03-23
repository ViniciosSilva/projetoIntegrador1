import java.util.Scanner;

public class ConsumoMedio {

	public static void main(String[] args) {

		// leitura de entrada de dados do usuário
		Scanner console = new Scanner(System.in);

		//entrada
		System.out.println("Distância: ");
		double distancia = Double.parseDouble(console.nextLine());

		System.out.println("Combustível: ");
		double combustivel = Double.parseDouble(console.nextLine());

		//processamento
		double consumo = (distancia / combustivel);

		//saída
		System.out.println("O seu carro fez " + consumo + " KM/L.");

	}
}
