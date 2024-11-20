import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
       
        int[] vetor = new int[10];

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        
        int maiorValor = vetor[0];
        int menorValor = vetor[0];
        int posicaoMaior = 0;
        int posicaoMenor= 0;
        
    
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
                posicaoMenor = i;
            }
            if (vetor[i]> maiorValor){
                maiorValor= vetor[i];
                posicaoMaior= i;
            }
        }
        
        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("O menor valor é: " + menorValor);
        System.out.println("A maior Posição dos vetores é: " + (posicaoMaior + 1));
        System.out.println("A menor Posição dos vetores é: " + (posicaoMenor + 1));
        scanner.close();
    }
}

