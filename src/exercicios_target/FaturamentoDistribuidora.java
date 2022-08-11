package exercicios_target;

public class FaturamentoDistribuidora {
	
//	Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
//
//		SP – R$67.836,43
//		RJ – R$36.678,66
//		MG – R$29.229,88
//		ES – R$27.165,48
//		Outros – R$19.849,53
//
//		Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.

	public static void main(String[] args) {

		Double sp = 67836.43;
		Double rj = 36678.66;
		Double mg = 29229.88;
		Double es = 27615.48;
		Double outros = 19849.53;

		Double total = sp + rj + mg + es + outros;

		Double pctSP = sp / total * 100;
		Double pctRJ = rj / total * 100;
		Double pctMG = mg / total * 100;
		Double pctES = es / total * 100;
		Double pctOutros = outros / total * 100;

		System.out.println("VALOR PERCENTUAL DE REPRESENTAÇÃO DE CADA ESTADO NO FATURAMENTO MENSAL");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("SÃO PAULO: " + String.format("%.2f", pctSP) + "%");
		System.out.println("RIO DE JANEIRO: " + String.format("%.2f", pctRJ) + "%");
		System.out.println("MINAS GERAIS: " + String.format("%.2f", pctMG) + "%");
		System.out.println("ESPÍRITO SANTO: " + String.format("%.2f", pctES) + "%");
		System.out.println("OUTROS: " + String.format("%.2f", pctOutros) + "%");
		System.out.println("----------------------------------------------------------------------");
	}
}
