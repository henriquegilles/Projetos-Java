import java.util.Scanner;
public class questao6{
	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   
	   //variaveis
	   
	   double seg,min, horas; 
	   
	   //entrada
	   
	   System.out.println("Qual foi a duração do evento expresso em segundos ? ");
	   seg = scan.nextDouble();
	   
	   
	   //calculos
	   
	   min = (seg/60);
	   
	   horas = (min/60);
	   
	   //saida
	   
	   System.out.println("A duração do evento expresso em segundos foi : "  +seg);
	   
	   System.out.println("A duração do evento expresso em minutos foi : "  +min);
	   
	   System.out.println("A duração do evento expresso em horas foi : "  +horas);
	   
	   
		
	}
}