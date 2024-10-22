import java.util.Scanner;

public class pesoideal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        final int MASCULINO = 2;
        final int FEMININO = 1;
        System.out.println("Digite a altura: ");
        double altura = leia.nextDouble();

        System.out.println("Digite o sexo (1 para feminino, 2 para masculino): ");
        int sexo = leia.nextInt();
        
        double pesoIdeal;
        if (sexo == MASCULINO) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Você é homem, seu peso ideal é: %.2f" , pesoIdeal , " kg");
        } else if (sexo == FEMININO) {
            pesoIdeal = (62.1 * altura) - 44.77;
            System.out.printf("Você é mulher, seu peso ideal é: %.2f" , pesoIdeal , " kg");
        } else {
            System.out.println("Sexo inválido.");
        }
    leia.close();
    }
}
