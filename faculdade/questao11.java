import java.util.Scanner;

public class questao11{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		//variaveis
		
	   double nota1, nota2, nota3, nota4, total;
		
		//entrada
		
		System.out.println("Cite a Nota 1: ");
		nota1= scan.nextDouble();
		
		System.out.println("Cite a Nota 2: ");
		nota2= scan.nextDouble();
		
		System.out.println("Cite a Nota 3: ");
		nota3 = scan.nextDouble();
		
		System.out.println("Cite a Nota 4: ");
		nota4= scan.nextDouble();
		
		//calculo
		
		total = (nota1+nota2+nota3+nota4)/4;
		
		//entrada
		
		System.out.println("A Média Aritimentica da sua nota é de : " +total);
		
	}
}