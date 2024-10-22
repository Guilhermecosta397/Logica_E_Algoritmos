import java.util.Scanner;

public class academia {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int idade, ano;

        System.out.println("Digite sua idade: ");
        idade= scanner.nextInt();
        System.out.println("Duracao da sua matricula em anos: ");
        ano= scanner.nextInt();

        if (idade >=60 && ano>= 5) {
            System.out.println("Desconto liberado!");
        }else{
            System.out.println("Desconto bloqueado!");
        }

        scanner.close();
    }
}
