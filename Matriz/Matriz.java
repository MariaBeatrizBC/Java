package Matriz;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int qntLinhas = 2, qntColunas = 2; //declarar o tamanho da matriz
        int[][] matriz = new int[qntLinhas][qntColunas]; //declarar a matriz
        //int[][] matriz = new int[2][2]; também poderia ser assim

        System.out.println("Digite os elementos da matriz 2x2:");

        for(int i=0;i<qntLinhas;i++){ //for de i e for de j pra ler os valores da matriz
            for(int j=0;j<qntColunas;j++){
                matriz[i][j] = sc.nextInt(); //para adicionar os valores na matriz
            }
        }

        for(int i=0;i<qntLinhas;i++){ //faz a leitura dos dados novamente, mas agora pra imprimir
            for(int j=0;j<qntColunas;j++){
                System.out.print(matriz[i][j]+ "\t");//imprime os dados da matriz
            }
            System.out.println(); //pula uma linha a cada linha da matriz
        }

        sc.close();

        
    }
}
