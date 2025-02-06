package MaisVetor;
/*******************************************************************************
* Dada uma seqüência de n números (vetor de inteiros), imprimi-la na ordem inversa que
* foi realizada a leitura.
*******************************************************************************/
import java.util.Scanner;

public class VetorInverso {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tamanho = 4;
        int[] vetor = new int[tamanho];

        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "º valor do vetor: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Vetor normal: ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " │ ");

        }

        System.out.print("Vetor inverso: ");
        for(int i = tamanho - 1 ; i >= 0 ; i--){ 
            System.out.print(vetor[i] + " │ ");
        }

        scanner.close();

    }
    
}