package ExerciciosAleatorios;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite f1, f2 ou f3: ");
        String opcao = scanner.nextLine();

        switch(opcao) {
            case "f1":
                metodoUm();
            break;
            case "f2":
                System.out.println("Case 2!");
                break;
            case "f3":
                System.out.println("Case 3!");
                break;
            default:
                System.out.println("Erro! Digite f1, f2 ou f3.");
        }

        scanner.close();
    }

    public static void metodoUm(){
        System.out.println("Funcionou!");
    }
}
