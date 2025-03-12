package Projetos_LPA_JT.aula06;

import java.util.Scanner;

public class Desafio_03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.println("informe sua idade: ");
		idade = ler.nextInt();
		
		if (idade < 12) {
			System.out.println("você ainda é criança.");
		}
		else if(idade >= 12 && idade <=17 ) {
			System.out.println("você é adolescente");
		}
		else if(idade >= 18 && idade <=59) {
			System.out.println("você já é adulto");
		}
		else {
			System.out.println("você já é idoso");
		}
	}
	

}
