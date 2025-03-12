package Projetos_LPA_JT.aula06;

import java.util.Scanner;

public class IF_ELSE {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		System.out.println("informe um número: ");
		numero = ler.nextInt();

		if (numero >=0) {
			System.out.println("O número é positivo");

		} else {
			System.out.println("epa! Número negativo.");

		}

	}

}
