package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int h=1; h<=n; h++) {
			System.out.println("Tax payer #" + h + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double income = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new PessoaFisica(name, income, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int j = sc.nextInt();
				list.add(new PessoaJuridica(name, income, j));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Pessoa p : list) {
			System.out.println(p.getName() + ": $ " + String.format("%.2f",p.imposto()));
		}
		double sum = 0.0;
		for (Pessoa p : list) {
			sum += p.imposto();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + sum);
		
		sc.close();	
	}
}
