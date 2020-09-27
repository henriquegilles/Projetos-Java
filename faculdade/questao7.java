import java.util.Scanner;
public class questao7{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		//variaveis
		
		//porcentagem do distribuidor 28% e imposto 45%
		
		double ct, cf,pd, imp; 
		
		//entrada
		
		System.out.println("Qual foi o custo de fabrica do carro ? ");
		cf = scan.nextDouble();
		
		//calculos
		
		pd = (cf*28)/100;
		
		imp = (cf*45)/100;
		
		ct = cf+pd+imp;
		
		
		
	    //saida
		//escrever um algoritmo que leia o custo de fábrica de um carro e escreva o custo ao consumidor.
		
		System.out.println("O custo total do carro é de : " +ct);
		
	}
}