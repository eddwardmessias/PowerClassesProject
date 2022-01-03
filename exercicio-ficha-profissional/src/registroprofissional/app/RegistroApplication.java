package registroprofissional.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import registroprofissional.model.RegistroProfissional;
import registroprofissional.util.ImpressorRemessa;
import registroprofissional.util.LeitorRemessa;

public class RegistroApplication {

	public static void main(String[] args) throws IOException {

		LeitorRemessa leitor = new LeitorRemessa();

		List<String> arquivo = leitor.ler("dados-profissionais.txt");

		List<RegistroProfissional> registros;

		registros = leitor.converterDelimitado(arquivo);

		ImpressorRemessa impressor = new ImpressorRemessa();

		List<StringBuilder> fichas = new ArrayList<StringBuilder>();

		for (RegistroProfissional registro : registros) {
			StringBuilder ficha = impressor.criarFichaProfissional(registro);
			fichas.add(ficha);
		}

		for (StringBuilder ficha : fichas) {
			impressor.imprimirFichaConsole(ficha);
		}
	}
}