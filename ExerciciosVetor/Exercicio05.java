package ExerciciosVetor;
//5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i] * i.

public class Exercicio05 {
    
    public static void main(String[] args) {

        int[] vetorA = {5, 10, 15, 20, 25, 30};
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i]  * i; 
        }

        System.out.println("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " │ ");
        }

        System.out.println("Vetor B: ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i] + " │ ");
        }
    }
}
