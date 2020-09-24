import java.util.Scanner;
public class projeto2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Variaveis
		double distancia;
		double tempo;
		double vm;
		
		
		//Entrada:
		System.out.println("Qual foi a distancia percorrida em Km ? ");
		distancia = scan.nextDouble();
		
		System.out.println("Qual foi o tempo em horas da viagem : ");
		tempo = scan.nextDouble();
		
		
		//Saida
		
		vm=distancia/tempo;
		System.out.println("Sua velocidade média foi de: " +vm);
		
		
		
	}		
}
