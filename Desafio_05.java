package Projetos_LPA_JT.aula06;

import java.util.Scanner;

public class Desafio_05 {

	public static void main(String[] args) {
		int week;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite o múmero do dia da semana(1-7)");
		week = ler.nextInt();
		
		if(week == 1) {
			System.out.println("segunda-feira");
		}
		else if(week == 2) {
			System.out.println("Terça-feira");
		}
		else if(week ==3) {
			System.out.println("Quarta-feira");
		}
		else if(week == 4) {
			System.out.println("Quinta-feira");
		}
		else if(week == 5) {
			System.out.println("Sexta-feira");
		}
		else if(week == 6) {
			System.out.println("Sábado");
		}
		else if(week == 7) {
			System.out.println("Domingo");
		}
		else {
			System.out.println("dia inválido");
		}

	}

}
