package MaisVetor;
/*Faça um programa para armazenar 20 números reais em um vetor chamado Num. 
Em seguida, chamar um método denominado imprimirPos que recebe o vetor Num por parâmetro e 
imprime apenas os números positivos contidos no vetor.

*/

import java.util.Scanner;

public class Positivos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tamanho = 4;
        double[] vetor = new double[tamanho];

        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o número do " + (i+1) + "º valor: ");
            vetor[i] = scanner.nextDouble();
        }

        imprimirPos(vetor);
        scanner.close();

    }

    public static void imprimirPos(double[] vetor) {

        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] > 0 ) { 
                System.out.println("Números positivos: " + vetor[i]);
            }
        }

    }
    
}
