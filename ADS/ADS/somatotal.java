import java.util.Scanner;;
public class somatotal {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        int n1,n2,soma, n3=3 ;
        

        System.out.println("Digite o Primeiro numero:");
        n1= leia.nextInt();
        System.out.println("Digite o Segundo numero:");
        n2=leia.nextInt();

        soma = n1+n2;

        System.out.println("O resultado é : " + soma);

        if (soma>= n3) {
            System.out.println("Correto, a soma é igual ou superior!");
        }else{
            System.out.println("Incorreto, a soma é menor!");
        }

        leia.close();
    }
}
