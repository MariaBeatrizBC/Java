package ExerciciosVetor;
//3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja: B[i] = A[i] * A[I].

public class Exercicio03 {

    public static void main(String[] args) {
        int[] vetorA = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75};
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.print("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " │ ");
        }

        System.out.print("Vetor B: ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorB[i]+ " │ ");
        }


    }
    
}
