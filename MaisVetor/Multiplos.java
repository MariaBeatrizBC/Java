package MaisVetor;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        lerVetor(scanner);
        scanner.close();

    }

    public static void lerVetor(Scanner scanner) {

        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        int multiplosDe5 = 0;

        for(int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i+1) + "º número do vetor: ");
            vetor[i] = scanner.nextInt();

            if(vetor[i] % 5 == 0) {
                multiplosDe5++;
            }
        }

        System.out.println("Vetor: ");
        for(int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " │ ");
        }

        System.out.println("Quantidade de múltiplos de 5: " + multiplosDe5);

    }
    
}
