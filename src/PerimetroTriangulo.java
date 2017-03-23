import java.util.Scanner;


public class PerimetroTriangulo {

	public static void main (String[]args){
		
Scanner console = new Scanner(System.in);
		
		//entradas 
		System.out.println("A: ");
		double a = Double.parseDouble(console.nextLine());
		
		System.out.println("B:");
		double b = Double.parseDouble(console.nextLine());
		
		// processamento 
		double c = Math.sqrt((a*a)+(b*b));
		
		double perimetro = (a+b+c);
		
		//saida 
		System.out.println("O perimetro é: "+perimetro );
		
	}
}
