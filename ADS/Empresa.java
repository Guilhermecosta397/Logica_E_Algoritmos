import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo;
        double salario, novoSalario;

        System.out.println("Digite o codigo do cargo: ");
        System.out.println("101- Gerente");
        System.out.println("102- Engenheiro");
        System.out.println("103- Tecnico");
        System.out.println("104- Outros");
        codigo = scanner.nextInt();

        System.out.println("Digite seu salario atual: ");
        salario = scanner.nextDouble();

        switch (codigo) {
            case 101:
                novoSalario = salario * 0.1;
                break;
            case 102:
                novoSalario = salario * 0.2;
                break;
            case 103:
                novoSalario = salario * 0.3; 
                break;
            case 104:
                novoSalario = salario * 0.4;
                break;
            default:
                System.out.println("Código de cargo inválido.");
                return;
        }

        System.out.println("Seu novo salário é:" + novoSalario + ", por conta dos Importos! kkk");

        scanner.close();
    }
}