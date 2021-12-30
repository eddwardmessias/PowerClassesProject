package cadastroprofissional.app;

import java.util.List;

import cadastroprofissional.model.Cadastro;
import cadastroprofissional.util.LeitorRemessa;

public class CadastroApplication {

	public static void main(String[] args) {
		
	public static void main(String[] args) throws FileNotFoundException {
		
		LeitorRemessa leitorRemessa = new LeitorRemessa();
		List<Cadastro> registros = leitorRemessa.cadastros();
		for (Cadastro registro : registros) {
		System.out.println(registro);
		}
	}

}
