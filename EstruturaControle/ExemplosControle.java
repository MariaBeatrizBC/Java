package EstruturaControle;

public class ExemplosControle {
    
    public static void main(String[] args) {

        //condicionais
        int idade = 20;

        if(idade >= 18) {
            System.out.println("Maior de idade.");
        }
        else {
            System.out.println("Menor de idade.");
        }

        int hora = 19;

        if(hora < 12) {
            System.out.println("Bom dia!");
        } else if(hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        //loops while e for
        int contador = 1;

        while(contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        int[] numeros = {1,2,3,4,5,6};
        int somaPar = 0;
        int somaImpar = 0;

        //cria uma variável temporária para cada item do array
        for(int num : numeros){ 
            if(num % 2 == 0) {
                somaPar += num;
            } else {
                somaImpar += num;
            }
        }

        System.out.println("Soma pares: " + somaPar);
        System.out.println("Soma pares: " + somaImpar);
        
        //break e continue
        for(int i = 1; i <= 10; i++) {
            if(i == 2){
                continue; //pula a execução
            }

            if(i == 8) {
                break; //para a execução
            }
            System.out.println(i);
        }

    }

}
