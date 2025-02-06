package ExerciciosVetor;
//1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];



        for(int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o " + (i+1) + "º valor do vetor: ");
            vetorA[i] = scanner.nextInt();
        }

        for(int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
        }

        System.out.print("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " │ ");
        }

        System.out.print("Vetor B: ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i] + " │ ");
        }

        scanner.close();

        
    }
    
}
