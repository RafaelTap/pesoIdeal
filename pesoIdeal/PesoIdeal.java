package pesoIdeal;

import java.util.Scanner;

public class PesoIdeal {

	// Um programa que lê a altura e o sexo de uma pessoa e informa seu peso ideal -
	// Exercício Resolvido de Java

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Sua altura em centímetros.");
		int altura = entrada.nextInt();

		System.out.println("Seu sexo.");
		String sexo = entrada.next();

		if (sexo.equalsIgnoreCase("masculino")) {

			if (altura >= 190 && altura <= 200) {
				System.out.println("Peso ideal 100 Kg");
			} else if (altura >= 180 && altura <= 189) {
				System.out.println("Peso ideal 90 até 98 Kg");
			} else if (altura >= 170 && altura <= 179) {
				System.out.println("Peso ideal 80 até 89 Kg");
			} else if (altura >= 160 && altura <= 169) {
				System.out.println("Peso ideal 70 até 79 Kg");
			} else if (altura >= 150 && altura <= 159) {
				System.out.println("Peso ideal 60 até 69 Kg");
			} else {
				System.out.println("Peso ideal ainda não disponível para sua altura.");
			}

		}

		if (sexo.equalsIgnoreCase("feminino")) {

			if (altura >= 190 && altura <= 200) {
				System.out.println("Peso ideal 90 Kg");
			} else if (altura >= 180 && altura <= 189) {
				System.out.println("Peso ideal 80 até 89 Kg");
			} else if (altura >= 170 && altura <= 179) {
				System.out.println("Peso ideal 70 até 79 Kg");
			} else if (altura >= 160 && altura <= 169) {
				System.out.println("Peso ideal 60 até 69 Kg");
			} else if (altura >= 150 && altura <= 159) {
				System.out.println("Peso ideal 50 até 59 Kg");
			} else {
				System.out.println("Peso ideal ainda não disponível para sua altura.");
			}

		}
		entrada.close();
	}

}
