import java.util.Scanner;
public class poligono {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        int lado;
        @SuppressWarnings("unused")
        float medidaLado, area;

        System.out.println("Quantos lados tem o poligono ?");
        lado = leia.nextInt();

        System.out.println("Qual a medida do lado :");
        medidaLado = leia.nextFloat();

        switch (lado) {
            case 3:
            System.out.println("TRIANGULO");
            area= (lado*lado)/2;
            System.out.println("Area do trinagulo" + area);
                break;
            case 4:
            System.out.println("QUADRADO");
            area= (lado*lado)/2;
            System.out.println("Area do quadrado" + area);
                break;
            case 5:
            System.out.println("PENTAGONO");
            area= (lado*lado)/2;
            System.out.println("Area do pentagono"+ area);
                break;
        
            default:
                break;
        }

        leia.close();
    }
}
