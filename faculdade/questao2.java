import java.util.Scanner;
public class questao2{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		//variaveis
		
		double d, r, s, a, b, c;
		
		//entrada
		
		
		System.out.println("Valor de X1: ");
		a = scan.nextDouble();
		
		System.out.println("Valor de X1: ");
		b = scan.nextDouble();
		
		System.out.println("Valor de X1: ");
		c = scan.nextDouble();
		
		
		//calculos
		
		s = (Math.pow(b+c, 2));
		
		r = (Math.pow(a+b, 2));
		
		d = (r + s / 2);
		

		//saida
		
		System.out.println(+s);
		
		System.out.println(+r);
		
		System.out.println(+d);
		
		
	}
}