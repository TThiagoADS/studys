package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int posmaior;
		double maior;

		System.out.println("Quantos numeros voce vai digitar ?");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}

		maior = vetor[0];
		posmaior = 0;

		for (int i = 1; i < n; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posmaior = i;
			}
		}
		System.out.printf("MAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);
	}

}
