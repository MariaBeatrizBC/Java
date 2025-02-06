package Vetor;
/*******************************************************************************
* Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50).
* Determine e imprima quantas vezes que V1 e V2 possuem valores idênticos nas
* mesmas posições.
*******************************************************************************/
import java.util.Scanner;

public class V1eV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetorUm = new int[tamanho];
        int[] vetorDois = new int[tamanho];
        int count = 0;

        for(int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i+1) + "º número do primeiro vetor: ");
            vetorUm[i] = scanner.nextInt();
        }
        for(int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i+1) + "º número do segundo vetor: ");
            vetorDois[i] = scanner.nextInt();
        }


        for(int i = 0; i < tamanho; i++) {
            if(vetorUm[i] == vetorDois[i]) {
                count++;
            }
        }

        System.out.println("A quantidade de valores idênticos é " + count);
        
        scanner.close();
    }
    
}
