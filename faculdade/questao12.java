import java.util.Scanner;

public class questao12{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		//Calcule e exiba o valor final de uma dívida. Para isto pergunte ao usuário o valor inicial do débito,
		// a quantidade de meses e os juros mensais. Use o cálculo de juros simples.
		
		//variaveis
		
		double d, vd, qm, jm;
		
		//entrada
		
		System.out.println();
		vd = scan.nextDouble();
		
		System.out.println();
		qm = scan.nextDouble();
		
		
		System.out.println();
		jm = scan.nextDouble();
		
		//calculos
		
		d = vd*jm*qm;
		
		
		//saida
		
		System.out.println("A divida é de : " +d);
		System.out.printf("%.2f",d);
		
	}
}