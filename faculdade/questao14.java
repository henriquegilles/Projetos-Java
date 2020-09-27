import java.util.Scanner;
public class questao14{
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		
		//varaiveis
		
		double gorjeta, total;
		
		//entrada
		
		System.out.println("Qual foi o valor total gasto no restaurante ? ");
		total = scan.nextDouble();
		
		//calculo
		
		gorjeta = total*(0.1);
		
		//saida
		
		System.out.println("O valor da gorjeta é de : " +gorjeta);
		
	}
}