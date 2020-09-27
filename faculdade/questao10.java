import java.util.Scanner;
public class questao10{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		//Solicite a quantidade de homens e de mulheres de uma turma da faculdade
		// Em seguida calcule e exiba o percentual (separadamente) de homens e mulheres desta turma. 
		
		//variaveis
		
		double mas, fem, totalm,totalf, total;
		
		//entrada
		
        System.out.println("Qual é a quantidade de homens na classe ? ");
        mas = scan.nextDouble();
        
        System.out.println("Qual é a quantidade de mulheres na classe ? ");
        fem = scan.nextDouble();
        
		
		//calculos
		
         total = mas + fem;
          
		 totalf = (mas*100)/total;
		 
		 totalm = (fem*100)/total;
		 
		//saida
		
		
	     System.out.println("A quantidade de mulheres é de : " +totalf);
	     
	     System.out.println("A quantidade de homens é de: " +totalm);
		
	}
}