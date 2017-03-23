import java.util.Scanner;

public class BhaskaraAvessas {

	public static void main (String [] args){
		
		//ENTRADAS: x1, x2, c
		
		/*PROCESSAMENTO:
		 * 
		   produto = (x1 * x2)
		   soma = (x1 + x2)
		   a = (c / produto)
		   b = - (soma * a)
		   		   
		 */
		
		//SAÍDAS: a, b
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("X1: ");
		double x1 = console.nextDouble();
		
		System.out.println("X2: ");
		double x2 = console.nextDouble();
		
		System.out.println("C");
		double c = console.nextDouble();
		// processamento 
		double produto = (x1 * x2);
		double soma = (x1 + x2);
		double a = (c / produto); 
		double b = - (soma * a);
		
		System.out.println("A equação que tem as raizes x1 e x2 é: ax² + bx + c");
		
		
		
		
	
	}
}
