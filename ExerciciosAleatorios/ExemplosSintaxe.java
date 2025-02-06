package ExerciciosAleatorios;
public class ExemplosSintaxe {
    
    public static void main(String[] args) {
        
        //impressão de texto
        System.out.println("Podemos imprimir isso aqui " + 45);

        //tipos primitivos
        int idade = 20;
        int anoAtual = 2024;
        System.out.println("Sua idade é " + idade + " anos e o ano atual é " + anoAtual);

        double altura = 1.59;
        System.out.println("Altura: " + altura);

        String nome = "Maria";
        System.out.println("O nome é " + nome);

        boolean estaLogado = true;
        System.out.println("Está logado? " + estaLogado);

        int a = 10;
        int b = 5;

        System.out.println("A - B = " + (a + b));
        System.out.println("A - B = " + (a - b));
        System.out.println("A - B = " + (a * b));
        System.out.println("A - B = " + (a / b));

        int contador = 0;
        contador++;

        System.out.println(contador);

        //Operador composto

        int comp = 2;
        //comp = comp + 1;
        comp += 1;

        System.out.println(comp += 2);

    }
}
