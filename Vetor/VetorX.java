package Vetor;
/*Considere um vetor de 10 números inteiros positivos maiores que zero e um único número
* inteiro, também positivo e maior que zero. Faça um programa para:
* 		a. ler pelo teclado o vetor;
* 		b. ler pelo teclado o número X;
* 		c. dizer quantos números no vetor são maiores que X, menores que X e iguais a X. */

import java.util.Scanner;

public class VetorX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 10;
        int[] vetor = new int[tamanho];
        int maiores = 0, menores = 0, iguais = 0;

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite o " + i + "º valor do vetor: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um número positivo maior que zero para ser o X: ");
        int numero = scanner.nextInt();
        
        if(numero > 0 ) {
            for(int i = 0; i < vetor.length; i++){
                if(vetor[i] > numero) {
                    maiores = maiores + 1;
                } else if(vetor[i] < numero) {
                    menores = menores + 1;
                } else {
                    iguais = iguais + 1;
                }
            }

            System.out.println("Vetor: ");
                for(int i = 0; i < vetor.length; i++){
                    System.out.print(vetor[i] + " │ ");
                }

                System.out.println("O vetor possui " + maiores + " número maiores que X, " + menores + " números menores e " + iguais + " números iguais.");
                
        } else {
            System.out.println("O número precisa ser positivo e maior do que 0!");
        }

        scanner.close();

    }
}
