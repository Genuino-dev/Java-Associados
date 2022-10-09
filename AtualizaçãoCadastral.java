import java.util.ArrayList;
import java.util.Scanner;


public class AtualizaçãoCadastral {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		ArrayList <Associados> associadosList = new ArrayList<>();
		
		int associado;
		
		System.out.println("Digite a quantidade de associados");
		associado = input.nextInt();	
		
		
		Associados associados = new Associados ();
		int contador=0;
			
			while (contador < associado) {
					System.out.println("Digite o nome");
					associados.setNome(input.nextLine());
					input.nextLine();
					System.out.println("Digite o numero");
					associados.setnumero(input.nextInt());
					input.nextLine();
					System.out.println("Digite o sexo");
					associados.setsexo(input.nextLine());
					System.out.println("Digite a altura");
					associados.setaltura(input.nextFloat());
					input.nextLine();
					System.out.println("Digite o salario");
					associados.setsalario(input.nextInt());
					input.nextLine();
					System.out.println("Digite a quantidade de filhos de seu associado");
					associados.setquantidadeFilhos(input.nextInt());
					input.nextLine();
					associadosList.add (associados);
					contador++;
			} 	
				
			int opcao=-1;
			while (opcao!=0) {
				
				System.out.println("Escolha qual relatorio voce deseja ");
				System.out.println("1. Visualizar lista de socios");
		        System.out.println("2. Media da altura dos associados");
		        System.out.println("3. Total de dependentes"); 
		        System.out.println("4. Quantidade de homem e mulheres e sua representatividade na associacao em porcentagem");
		        System.out.println("5. Nome do associado e maior salario"); 
		        System.out.println("0. Encerrar o programa");
		        break;
		        }
			
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1: if (associadosList.size()==0){
				System.out.println("Nao existe associados cadastrados");
			} else {
				for (int i=0; i < associadosList.size(); i++ ) {
			
					 System.out.println("Nome" +  associadosList.get(i).getNome());
                     System.out.println("Numero: " + associadosList.get(i).getnumero());
                     System.out.println("Sexo: " + associadosList.get(i).getsexo());
                     System.out.println("Altura: " + associadosList.get(i).getaltura());
                     System.out.println("Salario: " + associadosList.get(i).getsalario());
                     System.out.println("Quantidade de filhos:" + associadosList.get(i).getquantidadeFilhos());
				} break;
			}
			case 2:
				ControleAssociados controle = new ControleAssociados();
				controle.Media(associadosList);
				break;
			case 3:
				ControleAssociados control = new ControleAssociados();
				control.totalDependente(associadosList);
				break;	
			case 4:  
				ControleAssociados control1 = new ControleAssociados();
					String opcao1;
					System.out.println("Deseja visualizar os Femininos ou Masculinos?");
					opcao1 = input.nextLine();
					control1.Porcentagem(associadosList, opcao1);
					System.out.println("A porcentagem e de:" + control1.Porcentagem(associadosList, opcao1));
					break;
			case 5:
				ControleAssociados novoAssociado = new ControleAssociados();
				novoAssociado.Maiorsalario(associadosList);
				break;
				
			} 
}
}
