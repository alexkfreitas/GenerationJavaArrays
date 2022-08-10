//2- Faça um programa que receba 6 números inteiros e mostre: 
//• Os números pares digitados;  
//• A soma dos números pares digitados; 
//• Os números ímpares digitados; 
//• A quantidade de números ímpares digitados.


package arrays;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		int numero[] = new int[6];
//		int pares[] = new int[6];
//		int impares[] = new int[6];
		int somapar=0, quantImpar=0;
		
		Scanner teclado = new Scanner(System.in);
				
		for(int i=0;i<numero.length;i++) {
			
			System.out.print("Digite um número inteiro: ");
			numero[i] = teclado.nextInt();
			if(numero[i]%2==0) {
				
				somapar+=numero[i];
				
			} else {
				
				quantImpar++;
			}
			
		}
		
		teclado.close();
		
		System.out.println("\nNúmeros pares digitados: ");
		for(int i=0;i<numero.length;i++) {
			if(numero[i]%2==0) {
				System.out.println(numero[i]);
			}
		}
		
		System.out.println("Soma dos números pares: "+somapar);
		
		System.out.println("\nNúmeros ímpares digitados: ");
		for(int i=0;i<numero.length;i++) {
			
			if(numero[i]%2==1) {
				System.out.println(numero[i]);
			}
		}
		
		System.out.println("Quantidade de números ímpares: "+quantImpar);
		
	}

}
