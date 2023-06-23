package TrabalhoLiliane;

import java.util.ArrayList;
import java.util.Scanner;

public class MaridoAluguel {
	private ArrayList<Servicos> lista;

	public MaridoAluguel() {
		lista = new ArrayList<Servicos>();
	}

	public void adicionarServico(Servicos s) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) instanceof ServicosGerais && s instanceof ServicosGerais) {
				ServicosGerais s1 = (ServicosGerais) lista.get(i);
				ServicosGerais s2 = (ServicosGerais) s;
				if (s1.getTipoServico().equals(s2.getTipoServico())) {
					lista.add(s2);
					System.out.println("Serviço Adicionado");
				} else {
					System.out.println("Essa serviço já existe");
				}
			} else if (lista.get(i) instanceof ServicoMetro && s instanceof ServicoMetro) {
				ServicoMetro m1 = (ServicoMetro) lista.get(i);
				ServicoMetro m2 = (ServicoMetro) s;
				if (m1.getTipoServico().equals(m2.getTipoServico())) {
					lista.add(m2);
				} else {
					System.out.println("Serviço Adicionado");
				}
			} else {
				System.out.println("Essa serviço já existe");
			}

		}
	}

	public void excluirServico(String tipoServico) {
		Scanner input = new Scanner(System.in);
		tipoServico = input.nextLine();
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getTipoServico().equals(tipoServico)) {
				lista.remove(i);
				System.out.println("Serviço foi removido");
			}
			else {
				System.out.println("Serviço não encontrada");
			}
		}
		input.close();
	}

	public void editarServico(String tipoServico, double valorHora, double valorMetro) {
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
		
	
	public int ListaServicosMetro(int qtd) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i) instanceof ServicoMetro) {
				qtd++;
			}
		}
		return qtd;
	}
	
	public int ListaServicosGerais(int qtd) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i) instanceof ServicosGerais) {
				qtd++;
			}
		}
		return qtd;
	}

	public ArrayList<Servicos> exibirServico() {
		return lista;
	}
}
