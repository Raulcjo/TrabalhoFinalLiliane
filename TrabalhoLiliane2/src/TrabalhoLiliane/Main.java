package TrabalhoLiliane;

import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		double valorMetro = 0, valorHora = 0;
		int horasTrabalhadas = 0, metrosQuadrado = 0;
		String nomeServico = null;
		
		MaridoAluguel ma = new MaridoAluguel();
		ServicosGerais sg = new ServicosGerais("Conserto de pia", 40, 2);
		ServicoMetro sm = new ServicoMetro("Pintura", 20, 30);
		ma.adicionarServicoG(sg);
		ma.adicionarServicoM(sm);
		
		Scanner scanner = new Scanner(System.in);
		
		int num;

		System.out.println("Funções disponíveis: ");
		System.out.println("Adicionar serviços - 1" + 
				"\nRemover serviço - 2" + 
				"\nEditar serviço - 3" + 
				"\nListar serviços - 4"
				);
		System.out.println("Selecione uma opção: "); 
		num = scanner.nextInt();
		
			switch(num){
			 case 1:
				 int n = 0;
				 System.out.println("Escolha qual serviço quer adiconar:"+
			 "\nServiço Gerais - 1" + "\nServiço por Metro - 2");
				 n = scanner.nextInt(); 
				 if(n == 1) {
				
					 System.out.println("Digite o nome do serviço:");
					 scanner.next();
					 nomeServico = scanner.nextLine();
					 System.out.println("Digite o valor hora");
					 valorHora = scanner.nextDouble();
					 System.out.println("Digite o tempo do serviço:");
					 horasTrabalhadas = scanner.nextInt();
					 ServicosGerais serv = new ServicosGerais(nomeServico, valorHora, horasTrabalhadas);
					 ma.adicionarServicoG(serv);
				 }
				 else if(n == 2) {
					 
					 System.out.println("Digite o nome do serviço:");
					 scanner.next();
					 nomeServico = scanner.nextLine();
					 System.out.println("Digite o valor por metro");
					 valorMetro = scanner.nextDouble();
					 System.out.println("Digite o qunatidade de metros²:");
					 metrosQuadrado = scanner.nextInt();
					 ServicoMetro serv1 = new ServicoMetro(nomeServico, valorMetro, metrosQuadrado);
					 ma.adicionarServicoM(serv1); 
				 }
				 else {
					 System.out.println("Opção inválida");
				 }
				 break;
			 case 2:
				 System.out.println("Digite o serviço que deseja remover:");
				 scanner.next();
				 nomeServico = scanner.nextLine();
				 ma.excluirServico(nomeServico);
				 break;
			 case 3:
				 System.out.println("Digite o serviço que deseja editar:");
				 scanner.next();
				 nomeServico = scanner.nextLine();
				 ma.editarServico(nomeServico);
				 break;
			 case 4:
				 ma.exibirServico();
				 break;
				 default:
					System.out.println("Opção não existente");
			}
 
	}
}
