/*
3. Crie um programa que possua um método chamado calculaMedia e que recebe as 2 notas de um 
aluno e uma letra por parâmetro. 
	Se a letra recebida for a letra ‘A’ o método deve calcular a média aritmética das notas 
	do aluno, porém se a letra recebida for a ‘P’, o método deve calcular a média ponderada 
	com pesos 7 e 3 para a primeira nota e a segunda nota, respectivamente. 
	A média calculada deve retornar à função principal (main), sendo o valor da média exibido na main.
*/

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = sc.nextDouble();

        System.out.println("Digite A para calcular a média aritmética ou P para calcular a média ponderada:");
        char letra = sc.next().charAt(0); //char é utilizado para um único caractere, como no caso que será utilizada apenas 1 letra

        double media = calcularMedia(nota1, nota2, letra);
        System.out.println("A media calculada é " + media);

        sc.close();

    }

    public static double calcularMedia(double nota1, double nota2, char letra){

        double media = 0;

        if (letra == 'A' || letra == 'a') {
            media = nota1 + nota2 / 2;
        } else if (letra == 'P' || letra == 'p') {
            media = (nota1 * 7) + (nota2 * 3) / 2;
        } else {
            System.out.println("Letra inválida!");
        }
        return media;

    }
}
