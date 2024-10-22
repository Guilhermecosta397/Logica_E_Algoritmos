import java.util.Scanner;

public class CalculaIdade {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int anoA= 2024, idade, anoNascido, cliente;
        String nome;
        float imc, altura, peso;

        System.out.println("Digite o peso: ");
        peso= scanner.nextFloat();
        
        System.out.println("Digite a altura: ");
        altura= scanner.nextFloat();
       
        imc= peso (altura* altura) ;
    

        System.out.println("Digite seu Nome Completo:");
        nome= scanner.nextLine();

        System.out.println("Seja Bem- vindo"  +  nome);
       
        System.out.println("Digite o ano atual: ");
        anoA= scanner.nextInt();
       
        System.out.println("digite o ano nascido:" );
        anoNascido= scanner.nextInt();
        idade = 2024 - anoNascido;
        imc= peso (altura* altura) ;

        System.out.println( nome +" você tem "+ idade + "anos!");

        if (idade >=18) {

            System.out.println("Você é adulto, e ja pode pagar boleto kkk");
            
        }
        else{
            System.out.println("Você ainda é uma criança hahahaha!");
        }

        ////PACIENTE DA CLINICA /////

        System.out.println("Nome: " + nome );
        System.out.println("Imc: " + imc );
        System.out.println("peso: " + peso );
    }

    private static float peso(float f) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peso'");

      
       }
}