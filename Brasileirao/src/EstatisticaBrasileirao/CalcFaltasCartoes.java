package EstatisticaBrasileirao;

public class CalcFaltasCartoes implements CalculoEstatisticas{

    private int getTotalCartoesAmarelosTimeVisitante(Jogo jogo) {
        return jogo.getCartoesAmarelosVisitante();
    }

    private int getTotalCartoesVermelhosTimeVisitante(Jogo jogo) {
        return jogo.getCartoesVermelhosVisitante();
    }

    private int getTotalCartoesAmarelosTimeMandante(Jogo jogo) {
        return jogo.getCartoesAmarelosMandante();
    }

    private int getTotalCartoesVermelhosTimeMandante(Jogo jogo) {
        return jogo.getCartoesVermelhosMandante();
    }

    private int getTotalFaltasTimeVisitante(Jogo jogo) {
        return jogo.getFaltasTimeVisitante();
    }

    private int getTotalFaltasTimeMandante(Jogo jogo) {
        return jogo.getFaltasTimeMandante();
    }

    private int getTotalFaltas(Jogo jogo) {
        return jogo.getFaltasTimeVisitante() + jogo.getFaltasTimeMandante();
    }

    private double getPorcentagemFaltasTimeVisitante(Jogo jogo) {
        return ((double)jogo.getFaltasTimeVisitante() / getTotalFaltas(jogo)) * 100;
    }

    private double getPorcentagemFaltasTimeMandante(Jogo jogo) {
        return ((double)jogo.getFaltasTimeMandante() / getTotalFaltas(jogo)) * 100;
    }

    @Override
    public String calcular(Jogo jogo) {
        return "Total de Faltas: " + getTotalFaltas(jogo) + System.lineSeparator() +
                "O time mandante teve " + String.format("%.2f", getPorcentagemFaltasTimeMandante(jogo)) + "% das faltas do jogo" + System.lineSeparator() +
                "O time visitante teve " + String.format("%.2f", getPorcentagemFaltasTimeVisitante(jogo)) + "% das faltas do jogo" + System.lineSeparator() +
                "Total de cartões amarelos do time visitante: " + this.getTotalCartoesAmarelosTimeVisitante(jogo) + System.lineSeparator() +
                "Total de cartões vermelhos do time visitante: " + this.getTotalCartoesVermelhosTimeVisitante(jogo) + System.lineSeparator() +
                "Total de cartões amarelos do time mandante: " + this.getTotalCartoesAmarelosTimeMandante(jogo) + System.lineSeparator() +
                "Total de cartões vermelhos do time mandante: " + this.getTotalCartoesVermelhosTimeMandante(jogo) + System.lineSeparator();
    }
}
