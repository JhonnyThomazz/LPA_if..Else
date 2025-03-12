package Projetos_LPA_JT.aula06;

import java.util.Scanner;

public class Desafio_05_ALT {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String[] opcoes = {"domingo", "segunda", "terça", "quarta", "quinta", "sexta"};
		System.out.println("informe um dia da semana(0-6)");
		int week = ler.nextInt();
		
		if(week> 6 || week< 0) {
			System.out.println("Erro! Dia inválido!");
			
			}
		else {
			System.out.println("O dia é: " + opcoes[week]);
		}
    
	}

}
