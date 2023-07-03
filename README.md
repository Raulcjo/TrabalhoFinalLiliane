package TrabalhoLiliane;

import java.util.ArrayList;
import java.util.Scanner;

public class MaridoAluguel {
	private ArrayList<Servicos> lista;

	public MaridoAluguel() {
		lista = new ArrayList<Servicos>();
	}

	public void adicionarServicoG(ServicosGerais s) {
		for (int i = 0; i < lista.size(); i++) {
			if (!lista.get(i).equals(s)) {  
				lista.add(s);
				System.out.println("Serviço adicionado");
				break;
			} else {
				System.out.println("Essa serviço já existe");
			}
		}
	}
	
	public void adicionarServicoM(ServicoMetro s) {
		if(lista.size() == 0) {
			lista.add(s);
		}
		else {
			for (int i = 0; i < lista.size(); i++) {
				if (!lista.get(i).equals(s)) {  
					lista.add(s);
					System.out.println("Serviço adicionado");
					break;
				} else {
					System.out.println("Essa serviço já existe");
				}
			}
		}
	}

	public void excluirServico(String tipoServico) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getTipoServico().equals(tipoServico)) {
				lista.remove(i);
				System.out.println("Serviço foi removido");
				break;
			}
			else {
				System.out.println("Serviço não encontrado");
			}
		}
	}

	public void editarServico(String tipoServico) {
		 double valorHora = 0, valorMetro = 0;
		try {
			boolean encontrado = false;
			for (Servicos e : lista) {
				if (((ServicosGerais) e).getTipoServico().equals(tipoServico)) {
					((ServicosGerais) e).setValorHora(valorHora);
					encontrado = true;
					System.out.println("Serviço editado com sucesso!");
					break;
				} else if (((ServicoMetro) e).getTipoServico().equals(tipoServico)) {
					((ServicoMetro) e).setValorMetro(valorMetro);
					encontrado = true;
					System.out.println("Serviço editado com sucesso!");
					break;
				}
			}
			if (!encontrado) {
				System.out.println("Serviço não encontrado");
			}
		}catch(Exception erro){
			System.out.println("Erro durante a Edição: " + erro.getMessage());
		}
	}
		

	public void exibirServico() {
		System.out.println(lista);
	}
}
