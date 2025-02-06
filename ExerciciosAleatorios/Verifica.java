/*Crie um programa que contenha um método denominado Verifica. O método Verifica recebe um parâmetro que é um 
valor inteiro e verifica se esse valor é par ou ímpar. Imprimir a mensagem dentro do método.
*/
package ExerciciosAleatorios;
import java.util.Scanner;

public class Verifica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = sc.nextInt();
        verificar(numero);

        sc.close();

    }
    public static void verificar(int num){
        if(num % 2 == 0) {
            System.out.println("Número Par!");
        } else {
            System.out.println("Número Ímpar!");
        }
        return;
    } 
    
}
