import java.util.Scanner;

public class VetorPares {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        boolean par= false;
       
        int[] vetor = new int[10];
        
    
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        // Exibindo os números pares contidos no vetor
        System.out.println("\nNúmeros pares digitados:");
        // Flag para verificar se há pares
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
                par = true;
            }
        }
        if (!par) {
            System.out.println("Nenhum número par foi digitado.");
        }
        scanner.close();
    }
}

