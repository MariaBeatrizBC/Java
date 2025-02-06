import java.util.Scanner;

public class CaseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite f1, f2 ou f3: ");
        String palavra = scanner.nextLine();

        switch(palavra) {
            case "f1":
            System.out.println("Fase 1");
            perfeito(scanner);
            break;
            case "f2":
            System.out.println("Fase 2");
            break;
            case "f3":
            System.out.println("Fase 3");
            break;
            default:
            System.out.println("Código inválido! Saindo do programa.");
            System.exit(0);
        }

        scanner.close();

    }

    private static void perfeito(Scanner scanner) {

        System.out.println("Digite um número de 1 a 100:");
        int num = scanner.nextInt();
        int soma = 0;

        if(num > 0 && num <= 100) {
            for(int i = 1; i < num; i++ ) {
                if(num % i == 0) { // Se o resto da divisão do número pelo indíce for igual a 0
                    soma = soma + i;
                }
            }    
            
            if(soma == num) {
                System.out.println("Número perfeito!");
            } else {
                System.out.println("Número imperfeito!");
            }

        } else {
            System.out.println("Número inválido!");
            perfeito(scanner);
        }

    }
}
