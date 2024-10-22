import java.util.Scanner;
public class PraticandoFor {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int n1;
        System.out.println("Deseja qual  tabuada de multiplicação : ");
        n1= entrada.nextInt();
        
        for(int i=0; i<10; i++){
            System.out.println(n1 + "x" +i+"="+ (n1*i));
        }
        entrada.close();
    }
}
