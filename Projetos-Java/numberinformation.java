import java.util.Scanner;
public class numberinformation{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		//variaveis
		double num, metade, triplo;
		
		
		//entrada
		System.out.println("DIgite seu numero: ");
		num=scan.nextDouble();
		
		
		//saida
		
		metade = num/2;
		
		triplo = num*3;
		
		
       	System.out.println(+triplo);	
       	
       	System.out.println(+metade);	
				
		System.out.println(Math.cbrt(num));
		
		System.out.println(Math.pow(num, 2/3));
		
		
	}
}