package exercicios_target;

import java.util.Scanner;

public class InverteString {
	
//	Escreva um programa que inverta os caracteres de um string.
//
//	IMPORTANTE:
//	a) Essa string pode ser informada atrav�s de qualquer entrada de sua prefer�ncia ou pode ser previamente definida no c�digo;
//	b) Evite usar fun��es prontas, como, por exemplo, reverse;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite uma String: ");
		String original = scan.nextLine();

		String auxiliar = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			auxiliar += original.charAt(i);
		}

		System.out.println("String invertida: " + auxiliar);
		scan.close();
	}
}
