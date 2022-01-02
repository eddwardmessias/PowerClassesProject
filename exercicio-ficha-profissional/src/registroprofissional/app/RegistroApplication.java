package registroprofissional.app;

import java.io.FileNotFoundException;
import java.util.List;

import registroprofissional.model.RegistroProfissional;
import registroprofissional.util.ImpressorRemessa;
import registroprofissional.util.LeitorRemessa;

public class RegistroApplication {

		
	public static void main(String[] args) throws FileNotFoundException {
			
		LeitorRemessa leitor = new LeitorRemessa();

		String arquivo = leitor.ler("caminho");

		int tipoArquivo = leitor.identificar(arquivo);

		if (tipoArquivo == 1) {
			List<RegistroProfissional> registros = leitor.converterPosicional("arquivo");
		}
		else if (tipoArquivo == 2) {
			List<RegistroProfissional> registros = leitor.converterDelimitado("arquivo");
		}

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

	
