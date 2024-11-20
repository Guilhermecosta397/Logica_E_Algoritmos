import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);    
        int idade;
    
        System.out.println("Digite sua idade: ");
        idade= scanner.nextInt();

        if (idade < 13) {
            System.out.println("Criança");
        }else if (idade >=13 && idade <=17) {
            System.out.println("Adolescente");
        }else if (idade >=18 && idade<= 64) {
            System.out.println("Adulto");
        }else {
            System.out.println("Idoso");
        }
        scanner.close();    
    }
}
