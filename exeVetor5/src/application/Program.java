package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		System.out.println("Quantos valores vai ter cada vetor ? ");
		int n = sc.nextInt();
		int[] vetorA = new int[n];

		System.out.print("Digite os valores do vetor A:");
		System.out.println();
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();

		}
		System.out.println("Digite os valores do vetor B:");
		System.out.println();
		int[] vetorB = new int[n];

		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}

		int[] vetorC = new int[n];

		for (int i = 0; i < vetorC.length; i++) {

			vetorC[i] = vetorA[i] + vetorB[i];

			{

			System.out.println(vetorC[i] + " ");	
				
			sc.close();

		}

	}
}
}