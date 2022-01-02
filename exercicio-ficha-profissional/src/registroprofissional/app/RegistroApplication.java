package registroprofissional.app;

import java.io.FileNotFoundException;
import java.util.List;

import registroprofissional.model.RegistroProfissional;
import registroprofissional.util.ImpressorRemessa;
import registroprofissional.util.LeitorRemessa;

public class RegistroApplication {

		
	public static void main(String[] args) throws FileNotFoundException {
		
		// o objeto Leitor sera responsavel por abrir o arquivo, fazer uma copia de seus dados em String
		// nessa string que e a representacao do arquivo, sera verificado se esta no modelo delimitado ou posicional
		// e dependendo do caso (1 ou 2) vai ser chamado o respectivo metodo para conversao apropriada
		LeitorRemessa leitor = new LeitorRemessa();

		String arquivo = leitor.ler("caminho");

		int tipoArquivo = leitor.identificar(arquivo);

		if (tipoArquivo == 1) {
			List<RegistroProfissional> registros = leitor.converterPosicional("arquivo");
		}
		else if (tipoArquivo == 2) {
			List<RegistroProfissional> registros = leitor.converterDelimitado("arquivo");
		}

		// o objeto 'impressor' vai imprimir no console (opcao 1) ou num arquivo txt (opcao 2), nesse segundo
		// caso ira verificar se ele ja nao existe antes
		ImpressorRemessa impressor = new ImpressorRemessa();

		int tipoImpressao = 1;

		if (tipoImpressao == 1) {
			for (RegistroProfissional registro: registros) {
				impressor.imprimirConsole(registro);
			}
		}
		else if (tipoImpressao == 2) {
			for (RegistroProfissional registro: registros) {
				impressor.imprimirArquivoTxt(registro);
			}
		}
	
	
	}
}
//