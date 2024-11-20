import java.util.Scanner;

public class somas {
    public static void main(String[]args){
     Scanner scanner = new Scanner ( System.in);    
     long n1=10, n2=20, soma; 
        soma= n1 + n2;
    System.out.println("digite o primeiro valor:");    
    n1= scanner.nextInt();
    
    System.out.println("digite o segindo valor:" );
    n2= scanner.nextInt();

    System.out.println("O resultado é:" + soma );
    
    scanner.close();
    }
}
