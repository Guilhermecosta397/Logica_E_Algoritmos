import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int i  =1000, count= 0, resto;

        while (count!=5) {
           resto= i%11;
           if (resto ==5) {
                count++;
                System.out.println("Valor com resto 5 é: " +i);
           }
           i++;
        }
        
System.out.println("O numero é: " + 
i);

entrada.close();
    }
}