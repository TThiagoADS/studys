package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();		
		int [][] matriz = new int [m][n];
		
		for (int i = 0; i<matriz.length;i++) {
			for (int j = 0; j<matriz.length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		
		
		
		sc.close();

	}

}
