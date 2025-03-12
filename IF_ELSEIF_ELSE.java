package Projetos_LPA_JT.aula06;

import java.util.Scanner;

public class IF_ELSEIF_ELSE {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("informe o número: ");
		numero = ler.nextInt();
		
		if(numero >0) {
			System.out.println("o número é positivo");
		}
		else if(numero == 0) {
			System.out.println("o número é zero");
		}
		else {
			System.out.println("o número é negativo");
		}
	}

}
