
import java.util.Scanner;

public class Pares { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Digite o primeiro numero: ");
        int nInicio = scanner.nextInt();

        System.out.println("Digite o segundo numero:  ");
        int nFinal = scanner.nextInt();

        for (int i = nInicio; i <= nFinal; i++) {
            if (i % 2 == 0) {
            System.out.println(i + ", é  numero par! "); 
        }
    }
    scanner.close(); 
    }
}
