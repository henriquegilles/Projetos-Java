//Calcule e exiba área ocupada por um círculo cujo raio mede 5 metros.
//A área de um círculo é π multiplicado pelo raio elevado ao quadrado.
//Em Java o valor de π está disponível em Math.PI    
public class questao13{
	public static void main(String[] args) {
		
		//varaiveis
		
		double area, p2;
	
		
		//calculo
		
		p2 = (Math.pow(5,2));		
		
		area = (Math.PI*p2);
				
		//saida
		
		System.out.println("A Area é de : "+area);
		
	}
}