package registroprofissional.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import registroprofissional.model.RegistroProfissional;
import registroprofissional.util.ImpressorRemessa;
import registroprofissional.util.LeitorRemessa;

public class RegistroApplication {

		
	public static void main(String[] args) throws IOException {
		
		// o objeto Leitor sera responsavel por abrir o arquivo, fazer uma copia de seus dados em String
		// nessa string que e a representacao do arquivo, sera verificado se esta no modelo delimitado ou posicional
		// e dependendo do caso (1 ou 2) vai ser chamado o respectivo metodo para conversao apropriada
		LeitorRemessa leitor = new LeitorRemessa();
		
		List<String> arquivo = leitor.ler("dados-profissionais.txt");

		List<RegistroProfissional> registros;

		/*
		int tipoArquivo = leitor.identificar(arquivo);
		
		if (tipoArquivo == 1) {
			registros = leitor.converterPosicional(arquivo);
		}
		else if (tipoArquivo == 2) {
			registros = leitor.converterDelimitado(arquivo);
		}*/

		registros = leitor.converterDelimitado(arquivo);
		
		// o objeto 'impressor' vai imprimir no console (opcao 1) ou num arquivo txt (opcao 2), nesse segundo
		// caso ira verificar se ele ja nao existe antes
		ImpressorRemessa impressor = new ImpressorRemessa();

		List<StringBuilder> fichas = new ArrayList<StringBuilder>();
		
		for (RegistroProfissional registro: registros) {
			StringBuilder ficha = impressor.criarFichaProfissional(registro);
			fichas.add(ficha);
		}

		int tipoImpressao = 1;

		if (tipoImpressao == 1) {
			for (StringBuilder ficha: fichas) {
				impressor.imprimirFichaConsole(ficha);
			}
		}
		else if (tipoImpressao == 2) {
			for (StringBuilder ficha: fichas) {
				impressor.imprimirFichaTxt(ficha);
			}
		}
	}
}