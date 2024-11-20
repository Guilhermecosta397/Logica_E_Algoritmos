import java.util.Scanner;


public class imc {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        float imc, altura, peso;

        System.out.println("Digite o peso: ");
        peso= scanner.nextFloat();
        
        System.out.println("Digite a altura: ");
        altura= scanner.nextFloat();
       
        imc= peso  (altura* altura) ;
        
        
    }

    private static float peso(float f) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peso'");
    }
}
