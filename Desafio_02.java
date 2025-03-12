package Projetos_LPA_JT.aula06;

import java.util.Scanner;

public class Desafio_02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double nota1, nota2, nota3, nota4, media;

		System.out.println("Digite a primeira nota:");
		nota1 = ler.nextDouble();
		System.out.println("Digite a segunda nota:");
		nota2 = ler.nextDouble();
		System.out.println("Digite a terceira nota:");
		nota3 = ler.nextDouble();
		System.out.println("Digite a quarta nota:");
		nota4 = ler.nextDouble();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 6) {
			System.out.print(media + " Este aluno está aprovado.");
		}
		else if (media < 4) {
				System.out.print(media + " Este aluno está reprovado.");
			}
		else {
			System.out.print(media + " Este aluno foi encaminhado para exame.");
		}
	}

}
