package Vetor;
/*******************************************************************************
* Uma agência de publicidade pediu à agência de modelos Luz & Beleza para
* encontrar uma modelo que tenha idade entre 18 e 20 anos para participar de
* uma campanha publicitária milionária de produtos de beleza. Foram inscritas
* 20 candidatas e, ao se inscreverem, forneceram nome e idade. Tais informações
* foram armazenadas em 2 vetores distintos. Faça um programa para imprima o
* vetor que contém os nomes das candidatas aptas a concorrer a uma vaga para
* a campanha milionária.
*******************************************************************************/

import java.util.Scanner;

public class Candidatas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 20;
        String[] nomes = new String[total];
        int[] idades = new int[total];
        int qntAptas = 0;

        for(int i = 0; i < total; i++){
            System.out.println("Digite o primeiro nome da " + (i+1) +"º candidata: ");
            nomes[i] = scanner.nextLine();

            System.out.println("Digite a idade da " + (i+1) +"º candidata: ");
            idades[i] = Integer.parseInt(scanner.nextLine());

            if(idades[i] >= 18 && idades[i] < 21) {
                qntAptas++;
            }
        }

        String[] nomeAptas = new String[qntAptas]; //criando um novo vetor pra colocar somente as aptas
        int[] idadeAptas = new int[qntAptas];
        
        int i = 0;
        for(int j = 0; j < total; j++){
            if(idades[j] >= 18 && idades[j] < 21){
				nomeAptas[i] = nomes[j]; //novo vetor recebe os valores do antigo vetor
				idadeAptas[i] = idades[j];
				i++;
			}
        }

        System.out.println("Cancidatas Aptas:");
        for(int j = 0; j < qntAptas; j++){
            System.out.println("Nome: " + nomes[j] + " │ Idade: " + idades[j]);
        }

        scanner.close();
    }
}
