package ExerciciosAleatorios;
import java.util.Scanner;

public class UppereLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String palavra = scanner.nextLine();

        palavra = palavra.toUpperCase();
        System.out.println("Maiúsculas: " + palavra);
        palavra = palavra.toLowerCase();
        System.out.println("Minúsculas: " + palavra);

        scanner.close();
    }
}
