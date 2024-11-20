
import java.util.Scanner;

public class temperatura {
    public static void main(String[]args){
        Scanner entrada= new Scanner(System.in);
        float c, fahrenheit; 
        

    System.out.println("Coloque a temperatura em celsius: ");
    c= entrada.nextFloat();
    fahrenheit= (c+ 32)/ 9;

    System.out.println("A temperatura em fahrenheit: " + fahrenheit );
    entrada.close();
    }
}
