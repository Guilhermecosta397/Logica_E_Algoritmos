import java.util.Scanner;

public class escola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota, freq;

        System.out.print("Digite sua nota final: ");
        nota = scanner.nextInt();
        System.out.print("Digite sua frequência: ");
        freq = scanner.nextInt();

        if (nota >= 70 && freq >= 75) {
            System.out.println("Promovido");
        } else {
            System.out.println("Não promovido");
        }

        scanner.close();
    }
}
