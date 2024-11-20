import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[]args){
        Scanner  leia= new Scanner(System.in);
        int[] vetor = new int[6];
        System.out.println("Digite os 6 numeros: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = leia.nextInt();
        }
        for (int i= vetor.length-1 ; i<=0; i--){
            System .out.println("vetor["+i+"]= "+ vetor[i]);
        }
    }
}
