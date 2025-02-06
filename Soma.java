/*
2. Crie um programa que lê dois números e envia esses números para um método chamado calculaSoma. 
O método calculaSoma, após receber esses valores, deverá realizar uma soma  e 
imprimir o resultado obtido dentro do método.
*/

import java.util.Scanner;


public class Soma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = sc.nextInt();

        calcularSoma(num1, num2);
        sc.close();

    }

    public static void calcularSoma(int num1, int num2){

        int soma = num1 + num2;
        System.out.println("A soma dos dois valores é " + soma);

        return;

    }
}
