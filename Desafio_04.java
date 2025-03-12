package Projetos_LPA_JT.aula06;

import java.util.Scanner;

public class Desafio_04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int par, impar, numero;
		
		System.out.println("digite um número! Qualquer número!");
		numero = ler.nextInt();
		
		if(numero%2 == 1) {
			System.out.println("este número é ímpar");
		}
		else {
			System.out.println("este número é par");
		}
	}

}
