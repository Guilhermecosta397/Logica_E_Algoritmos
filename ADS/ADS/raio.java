
import java.util.Scanner;

public class raio {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double pi= 3.14, calc, raio;
        System.out.println("Coloque o raio: ");
        raio = entrada.nextFloat();

        calc= 2*pi*raio;

        System.out.printf("O valor do perimetro é: %.2f " ,  calc );

        entrada.close();
    }
}
