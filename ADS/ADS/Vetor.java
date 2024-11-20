import java.util.Scanner;
public class Vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int[] vetor = new int[5];
    
        System.out.println("Digite 5 valores inteiros:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valor para a posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        
        System.out.println("\nValores inseridos no vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + (i + 1) + ": " + vetor[i]);
        }
        scanner.close();
    }
}

