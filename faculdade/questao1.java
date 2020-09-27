import java.util.Scanner;
public class questao1{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		//variaveis
		
		double d, x1, x2, y1, y2, p1, p2;
		
		//entrada
		
		System.out.println("Valor de X1: ");
		x1 = scan.nextDouble();
		
		System.out.println("Valor de X2: ");
		x2= scan.nextDouble();
		
		System.out.println("Valor de Y1: ");
		y1= scan.nextDouble();
		
		System.out.println("Valor de Y2: ");
		y2 = scan.nextDouble();
		
		
		//calculos
		
		p1 = (Math.pow(x2-x1, 2));
		
		p2 = (Math.pow(y2 - y1, 2));
		
		d = (Math.sqrt(p1+p2));
		
		
		// saida
		
		System.out.println("Seu resultado é : " +d);
		
	}
}