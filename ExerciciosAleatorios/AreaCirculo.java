/*A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
 Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

Entrada
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio. */
package ExerciciosAleatorios;
import java.util.Scanner;

public class AreaCirculo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("Digite o raio do circulo: ");
        double raio = sc.nextDouble();

        double pi = 3.14159;

        double area = pi * (raio * raio);
        System.out.println("A=" + area);

        sc.close();
        
    }
}
