package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int qtdPares = 0;
		int [] vetor = new int [n];
		
		for (int i = 0; i<vetor.length; i++) {
		System.out.print("Digite um numero :");
		vetor[i] = sc.nextInt();
		}
		
		for (int i = 0; i<vetor.length; i++) {
			if (vetor[i] % 2 ==0 ) {
				
				System.out.printf("%d  ", vetor[i]);
				qtdPares++;
			}
		}
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdPares);
		sc.close();

	}

}
