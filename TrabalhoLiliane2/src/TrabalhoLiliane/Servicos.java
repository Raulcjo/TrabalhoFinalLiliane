package TrabalhoLiliane;

public abstract class Servicos {
	private String tipoServico;
	
	public Servicos() {
		
	}
	
	public Servicos(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	
	public String getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}

	public double calcularServico() {
		return 0;
	}

	
}



	
