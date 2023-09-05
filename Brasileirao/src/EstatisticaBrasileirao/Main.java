package EstatisticaBrasileirao;

public class Main {

	public static void main(String[] args) {
		CalcFaltasCartoes cfc = new CalcFaltasCartoes();
		CalcGolsChutes cgc = new CalcGolsChutes();
		CalcTempoJogo ctj = new CalcTempoJogo();
		Jogo jogo = new Jogo(2, 4, 21, 30, 10, 22, 18, 20, 70, 96, 32, 1, 0, 24, 1, 1);

		Gerenciador gerenciador = new Gerenciador();

		System.out.println(gerenciador.calcular(cfc, jogo));
		System.out.println(gerenciador.calcular(cgc, jogo));
		System.out.println(gerenciador.calcular(ctj, jogo));
	}

}
