import java.util.Scanner;


public class media {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        float n1,n2,n3, media ;
        

        System.out.println("Coloque a primeira nota:");
        n1= entrada.nextInt();
        System.out.println("Coloque a segunda nota:");
        n2= entrada.nextInt();
        System.out.println("Coloque a terceira nota:");
        n3= entrada.nextInt();

        media= (n1+n2+n3) /3;
       

        System.out.println("A media será: " + media + "pontos") ;

        if (media >=7) {
            System.out.println("Aprovado");
            
        }
        else{
            System.out.println("Reprovado!");
        }
    
        entrada.close();
    }
}
