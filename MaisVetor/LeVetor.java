package MaisVetor;
/* Faça um programa que contenha um método chamado LeVetor. 
Dentro do método permita a leitura de 10 valores inteiros, armazene-os em um vetor, 
e imprime o maior e o menor deles.
*/

import java.util.Scanner;

public class LeVetor {

    public static void main(String[] args) {

        int tamanho = 10;
        int[] vetor = new int[tamanho];

        leVetor(vetor);

    }

    public static void leVetor(int[] vetor){

        Scanner sc = new Scanner(System.in);
        int maior = 0, menor = 0;

        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor do vetor: ");
            vetor[i]= sc.nextInt();
        }

        for(int i = 0; i < vetor.length; i++) {

            if (vetor[i] > maior) { // verifica se o valor é maior
                maior = vetor[i];
            }
        }

        menor = vetor[0]; //pega o primeiro valor do vetor

        for(int i = 1; i < vetor.length; i++) {

            if(vetor[i] < menor) { //verifica se o valor é menor
                menor = vetor[i];
            } 
        }

        System.out.println("O maior valor do vetor é " + maior);
        System.out.println("O menor valor do vetor é " + menor);

        sc.close();

    }
    
}
