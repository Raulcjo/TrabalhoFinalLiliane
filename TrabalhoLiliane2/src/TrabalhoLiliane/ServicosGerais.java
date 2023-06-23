package TrabalhoLiliane;

public class ServicosGerais extends Servicos{
	private double valorHora;
	private int horasTrabalhadas;
	
	public ServicosGerais() {
		 
	}
	
	public ServicosGerais(String tipoServico,  double valorHora, int horasTrabalhadas) {
		super(tipoServico);
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double calcularServico() {
		double taxa = valorHora*0.5;
		return valorHora*horasTrabalhadas + taxa;
	}



}
