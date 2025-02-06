package ExerciciosVetor;
//4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).

public class Exercicio04 {

    public static void main(String[] args) {

        double[] vetorA = {5, 10, 15, 20, 25, 30};
        double[] vetorB = new double[vetorA.length];

        for(int i = 0; i < vetorA.length; i++) {
            vetorB[i] = Math.sqrt(vetorA[i]); //Pra usar Math, tem que ser double
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
