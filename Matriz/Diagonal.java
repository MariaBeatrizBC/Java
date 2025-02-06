package Matriz;
import java.util.Scanner;

public class Diagonal {

    public static void main(String[] args){

        //imprimir a diagonal principal da matriz
        Scanner sc = new Scanner(System.in);

        int qtdLinhas = 2, qtdColunas = 3;
        int[][] matriz = new int[qtdLinhas][qtdColunas];

        //lendo os valores
        for(int i = 0; i < qtdLinhas; i++){
            for(int j = 0; j < qtdColunas; j++){
                System.out.println("Digite o " + (j + 1) + "º valor da linha " + (i + 1) +": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        //imprimindo os valores
        for(int i =0; i < qtdLinhas; i++){
            for(int j = 0; j < qtdColunas; j++){
                System.out.print(matriz[i][j] + " │ ");
            }
            System.out.println();
        }

        //imprimindo a diagonal principal
        System.out.println("\nA diagonal principal é:");
        for(int i =0; i < qtdLinhas; i++){
            for(int j = 0; j < qtdColunas; j++){
                if (i == j) {
                    System.out.println(matriz[i][j] + " │ ");
                }   
            }
        }

        //imprimindo a diagonal secundária
        System.out.println("A diagonal inversa é:");
        for(int i = 0; i < qtdLinhas; i++) {
            for(int j = 0; j < qtdColunas; j++) {
                if(i + j == qtdColunas - 1){ // se a soma dos indices da matriz for igual a qtd de colunas - 1
                    System.out.println(matriz[i][j] + " │ ");
                }                
            }
        }

        sc.close();

    }
    
}
