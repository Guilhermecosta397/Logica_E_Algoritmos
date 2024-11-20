import java.util.Scanner;
public class verifica {
    public static void main(String[] args) {
        Scanner entrada=  new Scanner(System.in);
        int n1;
        System.out.println("Coloque um Número abaixo: ");
        n1= entrada.nextInt();

        if (n1>= 0 ) 
        {
            System.out.println("O Número digitado é positivo");
        }else
        {
            System.out.println("O Núnero digitado é negativo!");
        }
        entrada.close();
    }
}
