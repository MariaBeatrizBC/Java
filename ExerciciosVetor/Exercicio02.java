package ExerciciosVetor;
//2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2.

public class Exercicio02 {

    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] vetorB = new int[vetorA.length];

        System.out.print("Vetor A: ");
        for(int i=0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " │ ");
        }
        
        System.out.print("Vetor B: ");
        for(int i=0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i] * 2;

            System.out.print(vetorB[i] + " │ ");
        }
    }
    
}
