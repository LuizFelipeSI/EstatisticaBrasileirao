package EstatisticaBrasileirao;

public class CalcTempoJogo implements CalculoEstatisticas{

    public double getPosseBolaTimeVisitanteDefesaEmPorcentagem(Jogo jogo) {
        return (jogo.getPosseBolaTimeVisitanteDefesaEmMin() / (jogo.getPosseBolaTimeVisitanteDefesaEmMin() + jogo.getPosseBolaTimeVisitanteAtaqueEmMin())) * 100;
    }

    public double getPosseBolaTimeVisitanteAtaqueEmPorcentagem(Jogo jogo) {
        return (jogo.getPosseBolaTimeVisitanteAtaqueEmMin() / (jogo.getPosseBolaTimeVisitanteDefesaEmMin() + jogo.getPosseBolaTimeVisitanteAtaqueEmMin())) * 100;
    }

    public double getPosseBolaTimeMandanteDefesaEmPorcentagem(Jogo jogo) {
        return (jogo.getPosseBolaTimeMandanteDefesaEmMin() / (jogo.getPosseBolaTimeMandanteDefesaEmMin() + jogo.getPosseBolaTimeMandanteAtaqueEmMin())) * 100;
    }

    public double getPosseBolaTimeMandanteAtaqueEmPorcentagem(Jogo jogo) {
        return (jogo.getPosseBolaTimeMandanteAtaqueEmMin() / (jogo.getPosseBolaTimeMandanteDefesaEmMin() + jogo.getPosseBolaTimeMandanteAtaqueEmMin())) * 100;
    }

    public double getTempoTotalBolaRolandoEmPorcentagem(Jogo jogo) {
        return (jogo.getTempoTotalBolaRolandoEmMin() / jogo.getTempoTotalJogoEmMin()) * 100;
    }

    @Override
    public String calcular(Jogo jogo) {

        return "A bola ficou rolando por " + getTempoTotalBolaRolandoEmPorcentagem(jogo) + "% do tempo de jogo" + System.lineSeparator() +
                "O time mandante ficou " + getPosseBolaTimeMandanteDefesaEmPorcentagem(jogo) + "% do tempo de jogo na defesa" + System.lineSeparator() +
                "O time mandante ficou " + getPosseBolaTimeMandanteAtaqueEmPorcentagem(jogo) + "% do tempo de jogo no ataque" + System.lineSeparator() +
                "O time visitante ficou " + getPosseBolaTimeVisitanteDefesaEmPorcentagem(jogo) + "% do tempo de jogo na defesa" + System.lineSeparator() +
                "O time visitante ficou " + getPosseBolaTimeVisitanteAtaqueEmPorcentagem(jogo) + "% do tempo de jogo no ataque" + System.lineSeparator();

    }

}
