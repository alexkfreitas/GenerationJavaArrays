//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

package arrays;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		int matriz[][] = new int[3][3];
		int quantMaior=0;
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				System.out.print("Insira um valor pra posição ["+i+"]["+j+"] da matriz: ");
				matriz[i][j] = teclado.nextInt();
				
				if(matriz[i][j]>10) {
					quantMaior++;
				}
			}
			
			
		}
		
		teclado.close();
		
		System.out.println("Valores maiores que 10: "+quantMaior);
		
	}

}
