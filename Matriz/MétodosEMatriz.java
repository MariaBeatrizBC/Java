package Matriz;
/*
10) Faça um programa para armazenar números inteiros em uma matriz quadrada de ordem 4, ou seja, 
uma matriz 4x4. Em seguida criar os seguintes métodos:
- Método que recebe a matriz e verifica se a soma de todos os valores contidos na matriz é par;
- Método que recebe a matriz  e a imprime; e 
Método que recebe a matriz  e imprime os elementos da diagonal principal e diagonal secundária.
*/

public class MétodosEMatriz {

    public static void main(String[] args) {

        int[][] matriz = { //declaração de matriz 4x4 sem leitura de dados
            {1,2},
            {3,4},
        };

        verificaPar(matriz);
        imprimir(matriz);
        imprimirDiagonais(matriz);
    
    }

    //- Método que recebe a matriz e verifica se a soma de todos os valores contidos na matriz é par;
    public static void verificaPar(int[][] matriz) {

        int soma = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                soma = soma + matriz[i][j];
            }
        }

        if(soma % 2 == 0) {
            System.out.println("A soma é número par! Soma: " + soma);
        } else {
            System.out.println("A soma é número ímpar! Soma: " + soma);
        }

    }

    //- Método que recebe a matriz  e a imprime; 
    public static void imprimir(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " │ ");
            }
            System.out.println();
        }
    }

    //- Método que recebe a matriz e imprime os elementos da diagonal principal e diagonal secundária.
    public static void imprimirDiagonais(int[][] matriz) {

        //diagonal principal
        System.out.print("Diagonal principal: ");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                if(i == j) {
                    System.out.print(matriz[i][j] + " │ ");
                }
            }
        }

        //diagonal secundária
        System.out.print("Diagonal secundária: ");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                if(i + j == matriz.length - 1) {
                    System.out.print(matriz[i][j] + " │ ");
                }
            }
        }
    }
    
}
