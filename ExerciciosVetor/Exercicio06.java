package ExerciciosVetor;
//6. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a soma dos respectivos elementos em A e B, ou seja: C[i] = A[i] + B[i].

public class Exercicio06 {
    
    public static void main(String[] args) {

        int[] vetorA = {5, 10, 15, 20, 25, 30};
        int[] vetorB = {3, 6, 9, 12, 15, 18};
        int[] vetorC = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i]  + vetorB[i]; 
        }

        System.out.print("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " │ ");
        }

        System.out.print("Vetor B: ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i] + " │ ");
        }

        System.out.print("Vetor C: ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorC[i] + " │ ");
        }
    }

}
