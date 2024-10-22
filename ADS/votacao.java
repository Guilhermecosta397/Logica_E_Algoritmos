
import java.util.Scanner;
public class votacao {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int ano;

        System.out.println("Digite o ano que nasceu:");
        ano= entrada.nextInt();

        if (ano>=16)
         {
            System.out.println("você esta apto a voltar!");    
        }
        else
        {
            System.out.println("Nao poderá votar");
        }
       entrada.close();
    }
}
