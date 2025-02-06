package MaisVetor;

public class TestandoFuncoes {

    public static void main(String[] args) {

        int[] numeros = { 2, 5, 2, 1, 0 };
        int[] numeros2 = { 9, 5, 9, 5, 7 };

        totalPares(numeros);
        maiorValor(numeros);
        totalIguais(numeros, numeros2);

    }

    public static void totalPares(int num[]) {

        int count = 0;

        if (num.length == 0 || num == null) {
            System.out.println("Array inválido.");
        } else {
            for (int numeros : num) {
                if (numeros % 2 == 0) {
                    count++;
                } else {
                    continue;
                }
            }

            System.out.println("O total de números pares é " + count);

        }

    }

    public static void maiorValor(int num[]) {

        if (num.length == 0 || num == null) {
            System.out.println("Array inválido.");
        } else {
            int maior = num[0];

            for (int i = 1; i < num.length; i++) { // o for é pra verificar os INDICES do array e não os valores.
                if (num[i] > maior) { // O indice do array num é maior do que o valor guardado na variável maior?
                    maior = num[i]; // se sim, a variável maior recebe esse valor.
                }
            }

            System.out.println("O maior número é " + maior);

        }
    }

    public static void totalIguais(int num[], int num2[]) {

        if (num.length == 0 || num == null || num2.length == 0 || num2 == null) {
            System.out.println("Array inválido.");
        } else {
            int iguais = 0;

            for (int i = 1; i < num.length; i++) { // ler todos os valores do primeiro array
                for (int j = 1; j < num2.length; j++) { // ler todos os valores do segundo array
                    if (num[i] == num2[j]) { // vai comparar se o valor atual do primeiro array é igual ao valor atual
                                             // do segundo array
                        iguais++; // se os valores forem iguais, soma um no contador
                        break; // pra evitar contar o mesmo número mais de uma vez
                    }
                }
            }

            System.out.println("A quantidade de números iguais é " + iguais);

        }

    }
}
