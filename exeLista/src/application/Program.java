package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Integer> listaId = new ArrayList<>();
		List<String> listaNome = new ArrayList<>();
		List<Double> listaSalario = new ArrayList<>();
		
		
		
		System.out.print("Quantos funcionarios serao registrados? ");
		int n = sc.nextInt();
		
		for (int i = 0; i<n;i++) {
			System.out.print("Funcionario " + "#" + (i + 1) + ":");
			System.out.println();
			System.out.print("Id: ");
			int id = sc.nextInt();
			listaId.add(id);
			System.out.print("Name: ");			
			String nome = sc.nextLine();
			listaNome.add(nome);
			sc.nextLine();	
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			listaSalario.add(salario);
			
			Funcionario funcioraio = new Funcionario();
			lis
			System.out.println();
		}
		System.out.print("Qual id do funcionario a receber o aumento: ");
		int idAumento = sc.nextInt();
		System.out.println("Entre com a porcentagem: ");
		Funcionario.tax = sc.nextDouble();
		
		if (listaId.indexOf(idAumento) == idAumento) {
			Funcionario.aumento; 
		}
		
		
		
		sc.close();
	}

}
