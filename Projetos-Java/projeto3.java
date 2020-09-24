import java.util.Scanner;
public class projeto3{
	public static void main(String[] args) {
		//ler o nome do piloto, distancia percorrida em km, tempo em horas, calcular velocidade media
		//saida: velocidade media de xx foi yy km/h
		
		//variaveis
		Scanner scan= new Scanner(System.in);
		
		String piloto;
		int tempo;
		int distancia;
		double vm;
		
		//entrada
		System.out.println("Nome do Piloto: ");
		piloto= scan.nextLine();
		
		System.out.println("Qual foi a distancia percorrida (em Km) ?");
		distancia= scan.nextInt();
		
		
		System.out.println("Quanto tempo levou (em horas) a sua viagem ? ");
		tempo=scan.nextInt();
		
		//saida
		vm= distancia/tempo;
		System.out.println("A velocidade média do piloto " +piloto);
		System.out.print("Foi de " +vm);
		System.out.print("km");
		
	}
}