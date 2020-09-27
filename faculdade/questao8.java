import java.util.Scanner;
public class questao8{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//variaveis
		
		double a, b, c, d, e, f, x, y;
		
		//entrada
		
		System.out.println("O valor de a: ");
		a=scan.nextDouble();
		
		System.out.println("O valor de  b: ");
		b=scan.nextDouble();
		
		System.out.println("O valor de  c: ");
		c=scan.nextDouble();
		
		System.out.println("O valor de  d: ");
		d=scan.nextDouble();
		
		System.out.println("O valor de  e: ");
		e=scan.nextDouble();
		
		System.out.println("O valor de  f: ");
		f=scan.nextDouble();
		
		//calculos
		x =((c*e-b*f)/(a*e-b*d));
		
		y=((a*f-c*d)/(a*e-b*d));
		
		c=a*x+b*y;
		
		f=d*x+e*y;
		//saida
		
		
		System.out.println("Os resultados são : \n"  +x);
		
		System.out.println(+y);
		
		System.out.println(+c);
		
		System.out.println(+f);
		
	}
}