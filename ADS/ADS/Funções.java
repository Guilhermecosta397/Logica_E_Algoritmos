import java.util.Scanner;
public class Funções {
    public static void main(String[]args){

        int opcao;
        do{
            opcao= mostraMenu();
        }while(opcao!=2);
    }
    public static int mostraMenu(){
        Scanner leia= new Scanner(System.in);
        System.out.println("****MENU****");
        System.out.println("1: Mostrar menu");
        System.out.println("2: Sair");
        return leia.nextInt();
    }
}
