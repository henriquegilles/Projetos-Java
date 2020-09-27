import java.util.Scanner;
public class questao4{
	public static void main (String[] args) {
	    Scanner scan = new Scanner (System.in);
	    
	    //variaveis
	    
	    
        int dias, meses, anos;
	    
	    
	    //entrada
	    
	    System.out.println("Qual sua idade em dias ? ");
	    dias = scan.nextInt();
	    
	    //calculos
	    
	    meses = (dias/30);
	    
	    anos = (meses/12);
	    
	  
	    //saida
		
	    System.out.println("Sua idade em dias é : " +dias);
	    
	    
	    System.out.println("Sua idade em meses é " +meses);
	    
	    
	    System.out.println("Sua idade em anos é : " +anos);
	    
		
	}
}