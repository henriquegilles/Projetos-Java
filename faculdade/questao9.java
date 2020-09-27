import java.util.Scanner;
public class questao9{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//variaveis
		
		double slr, slrmin, num;
	
		
		//entrada
		
		System.out.println("Qual o seu Salario atual ? ");
		slr = scan.nextDouble();
		
		System.out.println("Qual é o salario minimo atual ? ");
		slrmin = scan.nextDouble();
		
		//calculos
		
		num = slr/slrmin;
		
		//saida
		
		System.out.println("Seu salario é de : " +num + " Salarios minimos ");
		
	}
}