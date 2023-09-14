package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vetor = new double [n];
		double soma = 0.0;
		double abaixo = 0;
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i]= sc.nextDouble();
		}
		
		for (int i=0; i<vetor.length; i++) {
			soma += vetor[i];
		}
		
		double media = soma / n;
		
		System.out.println("MEDIA DO VETOR = " + media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		for (int i=0; i<vetor.length; i++) {
				 if (vetor[i] < media) {
			        	System.out.printf("%.1f\n", vetor[i]);	
			}
		}
		System.out.print(abaixo);
		sc.close();

	}

}
