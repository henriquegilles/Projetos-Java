import java.util.Scanner;
public class conversordegraus{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//variaveis
		
		double C, F;
		
		
		//entrada
		
		System.out.println("Qual a temperatura em graus Fahrenheit ?");
		F = scan.nextDouble();
		
		//saida
		
		C = 0.5*(F-32);
		System.out.println("A sua temperatura em Celcius é de aproximadamente : " +C);
		
	}
}