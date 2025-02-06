
/*Escreva um programa que calcule e retorne o valor da hipotenusa através do
* método HIPOTENUSA. O método recebe o valor da base e da altura de um triângulo
* Fórmulas: hipotenusa² = base² + altura²
*             base x altura
*    área = -----------------
*                  2
*/
import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        calcularHipotenusa(base, altura);
        calcularArea(base, altura);

        scanner.close();

    }

    private static void calcularHipotenusa(double base, double altura) {

        double hipotenusa = (base*base) + (altura*altura);
        hipotenusa = Math.sqrt(hipotenusa); //calcular a raiz quadrada
        System.out.println("A hipotenusa é " + hipotenusa);

    }

    private static void calcularArea(double base, double altura) {

        double area = (base * altura) / 2;
        System.out.println("A área é " + area);
        

    }
    
}
