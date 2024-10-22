
import java.util.Scanner;
public class apresentacao{
        public static void main(String[]args){
        Scanner entrada= new Scanner (System.in);
        int diajogo, setor1, setor2, setor3;
        System.out.println("Qual dia do jogo do laion? " );
        diajogo = entrada.nextInt();
        if(diajogo==21){
        System.out.println("Dia correto, faça seu checkin!");
        }
        else{
            System.out.println("Dia Incorreto!");
        }
        entrada.close();
    }
}