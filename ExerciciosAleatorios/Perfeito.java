/* Faça um programa que contenha um método que verifique se um valor é perfeito ou não. 
Um valor é dito perfeito quando ele é igual a soma dos seus divisores. 
(Ex: 6 é perfeito, 6 = 1 + 2 + 3, que são seus divisores).
*/
package ExerciciosAleatorios;
import java.util.Scanner;

public class Perfeito {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int num = sc.nextInt();

        if(num > 0){ //verifica se o número é 0
            verificar(num);
        } else {
            System.out.println("Valor precisa ser maior que 0!");
        }

        sc.close();

    }

    public static void verificar(int num){
        int soma = 0;

        for(int i = 1; i < num; i++) {
            if(num % i == 0) { //se o resto da divisão do número pelo indice for igual a 0
                soma = soma + i; //soma recebe o valor atual mais o valor do indice 
            }
        }
        if(soma == num) {
            System.out.println("Perfeito!");
        } else {
            System.out.println("Imperfeito!");
        }
        return;

    }
    
}
