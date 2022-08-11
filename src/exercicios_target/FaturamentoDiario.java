package exercicios_target;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FaturamentoDiario {
	
//	Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
//		• O menor valor de faturamento ocorrido em um dia do mês;
//		• O maior valor de faturamento ocorrido em um dia do mês;
//		• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
//
//		IMPORTANTE:
//		a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
//		b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;

	public static void main(String[] args) {
		List<Double> faturamentoMensal = new ArrayList<>();
		JSONParser parser = new JSONParser();
		Object obj;
		try {
			obj = parser.parse(new FileReader("src/exercicios_target/dados.json"));
			JSONArray array = (JSONArray) obj;

			for (Object x : array) {
				JSONObject ob = (JSONObject) x;
				faturamentoMensal.add((Double) ob.get("valor"));
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ParseException e) {

			e.printStackTrace();
		}

		System.out.println("O menor valor ocorrido no mês foi: " + menorValor(faturamentoMensal));
		System.out.println("O maior valor ocorrido no mês foi: " + maiorValor(faturamentoMensal));
		System.out.println(
				"No total " + quantidadeDeDiasAcimaDaMedia(faturamentoMensal) + " dias ficaram acima da média mensal.");
	}

	private static Double menorValor(List<Double> faturamentoMensal) {
		Double menor = faturamentoMensal.get(0);
		for (Double x : faturamentoMensal) {
			if (x != 0.0) {
				if (x < menor)
					menor = x;
			}
		}
		return menor;
	}

	private static Double maiorValor(List<Double> faturamentoMensal) {
		Double maior = 0.0;
		for (Double x : faturamentoMensal) {
			if (x > maior)
				maior = x;
		}
		return maior;
	}

	private static Double mediaMensal(List<Double> faturamentoMensal) {
		int contador = 0;
		Double media = 0.0;
		for (Double x : faturamentoMensal) {
			if (x != 0.0) {
				media += x;
				contador++;
			}
		}

		return media / contador;
	}

	private static Integer quantidadeDeDiasAcimaDaMedia(List<Double> faturamentoMensal) {
		int contador = 0;
		Double media = mediaMensal(faturamentoMensal);
		for (Double x : faturamentoMensal) {
			if (x > media)
				contador++;
		}
		return contador;
	}

}
