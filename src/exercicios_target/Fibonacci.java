package exercicios_target;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

//	Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor 
//	sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
//	escreva um programa na linguagem que desejar onde, informado um número,
//	ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se
//	o número informado pertence ou não a sequência.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Long> sequenciaFibonacci = new ArrayList<>();

		long num = 0;

		for (int i = 0; i < 25; i++) {
			sequenciaFibonacci.add(geradorFibonacci(i));
		}

		System.out.print("Informe um valor númerico: ");
		num = scan.nextLong();

		if (verificaSeONumeroExisteNaSequencia(sequenciaFibonacci, num))
			System.out.println("Esse número pertence a sequência de Fibonacci");
		else
			System.out.println("Esse número não pertence a sequência de Fibonacci");

		scan.close();
	}

	private static long geradorFibonacci(int num) {
		if (num < 2)
			return num;
		else
			return geradorFibonacci(num - 1) + geradorFibonacci(num - 2);
	}

	private static boolean verificaSeONumeroExisteNaSequencia(List<Long> sequenciaFibonacci, long num) {
		for (long x : sequenciaFibonacci) {
			if (x == num)
				return true;
		}
		return false;
	}

}
