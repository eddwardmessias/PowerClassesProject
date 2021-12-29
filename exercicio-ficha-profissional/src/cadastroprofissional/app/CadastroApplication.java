package cadastroprofissional.app;

import java.util.List;

import cadastroprofissional.model.Cadastro;
import cadastroprofissional.util.LeitorRemessa;

public class CadastroApplication {

	public static void main(String[] args) {
		
		
		LeitorRemessa leitor = new LeitorRemessa();
		
		List<Cadastro> cadastros =	leitor.converter("C:\\Users\\edu\\Downloads\\Teste\\nomes.txt");	
		
		for(Cadastro c: cadastros) {
			
			System.out.println(c);
			
		}
		
	}

}
