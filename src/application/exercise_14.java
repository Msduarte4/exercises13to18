package application;

import java.util.Locale;
import java.util.Scanner;

public class exercise_14 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre a base da potencia: ");
		double base = sc.nextFloat();
		System.out.println("Entre o exponente da potencia: ");
		double exponent = sc.nextFloat();

		double result = Math.pow(base, exponent);

		System.out.printf("%.2f%n", result);

		sc.close();
	}

}