import java.util.Scanner;
public class provac1{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		//variaveis
		double x, y, funcao;
		
		//entrada
		
		
		System.out.println("Fale o valor do ponto X: ");
		x = scan.nextDouble();
		
		System.out.println("Fale o valor do ponto Y: ");
		y= scan.nextDouble();
		
		
		//calculo
		
        funcao = (Math.E * (-200))* (-0.2*(Math.sqrt(Math.pow(x,2)+(Math.pow(y,2))))) + (Math.E * (Math.pow(5, (Math.cos(3*x)+(Math.sin(3*y))))));
        
        //saida
        
        System.out.println("O resultado da função é de : " +funcao);
        
	}
}