//4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
//(1) somar as duas matrizes 
//(2) subtrair a primeira matriz da segunda 
//(3) adicionar uma constante as duas matrizes
//(4) imprimir as matrizes 
//Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e 
//o resultado da adição da constante deve ser armazenado na própria matriz.
//

package arrays;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		final double a;
		double matriz1[][] = new double[2][2];
		double matriz2[][] = new double[2][2];
		double matrizSoma[][] = new double[2][2];
		double matrizSub[][] = new double[2][2];
		int linha = 0,coluna,op;
		
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0;i<matriz1.length;i++) {
			for(int j=0;j<matriz1[0].length;j++) {
				
				System.out.print("Digite o valor da posição ["+i+"]["+j+"] da primeira matriz: ");
				matriz1[i][j]=entrada.nextDouble();
				
				System.out.print("Digite o valor da posição ["+i+"]["+j+"] da segunda matriz: ");
				matriz2[i][j]=entrada.nextDouble();
				
				matrizSoma[i][j]=matriz1[i][j]+matriz2[i][j];
				System.out.println("Resultado da soma: "+matrizSoma[i][j]);
				
				matrizSub[i][j]=matriz1[i][j]-matriz2[i][j];
				System.out.println("Resultado da subtração: "+matrizSub[i][j]);
				
			}
		}
		
		System.out.println("Insira o valor da constante que será adicionado às duas matrizes: ");
		a = entrada.nextDouble();
		
		
		do {
			System.out.println("Em qual linha você quer adicionar a constante na matriz 1? (Escolha 0 ou 1)");
			op=entrada.nextInt();
			
			if(op!=0 && op!=1) {
				System.out.println("Essa linha não existe! Tente novamente!");
			} else {
				linha=op;
			}
		}while(op!=0 && op!=1);
		
		
		do {
			System.out.println("Em qual coluna você quer adicionar a constante na matriz 1? (Escolha 0 ou 1)");
			op=entrada.nextInt();
			
			if(op!=0 && op!=1) {
				System.out.println("Essa coluna não existe! Tente novamente!");
			} else {
				coluna=op;
				matriz1[linha][coluna]+=a;
			}
		}while(op!=0 && op!=1);	
		
		
		do {
			System.out.println("Em qual linha você quer adicionar a constante na matriz 2? (Escolha 0 ou 1)");
			op=entrada.nextInt();
			
			if(op!=0 && op!=1) {
				System.out.println("Essa linha não existe! Tente novamente!");
			} else {
				linha=op;
			}
		}while(op!=0 && op!=1);
		
		
		do {
			System.out.println("Em qual coluna você quer adicionar a constante na matriz 2? (Escolha 0 ou 1)");
			op=entrada.nextInt();
			
			if(op!=0 && op!=1) {
				System.out.println("Essa coluna não existe! Tente novamente!");
			} else {
				coluna=op;
				matriz2[linha][coluna]+=a;
			}
		}while(op!=0 && op!=1);	
		
		
		System.out.println("\nPrimeira matriz: ");
		for(int i=0;i<matriz1.length;i++) {
			for(int j=0;j<matriz1[0].length;j++) {
				
				System.out.println("Posição ["+i+"]["+j+"] = "+matriz1[i][j]);
				
			}
		}
		
		System.out.println("\nSegunda matriz: ");
		for(int i=0;i<matriz2.length;i++) {
			for(int j=0;j<matriz2[0].length;j++) {
				
				System.out.println("Posição ["+i+"]["+j+"] = "+matriz2[i][j]);
				
			}
		}
		
		System.out.println("\nMatriz Soma: ");
		for(int i=0;i<matrizSoma.length;i++) {
			for(int j=0;j<matrizSoma[0].length;j++) {
				
				System.out.println("Posição ["+i+"]["+j+"] = "+matrizSoma[i][j]);
				
			}
		}
		
		System.out.println("\nMatriz Subtração: ");
		for(int i=0;i<matrizSub.length;i++) {
			for(int j=0;j<matrizSub[0].length;j++) {
				
				
				System.out.println("Posição ["+i+"]["+j+"] = "+matrizSub[i][j]);
				
			}
		}
		
		entrada.close();
	}

}
