package Vetor;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tamanho = 5;
        int[] notas = new int[tamanho]; //declaração

        //leitura dos dados
        for(int i = 0; i < 5; i++){
            System.out.println("Digite a " + (i + 1) + "º nota: ");
            notas[i] = sc.nextInt();
        }

        //impressão dos dados
        System.out.print("Vetor: ");
        for(int i = 0; i < 5; i++){
            System.out.print(notas[i] + " │ ");
        }

        //inverter o vetor
        System.out.print("Vetor inverso: ");
        for(int i = notas.length - 1; i >= 0; i--){
            System.out.print(notas[i] + " │ ");
        }

        sc.close();
    }
}