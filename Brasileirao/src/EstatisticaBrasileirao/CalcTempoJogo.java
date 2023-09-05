package EstatisticaBrasileirao;

public class CalcTempoJogo implements CalculoEstatisticas{

    private double getPosseBolaTimeVisitanteDefesaEmPorcentagem(Jogo jogo) {
        return (jogo.getPosseBolaTimeVisitanteDefesaEmMin() / (jogo.getPosseBolaTimeVisitanteDefesaEmMin() + jogo.getPosseBolaTimeVisitanteAtaqueEmMin())) * 100;
    }

    private double getPosseBolaTimeVisitanteAtaqueEmPorcentagem(Jogo jogo) {
        return (jogo.getPosseBolaTimeVisitanteAtaqueEmMin() / (jogo.getPosseBolaTimeVisitanteDefesaEmMin() + jogo.getPosseBolaTimeVisitanteAtaqueEmMin())) * 100;
    }

    private double getPosseBolaTimeMandanteDefesaEmPorcentagem(Jogo jogo) {
        return (jogo.getPosseBolaTimeMandanteDefesaEmMin() / (jogo.getPosseBolaTimeMandanteDefesaEmMin() + jogo.getPosseBolaTimeMandanteAtaqueEmMin())) * 100;
    }

    private double getPosseBolaTimeMandanteAtaqueEmPorcentagem(Jogo jogo) {
        return (jogo.getPosseBolaTimeMandanteAtaqueEmMin() / (jogo.getPosseBolaTimeMandanteDefesaEmMin() + jogo.getPosseBolaTimeMandanteAtaqueEmMin())) * 100;
    }

    private double getTempoTotalBolaRolandoEmPorcentagem(Jogo jogo) {
        return (jogo.getTempoTotalBolaRolandoEmMin() / jogo.getTempoTotalJogoEmMin()) * 100;
    }

    @Override
    public String calcular(Jogo jogo) {

        return "A bola ficou rolando por " + String.format("%.2f", getTempoTotalBolaRolandoEmPorcentagem(jogo)) + "% do tempo de jogo" + System.lineSeparator() +
                "O time mandante ficou " + String.format("%.2f", getPosseBolaTimeMandanteDefesaEmPorcentagem(jogo)) + "% do tempo de jogo na defesa" + System.lineSeparator() +
                "O time mandante ficou " + String.format("%.2f", getPosseBolaTimeMandanteAtaqueEmPorcentagem(jogo)) + "% do tempo de jogo no ataque" + System.lineSeparator() +
                "O time visitante ficou " + String.format("%.2f", getPosseBolaTimeVisitanteDefesaEmPorcentagem(jogo)) + "% do tempo de jogo na defesa" + System.lineSeparator() +
                "O time visitante ficou " + String.format("%.2f", getPosseBolaTimeVisitanteAtaqueEmPorcentagem(jogo)) + "% do tempo de jogo no ataque" + System.lineSeparator();

    }

}
