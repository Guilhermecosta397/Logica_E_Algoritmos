import java.util.Scanner;

public class algoritmo {
    public static void main(String[]args){
        Scanner scanner= new Scanner( System.in);
        int vl, sucessor, antecessor;
        
        System.out.println("coloque um numero a seguir:  ");
        vl= scanner.nextInt();
         
        antecessor= vl - 1;
        sucessor= vl + 1;

        System.out.println("Antecessor é : " + antecessor);
        System.out.println("Sucessor é : " + sucessor  );
     
        scanner.close();
    }
    }

