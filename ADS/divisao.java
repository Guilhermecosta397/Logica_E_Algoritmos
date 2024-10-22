import java.util.Scanner;

public class divisao{
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int n1,n2, divisao, diferenca, produto;
        
       

        System.out.println("Digite o primeiro numero: ");
        n1= entrada.nextInt();
        System.out.println("Digite o segundo numero:  ");
        n2= entrada.nextInt();

        divisao = n1/n2 ;
        diferenca= n1+n2;
        produto= n1*n2;
        System.out.println("O valor é: " + divisao);
    
    }

}
