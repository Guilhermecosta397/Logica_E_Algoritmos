
import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int largura, altura, retangulo;
         
        System.out.println("Digite a largura do retangulo: ");
        largura= scanner.nextInt();

        System.out.println("Digite a altura do retangulo: ");
        altura= scanner.nextInt();

        
        retangulo= largura*altura;

        System.out.println("A area do retangulo é " +  retangulo +  "Centimetros");
        scanner.close();

    }
}
