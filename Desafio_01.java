package Projetos_LPA_JT.aula06;

import java.util.Scanner;

public class Desafio_01 {

	public static void main(String[] args) {
//Variáveis.
		Scanner ler = new Scanner(System.in);

		double nota1, nota2, nota3, nota4, media;
//Entrada de dados.
		System.out.println("Digite a primeira nota:");
		nota1 = ler.nextDouble();
		System.out.println("Digite a segunda nota:");
		nota2 = ler.nextDouble();
		System.out.println("Digite a terceira nota:");
		nota3 = ler.nextDouble();
		System.out.println("Digite a quarta nota:");
		nota4 = ler.nextDouble();
//Processamento.
		media = (nota1 + nota2 + nota3 + nota4) / 4;
//Saída.
		if (media >= 6) {
			System.out.print(media + " Approved.");
		}
		else {
				System.out.print(media + " Not approved.");
			}
		}

	}
