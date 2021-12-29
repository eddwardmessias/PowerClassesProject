package cadastroprofissional.util;

import cadastroprofissional.model.Cadastro;

public class Imprimir {
	
	public void imprimirFichaProfissional (Cadastro cadastro) {
		
		StringBuilder dadosFichaProfissional = new StringBuilder();
		
		dadosFichaProfissional.append("#################### FICHA PROFISSIONAL ####################/n");
		dadosFichaProfissional.append("/nPROFISSÃO: " + cadastro.getNome()); //TÁ EM NEGRITO ASSIM COMO FICHA
		
		System.out.println(dadosFichaProfissional);		
		
	}

}
