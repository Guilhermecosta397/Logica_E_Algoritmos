import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String personagem= "";

        while (!(personagem.equalsIgnoreCase("sair"))) {
            System.out.println("Digite o personagem a seguir: ");
            personagem= leia.next();
        }
    }
}
