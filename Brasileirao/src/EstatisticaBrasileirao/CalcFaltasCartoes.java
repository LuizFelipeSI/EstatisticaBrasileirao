package EstatisticaBrasileirao;

public class CalcFaltasCartoes implements CalculoEstatisticas{

    public int getTotalCartoesAmarelosTimeVisitante(Jogo jogo) {
        return jogo.getCartoesAmarelosVisitante();
    }

    public int getTotalCartoesVermelhosTimeVisitante(Jogo jogo) {
        return jogo.getCartoesVermelhosVisitante();
    }

    public int getTotalCartoesAmarelosTimeMandante(Jogo jogo) {
        return jogo.getCartoesAmarelosMandante();
    }

    public int getTotalCartoesVermelhosTimeMandante(Jogo jogo) {
        return jogo.getCartoesVermelhosMandante();
    }

    public int getTotalFaltasTimeVisitante(Jogo jogo) {
        return jogo.getFaltasTimeVisitante();
    }

    public int getTotalFaltasTimeMandante(Jogo jogo) {
        return jogo.getFaltasTimeMandante();
    }

    public int getTotalFaltas(Jogo jogo) {
        return jogo.getFaltasTimeVisitante() + jogo.getFaltasTimeMandante();
    }

    public double getPorcentagemFaltasTimeVisitante(Jogo jogo) {
        return ((double)jogo.getFaltasTimeVisitante() / getTotalFaltas(jogo)) * 100;
    }

    public double getPorcentagemFaltasTimeMandante(Jogo jogo) {
        return ((double)jogo.getFaltasTimeMandante() / getTotalFaltas(jogo)) * 100;
    }

    @Override
    public String calcular(Jogo jogo) {
        return "Total de Faltas: " + getTotalFaltas(jogo) + System.lineSeparator() +
                "O time mandante teve " + getPorcentagemFaltasTimeMandante(jogo) + "% das faltas do jogo" + System.lineSeparator() +
                "O time visitante teve " + getPorcentagemFaltasTimeVisitante(jogo) + "% das faltas do jogo" + System.lineSeparator() +
                "Total de cartões amarelos do time visitante: " + this.getTotalCartoesAmarelosTimeVisitante(jogo) + System.lineSeparator() +
                "Total de cartões vermelhos do time visitante: " + this.getTotalCartoesVermelhosTimeVisitante(jogo) + System.lineSeparator() +
                "Total de cartões amarelos do time mandante: " + this.getTotalCartoesAmarelosTimeMandante(jogo) + System.lineSeparator() +
                "Total de cartões vermelhos do time mandante: " + this.getTotalCartoesVermelhosTimeMandante(jogo) + System.lineSeparator();
    }
}
