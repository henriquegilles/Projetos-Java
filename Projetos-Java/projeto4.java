import java.util.Scanner;
public class projeto4{
	public static void main(String[] args) {
		//variaveis
		Scanner scan = new Scanner (System.in);
		
	
		double ref = 1.80;
		double cob = 3.50;
		double pizza = 25.00;
		double pagamento, total, gar;
		byte qref, qcob, qpizza, pessoas;
		
		
	
		
		//entrada
		System.out.println("São quantas pessoas ?");
	    pessoas = scan.nextByte();
		
		System.out.println("Quantas pizzas foram pedidas ? ");
		qpizza = scan.nextByte();
		
		System.out.println("Quantas coberturas foram pedidas ? ");
		qcob = scan.nextByte();
		
		System.out.println("Quantas bebidas foram pedidas ? ");
		qref = scan.nextByte();
		
		
		//saida
		
		System.out.println("");
		total=(ref*qref)+(cob*qcob)+(qpizza*pizza);
		pagamento= total/pessoas;
		gar=(10%pagamento);
		
		System.out.println("O total que cada um deve pagar é :" +pagamento);
		System.out.println("e a gorjeta é de :" +gar);
	}
}