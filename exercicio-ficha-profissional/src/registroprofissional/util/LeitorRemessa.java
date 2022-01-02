package registroprofissional.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import registroprofissional.model.RegistroProfissional;

public class LeitorRemessa {

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");

	public String ler(String caminho) {
		// tem a função apenas de pegar um arquivo em txt e retornar seus dados em
		// String
		return "a";
	}

	public int identificar(String arquivoString) {
		// identifica a partir de algum padrao se o arquivo é Posicional ou Delimitado
		return 1;
	}

	public List<RegistroProfissional> converterDelimitado(String arquivoString) {
		List<RegistroProfissional> a;
		// transforma uma representacao de arquivo do tipo Delimitado em lista de
		// RegistroProfissional
		FileInputStream entradaArquivo = new FileInputStream(
				new File("/home/jonatas/Desktop/Java/powerclassesproject/dados-profissionais.txt"));
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

		List<RegistroProfissional> registro = new ArrayList<RegistroProfissional>();

		while (lerArquivo.hasNext()) {

			String linha = lerArquivo.nextLine();

			if (linha != null && !linha.isEmpty()) {

				String[] dados = linha.split(";");

				RegistroProfissional registro = new RegistroProfissional();

				registro.setProfissao(dados[0]);
				registro.setNome(dados[1]);
				registro.setSexo(dados[2]);
				registro.setSalarioMinimo(Double.parseDouble(dados[3]));
				registro.setSalarioMaximo(Double.parseDouble(dados[4]));
				registro.setCpf(dados[6]);
				registro.setRg(dados[7]);
				registro.setLogradouro(dados[8]);
				registro.setNumeroResidencial(dados[9]);
				registro.setBairro(dados[10]);
				registro.setMunicipio(dados[11]);
				registro.setUf(dados[12]);
				registro.setCep(dados[13]);
				registro.setNaturalidade(dados[14]);
				registro.setPais(dados[15]);
				registro.setTelefone(dados[16]);
				registro.setCelular(dados[17]);
				registro.setEmail(dados[18]);

				String DataNacimento = dados[5];

				LocalDate data = LocalDate.parse(DataNacimento, formatter);
				registro.setDataNacimento(data);

				registro.add(registro);

			}
		}
		return registro;

	}

	public List<RegistroProfissional> converterPosicional(String arquivoString) {
		// converte uma representacao do arquivo que está em String para lista de RegistroProfissional
		List<RegistroProfissional> a;
		return a;
	}
}