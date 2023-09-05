package EstatisticaBrasileirao;

public class Jogo {
	
	private int golsTimeVisitante;
	private int golsTimeMandante;
	private int chutesAGolTimeVisitante;
	private int chutesAGolTimeMandante;
	private double posseBolaTimeVisitanteDefesaEmMin;
	private double posseBolaTimeVisitanteAtaqueEmMin;
	private double posseBolaTimeMandanteDefesaEmMin;
	private double posseBolaTimeMandanteAtaqueEmMin;
	private double tempoTotalBolaRolandoEmMin;
	private double tempoTotalJogoEmMin;
	private int faltasTimeVisitante;
	private int cartoesAmarelosVisitante;
	private int cartoesVermelhosVisitante;
	private int faltasTimeMandante;
	private int cartoesAmarelosMandante;
	private int cartoesVermelhosMandante;
	
	public int getGolsTimeVisitante() {
		return golsTimeVisitante;
	}
	
	public int getGolsTimeMandante() {
		return golsTimeMandante;
	}
	
	public int getChutesAGolTimeVisitante() {
		return chutesAGolTimeVisitante;
	}
	
	public int getChutesAGolTimeMandante() {
		return chutesAGolTimeMandante;
	}
	
	public double getPosseBolaTimeVisitanteDefesaEmMin() {
		return posseBolaTimeVisitanteDefesaEmMin;
	}
	
	public double getPosseBolaTimeVisitanteAtaqueEmMin() {
		return posseBolaTimeVisitanteAtaqueEmMin;
	}
	
	public double getPosseBolaTimeMandanteDefesaEmMin() {
		return posseBolaTimeMandanteDefesaEmMin;
	}
	
	public double getPosseBolaTimeMandanteAtaqueEmMin() {
		return posseBolaTimeMandanteAtaqueEmMin;
	}
	
	public double getTempoTotalBolaRolandoEmMin() {
		return tempoTotalBolaRolandoEmMin;
	}
	
	public double getTempoTotalJogoEmMin() {
		return tempoTotalJogoEmMin;
	}
	
	public int getFaltasTimeVisitante() {
		return faltasTimeVisitante;
	}
	
	public int getCartoesAmarelosVisitante() {
		return cartoesAmarelosVisitante;
	}
	
	public int getCartoesVermelhosVisitante() {
		return cartoesVermelhosVisitante;
	}
	
	public int getFaltasTimeMandante() {
		return faltasTimeMandante;
	}
	public int getCartoesAmarelosMandante() {
		return cartoesAmarelosMandante;
	}
	
	public int getCartoesVermelhosMandante() {
		return cartoesVermelhosMandante;
	}

	public Jogo(int golsTimeVisitante, int golsTimeMandante, int chutesAGolTimeVisitante, int chutesAGolTimeMandante,
				double posseBolaTimeVisitanteDefesaEmMin, double posseBolaTimeVisitanteAtaqueEmMin,
				double posseBolaTimeMandanteDefesaEmMin, double posseBolaTimeMandanteAtaqueEmMin, double tempoTotalBolaRolandoEmMin,
				double tempoTotalJogoEmMin, int faltasTimeVisitante, int cartoesAmarelosVisitante,
			int cartoesVermelhosVisitante, int faltasTimeMandante, int cartoesAmarelosMandante,
			int cartoesVermelhosMandante) {
		this.golsTimeVisitante = golsTimeVisitante;
		this.golsTimeMandante = golsTimeMandante;
		this.chutesAGolTimeVisitante = chutesAGolTimeVisitante;
		this.chutesAGolTimeMandante = chutesAGolTimeMandante;
		this.posseBolaTimeVisitanteDefesaEmMin = posseBolaTimeVisitanteDefesaEmMin;
		this.posseBolaTimeVisitanteAtaqueEmMin = posseBolaTimeVisitanteAtaqueEmMin;
		this.posseBolaTimeMandanteDefesaEmMin = posseBolaTimeMandanteDefesaEmMin;
		this.posseBolaTimeMandanteAtaqueEmMin = posseBolaTimeMandanteAtaqueEmMin;
		this.tempoTotalBolaRolandoEmMin = tempoTotalBolaRolandoEmMin;
		this.tempoTotalJogoEmMin = tempoTotalJogoEmMin;
		this.faltasTimeVisitante = faltasTimeVisitante;
		this.cartoesAmarelosVisitante = cartoesAmarelosVisitante;
		this.cartoesVermelhosVisitante = cartoesVermelhosVisitante;
		this.faltasTimeMandante = faltasTimeMandante;
		this.cartoesAmarelosMandante = cartoesAmarelosMandante;
		this.cartoesVermelhosMandante = cartoesVermelhosMandante;
	}
}
