package br.com.lotofacil;

import java.util.Random;

public class Sorteio {

	Random rand = new Random();

	private int[] concurso = new int[15];

	public Sorteio() {

		for (int i = 0; i < concurso.length; i++) {

			concurso[i] = rand.nextInt(100) + 1;
		}
	}

	public void ShowSorteio() {

		System.out.println("\n  Os números da sorte foram:\n");
		for (int i = 0; i < concurso.length; i++) {

			System.out.print(" " + concurso[i]);
		}
	}

}
