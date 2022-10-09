import java.util.ArrayList;
0
public class ControleAssociados {

	public float Media(ArrayList <Associados> associadosList) {
		float soma =0;
		for (int i=0; i <= associadosList.size(); i++) {
			
			 soma += associadosList.get(i).getaltura();
		}
		float media = soma/associadosList.size();
		System.out.println("A media de altura dos associados e de:" + media);
		return media;
	}
	
	
	public int totalDependente(ArrayList <Associados> associadosList) {
		int total =0;
		for (int i=0; i<= associadosList.size(); i++) {
			
			total += associadosList.get(i).getquantidadeFilhos();
		}
		System.out.println("O total de dependentes e de:" + total);
		return total;
	}
	
	
	public int somaFeminino(ArrayList <Associados> associadosList) {
			int soma1=0;
			for (int i=0; i <= associadosList.size(); i++) {
				if(associadosList.get(i).sexo.equals("Feminino")){
					soma1+=1;	
				} else {
				}
			} return soma1;		 
	}
	
	
	public int somaMasculino(ArrayList <Associados> associadosList) {
		int soma2=0;
		for (int i=0; i< associadosList.size(); i++) {
			if(associadosList.get(i).sexo.equals("Masculino")) {
				soma2+=1;
			} else {
			}
		}return soma2;
	}
	
	
	public float Porcentagem(ArrayList <Associados> associadosList, String sexo) {
				
			if(sexo.equals("Feminino")) {
				int tamanho =0;
				tamanho = associadosList.size();
				int valor = somaFeminino(associadosList);
				int porcentagem = (tamanho*valor)/100;
				return porcentagem;
			}else {
				int tamanho2=0;
				tamanho2 += associadosList.size();
				int valor2 = somaMasculino(associadosList);
				int porcentagem2= (tamanho2*valor2)/100;	
				return porcentagem2;
			}
		
			
	}
		public int Maiorsalario (ArrayList <Associados> associadosList) {
			int maior=0;
			for (int i=0; i< associadosList.size(); i++){
				if(associadosList.get(i).getsalario() > maior) {
					maior = associadosList.get(i).getsalario();
					}
				}return maior;
			}
		
			
		
	}