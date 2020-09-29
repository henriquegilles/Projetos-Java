import java.util.Scanner;
public class provac1q2{
	public static void main(String [] args) {
		Scanner scan = new Scanner (System.in);
		
		//variaveis
		
		double a,b,c,d, resultado;
		
		//entrada
		
		System.out.println("Solicitando a nota 1: ");
		a= scan.nextDouble();
		
		System.out.println("Solicitando a nota 2: ");
		b= scan.nextDouble();
		
		System.out.println("Solicitando a nota 3: ");
		c= scan.nextDouble();
		
		System.out.println("Solicitando a nota 4: ");
		d= scan.nextDouble();
		
		
		
		//calculo
		
		resultado = (a+b+c+d)/4;
		
		//saida
		
		System.out.println("Sua média é : " +resultado);
		
	}
}