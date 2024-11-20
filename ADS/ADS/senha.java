import java.util.Scanner;
public class senha {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int senhaCorreta = 1234, senhaDigitada; 
        String login; 

        System.out.println("Digite seu login:");
        login= leia.nextLine();
        System.out.println("Digite sua Senha: ");
        senhaDigitada = leia.nextInt(); 
        
        if (login.equals("admin") && senhaDigitada == senhaCorreta) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso Negado!");
        }
        leia.close();
    }
}