import java.util.Scanner;

public class escolha {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int sex= 0, qHomens= 0, qMulheres= 0;
        float altura, somaH=0, mediaH=0, maior=0, menor=0;
        
        for (int i=0; i<10;i++)
        
    System.out.println("Qual sexo ? (1- homem 2- mulher)");
        sex= entrada.nextInt();
         
    System.out.println("Qual a altura ?");
        altura= entrada.nextInt();

        if (sex == 1) {
            qMulheres++;
        } else if (sex == 2) {
            qHomens++;
            somaH = somaH + altura;
        } else {
            System.out.println("Sexo inválido!");
        }
        if (altura > maior) {
             maior = altura;
        } else if (altura < menor){
            menor = altura;
        }

        mediaH = somaH / qHomens;
    System.out.println("A maior altura do grupo é:  " + maior + " m, e a menor é de " + menor + " m");
    System.out.println("A média de altura dos homens é :  " + mediaH + " m");
    System.out.println("A quantidade de mulheres : " + qMulheres);

        entrada.close();
    }
}

