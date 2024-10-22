import java.util.Scanner;
public class Calculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        int opcao = scanner.nextInt();
        double resultado;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado da soma é: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado da subtração é: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado da multiplicação é : " + resultado);
                break;
            case 4:
                    resultado = num1 / num2;
                    System.out.println("Resultado da divisão é: " + resultado);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}