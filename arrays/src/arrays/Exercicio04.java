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
		int linha = 0,coluna=0,op;
	
	
		Scanner entrada = new Scanner(System.in);
	
		for(int i=0;i<matriz1.length;i++) {
			for(int j=0;j<matriz1[0].length;j++) {
			
			System.out.print("Digite o valor da posição ["+i+"]["+j+"] da primeira matriz: ");
			matriz1[i][j]=entrada.nextDouble();
			
			System.out.print("Digite o valor da posição ["+i+"]["+j+"] da segunda matriz: ");
			matriz2[i][j]=entrada.nextDouble();
			
			}
		}
		
		System.out.print("\nDefina um valor para a constante que poderá ser adicionada posteriormente às matrizes: ");
		a = entrada.nextDouble();
		
		do {
		System.out.print("\n\n(1) somar as duas matrizes \r\n"
				+ "(2) subtrair a primeira matriz da segunda \r\n"
				+ "(3) adicionar uma constante as duas matrizes\r\n"
				+ "(4) imprimir as matrizes \r\n"
				+ "(5) sair \r\n"
				+ "Escolha uma das opções acima: ");
		op=entrada.nextInt();
		
		switch (op) {
			
		case 1:
			for(int i=0;i<matriz1.length;i++) {
				for(int j=0;j<matriz1[0].length;j++) {
			matrizSoma[i][j]=matriz1[i][j]+matriz2[i][j];
			System.out.println("\nPrimeira matriz ["+i+"]["+j+"] + Segunda matriz ["+i+"]["+j+"] = "+matrizSoma[i][j]);
				}
			}
			
			break;
			
		case 2:
			for(int i=0;i<matriz1.length;i++) {
				for(int j=0;j<matriz1[0].length;j++) {
			matrizSub[i][j]=matriz2[i][j]-matriz1[i][j];
			System.out.println("\nSegunda matriz ["+i+"]["+j+"] - Primeira matriz ["+i+"]["+j+"] = "+matrizSub[i][j]);
				}
			}
			
			break;
			
		case 3:
			
			do {
				System.out.print("\nEm qual linha você quer adicionar a constante na matriz 1? (Escolha 0 ou 1): ");
				op=entrada.nextInt();
				
				if(op!=0 && op!=1) {
					System.out.println("\nEssa linha não existe! Tente novamente!");
				} else {
					linha=op;
				}
			}while(op!=0 && op!=1);
			
			
			do {
				System.out.print("\nEm qual coluna você quer adicionar a constante na matriz 1? (Escolha 0 ou 1): ");
				op=entrada.nextInt();
				
				if(op!=0 && op!=1) {
					System.out.println("\nEssa coluna não existe! Tente novamente!");
				} else {
					coluna=op;
					System.out.println("\nValor atual na posição ["+linha+"]["+coluna+"] da primeira matriz = "+matriz1[linha][coluna]);
					matriz1[linha][coluna]=a;
					System.out.println("Valor da posição ["+linha+"]["+coluna+"] após adição da constante "
							+ "na primeira matriz = "+matriz1[linha][coluna]);
				}
			}while(op!=0 && op!=1);	
			
			
			do {
				System.out.print("\nEm qual linha você quer adicionar a constante na matriz 2? (Escolha 0 ou 1): ");
				op=entrada.nextInt();
				
				if(op!=0 && op!=1) {
					System.out.println("\nEssa linha não existe! Tente novamente!");
				} else {
					linha=op;
				}
			}while(op!=0 && op!=1);
			
			
			do {
				System.out.print("\nEm qual coluna você quer adicionar a constante na matriz 2? (Escolha 0 ou 1): ");
				op=entrada.nextInt();
				
				if(op!=0 && op!=1) {
					System.out.println("\nEssa coluna não existe! Tente novamente!");
				} else {
					coluna=op;
					System.out.println("Valor atual na posição ["+linha+"]["+coluna+"] da segunda matriz = "+matriz2[linha][coluna]);
					matriz2[linha][coluna]=a;
					System.out.println("Valor da posição ["+linha+"]["+coluna+"] após adição da constante "
							+ "na segunda matriz = "+matriz2[linha][coluna]);
				}
			}while(op!=0 && op!=1);	
			
			break;
			
		case 4:
			
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
			
			break;
			
		case 5:
			System.out.println("Encerrando execução do programa... ");
			break;
			default:
				
				System.out.println("\nOpção inválida! Tente novamente!");
				
		}
		
		
		}while(op!=5);
		

		entrada.close();
	}
}
