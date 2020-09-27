package faculdade;
import java.util.Scanner;
public class mediaponderada {
    public static void main(String[] args){
       Scanner scan = new Scanner (System.in);
       int n1, n2, n3;
     
       double media;
       


       System.out.println("Insira a sua nota "); 
       n1= scan.nextInt();
       n2= scan.nextInt();
       n3= scan.nextInt();

       media =(n1*2+n2*3+n3*5)/10;

       System.out.println("Sua media é : " +media);

    }
}
