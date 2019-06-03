package br.com.zup.exercicio.um;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		// Inicializando o Scanner
		Scanner scan = new Scanner(System.in);
		
		// Lista de números impares
		List<Integer> numerosImpares = new ArrayList<Integer>();
		
		// Números pares
		int valor = 0;
		int totalPares = 0;
		
		int controle = 1;
		
		while (controle == 1) {
			System.out.println("Digite um número:");
			int numeroDigitado = scan.nextInt();
			
			if (numeroDigitado % 2 == 0) {
				
				//ADD AQUI
				
			} else {
				numerosImpares.add(numeroDigitado);
//				for (Integer integer : numerosImpares) {
//					System.out.println(integer);
//				}
			}
			
			System.out.println("Para continuar escolhendo um número, digite 1/nSe quiser parar digite 0");
			int escolhaLoop = scan.nextInt();
			controle = escolhaLoop;
			
			System.out.println("Os números que não entraram na soma foram: " + numerosImpares);
			
		}
		
		
		
		
	}

}
