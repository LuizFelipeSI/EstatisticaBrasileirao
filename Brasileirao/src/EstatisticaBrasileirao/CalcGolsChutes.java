package EstatisticaBrasileirao;

public class CalcGolsChutes implements CalculoEstatisticas{

    public int getTotalGols(Jogo jogo) {
        return jogo.getGolsTimeMandante() + jogo.getGolsTimeVisitante();
    }

    @Override
    public String calcular(Jogo jogo) {

        return "Total de gols no jogo: " + getTotalGols(jogo)  + System.lineSeparator() +
                "O time mandante fez " + jogo.getGolsTimeMandante() + " gols" + System.lineSeparator() +
                "O time visitante fez " + jogo.getGolsTimeVisitante() + " gols" + System.lineSeparator() +
                "O time mandante chutou " + jogo.getChutesAGolTimeMandante() + " vezes no gol" + System.lineSeparator() +
                "O time visitante chutou " + jogo.getChutesAGolTimeVisitante() + " vezes no gol" + System.lineSeparator();

    }
}
