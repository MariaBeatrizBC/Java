/*Faça a leitura de um número entre 1 e 3. Cada número vai chamar um método diferente, sendo eles:
1 - ler um vetor e informar a quantidade de números pares dentro do vetor, usando while
2 - ler uma matriz quadrada 4x4 e imprimir a diagonal principal e secundária usando for
3 - ler um número e informar se ele é perfeito, se sim, imprimir a tabuada desse número, se não, calcular o palindromo dele.
*/
package ExerciciosAleatorios;
import java.util.Scanner;

public class TesteProva {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 3: ");
        int opcao = scanner.nextInt();

        /*if(opcao == 1) {
            lerVetor(scanner);

        } else if( opcao == 2) {
            lerMatriz(scanner);

        } else if( opcao == 3) {
            verificarPft(scanner);
        } else {
            System.out.println("Número inválido!");
        }*/

        switch(opcao) {
            case 1:
                lerVetor(scanner);
                break;
            case 2:
                lerMatriz(scanner);
                break;
            case 3:
                verificarPft(scanner);
                break;
            default:
                System.out.println("Número inválido! Precisa ser 1, 2 ou 3.");                 
        }
        scanner.close();
    }

    public static void lerVetor(Scanner scanner){

        //declarando o vetor
        int tamanho = 4;
        int[] vetor = new int[tamanho];
        int count = 0;

        //lendo o vetor
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i+1) + "º valor do vetor: ");
            vetor[i] = scanner.nextInt();

            if(vetor[i] % 2 == 0) {
                count++;
            } 
        }

        //imprimindo o vetor
        System.out.print("Vetor: ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " │ ");
        }
        System.out.println("Quantidade de números pares: " + count);

    }

    public static void lerMatriz(Scanner scanner){

        //declarando a matriz
        int[][] matriz = new int[2][2];

        //lendo a matriz
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.println("Digite o " + (j+1) + "º valor da " + (i+1) + " linha:");
                matriz[i][j] = scanner.nextInt();
            }
        }

        //imprimindo a matriz
        System.out.println("Matriz: ");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " │ ");
            }
            System.out.println();
        }

        //imprimindo a diagonal principal
        System.out.print("Diagonal principal: ");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                if(i == j) {
                    System.out.print(matriz[i][j] + " │ ");
                }
            }
        }

        //imprimindo a diagonal secundária
        System.out.print("Diagonal secundária: ");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                if(i + j == matriz.length - 1) {
                    System.out.print(matriz[i][j] + " │ ");
                } 
            }
        }

    }

    public static void verificarPft(Scanner scanner){

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        int count = 0;

        if(numero == 0) {
            System.out.println("Número inválido!");
        } else {
            for(int i = 1; i < numero; i++) {
                if(numero % i == 0) {
                    count = count + i;
                }
            }

            if(count == numero) {
                System.out.println("Número perfeito!");
            } else {
                System.out.println("Número não é perfeito!");
            }
        }
    



    }
    
}
