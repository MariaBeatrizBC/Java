import java.util.Scanner;

public class Palindromo 
{

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de até 3 casas decimais:");
        int numero = sc.nextInt();

        int c = numero / 100;
        int resto = numero % 100;
        int d = resto / 10;
        int u = numero % 10;

        System.out.println("O número " + numero + " de forma invertida é: " + u + d + c);
        sc.close();

    }
}