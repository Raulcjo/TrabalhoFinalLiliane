package TrabalhoLiliane;

public class ServicoMetro extends Servicos{
	private double valorMetro;
	private int metrosQuadrado;
	
	public ServicoMetro() {
		
	}
	
	public ServicoMetro(String tipoServico, double valorMetro,  int metrosQuadrado) {
		super(tipoServico);
		this.valorMetro = valorMetro;
		this.metrosQuadrado = metrosQuadrado;
	}

	public double getValorMetro() {
		return valorMetro;
	}

	public void setValorMetro(double valorMetro) {
		this.valorMetro = valorMetro;
	}

	public double getMetrosQuadrado() {
		return metrosQuadrado;
	}

	public void setMetrosQuadrado( int metrosQuadrado) {
		this.metrosQuadrado = metrosQuadrado;
	}

	public double calcularServico() {
		double taxa = valorMetro*0.5;
		return valorMetro*metrosQuadrado + taxa;
	}
	
}
