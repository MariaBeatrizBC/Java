package Calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao, resultado = 0;
        boolean operacaoValida = true;

        do {
            System.out.println("Calculadora Java");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            if(opcao >= 1 && opcao <= 4) {
                System.out.println("Digite o primeiro número");
                int num1 = sc.nextInt();

                System.out.println("Digite o segundo número");
                int num2 = sc.nextInt();

                switch(opcao) {
                    case 1:
                        resultado = adicionar(num1, num2);
                    break;
                    case 2:
                        resultado = subtrair(num1, num2);
                    break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                    break;
                    case 4:
                        if(num2 != 0){
                            resultado = dividir(num1, num2);
                        } else {
                            System.out.println("Divisão por 0!");
                            operacaoValida = false;
                        }
                    break;
                    default:
                        operacaoValida = false;
                }

                if(operacaoValida) {
                    System.out.println("O resultado é " + resultado);
                }

            } else if(opcao != 0){
                System.out.println("Opção inválida.");
            }

        } while(opcao != 0);
        
            System.out.println("Calculadora encerrando...");
            sc.close();

    }

    public static int adicionar(int num1, int num2){
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static int dividir(int num1, int num2){
        return num1 / num2;
    }

    
}
