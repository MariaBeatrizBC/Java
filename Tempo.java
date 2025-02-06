/*4. Faça um programa que possua um método chamado Tempo que recebe por parâmetro o 
tempo de duração de uma fábrica expressa em segundos. O método deve efetuar cálculos a fim de 
imprimir a equivalência do tempo recebido em horas, minutos e segundos.
	exemplo:  
	se valor recebido pela função for 7265 segundos então a mesma deve imprimir:
		7265 segundo(s) equivalem a 2 hora(s) , 1 minuto(s) e 5 segundo(s)
*/
import java.util.Scanner;

public class Tempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os segundos: ");
        int seg = sc.nextInt();

        tempo(seg);
        sc.close();

    }
    public static void tempo(int seg){
        
        int horas = seg / 3600; 
        int minutos = (seg % 3600) / 60; 
        int segundos  = (seg % 3600) % 60;

        System.out.println(seg + " equivalem a " + horas + " hora(s), " + minutos + " minuto(s) e " + segundos);

    }
}
