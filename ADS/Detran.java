import java.util.Scanner;

public class Detran {
    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in); 
       double totalDetran=0, valorMulta, totalMOtorista=0; 
       int qntMulta,numCarteira;
       String continua;

       do {

        do {
            System.out.println("Digite o numero da carteira: ");
        numCarteira= entrada.nextInt();
        } while (numCarteira<= 0 || numCarteira> 4327);
        
        System.out.println("Coloque a quantidade de multas abaixo: ");
        qntMulta= entrada.nextInt();
       
        for(int i=0; i <= qntMulta; i++){
            System.out.println("Qual valor da multa? "+ i+ ":");
            valorMulta= entrada.nextDouble();
            totalMOtorista = totalMOtorista+ valorMulta;
        }
        System.out.println("Total a pagar do motorista é: "+ totalMOtorista );
        totalDetran= totalMOtorista + totalDetran;

        System.out.println("Deseja continua (sim/nao) ?");
        continua= entrada.next();
    } while (continua.contentEquals(continua));
 
 
    entrada.close();
}
}
