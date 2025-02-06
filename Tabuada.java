/*
8. Faça um método chamado MostraTabuadas e que recebe, por parâmetro, um valor inteiro N. 
Calcular e imprimir as tabuadas dos números de 1 até N, ou seja, se o usuário digitou o valor 3 
deve imprimir a tabuada do 1, a tabuada do 2 e a tabuada do 3. Exibir as tabuadas, dentro do método, 
considerando os cálculos de 1 a 10. Dessa forma,   método não deve retornar nada.

*/
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 10:");
        int n = scanner.nextInt();

        mostraTabuadas(n);
        scanner.close();

    }

    public static void mostraTabuadas(int n) {    
        
        int count = 1;
        while(count <= n) {
            for(int i = 0; i <= 10; i++) {
                //int res = count * i;
                System.out.println(count + " x " + i + " = " + (count * i) /*res*/ );
            }  
            System.out.println();
            count++;
        }

    }
    
}
