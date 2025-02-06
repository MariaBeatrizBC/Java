package ExerciciosAleatorios;
import java.util.Scanner;

public class ChatAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra qualquer:");
        String letra = scanner.next();
        char segunda = letra.charAt(2); //variável pra pegar o índice 2 da string letra

        System.out.println(segunda);
        scanner.close();
    }
}
