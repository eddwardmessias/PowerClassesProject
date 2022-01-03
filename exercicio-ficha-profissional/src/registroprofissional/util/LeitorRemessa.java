package registroprofissional.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import registroprofissional.model.RegistroProfissional;

public class LeitorRemessa {

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");

	public List<String> ler(String caminhoArquivo) throws IOException {
		// tem a função apenas de pegar um arquivo em txt e retornar seus dados em List<String>
		List<String> arquivoString = Files.readAllLines(Paths.get("D:\\desafioEddward\\powerclassesproject\\dados-profissionais.txt"), StandardCharsets.UTF_8);
		return arquivoString;
	}

	public int identificar(List<String> arquivoString) {
		// identifica se o arquivo é do tipo Delimitado ou Posicional, para isso verifica
		// se a primeira linha é divisível em 19 partes, o que acontece quando o arquivo é Delimitado
		// caso contrário será Posicional

		String primeiraLinha = (String) arquivoString.get(0);
		int numeroDivisoes = primeiraLinha.split(";").length; 
		if (numeroDivisoes == 19)
			return 1;
		else if (numeroDivisoes == 0)
			return 2;
		else
			System.out.println("Falha ao identificar o tipo de arquivo.");
			return 0;
	}

	public List<RegistroProfissional> converterDelimitado(List<String> arquivoString) {
		// transforma uma representacao de arquivo do tipo Delimitado em lista de
		// RegistroProfissional

		List<RegistroProfissional> registros = new ArrayList<RegistroProfissional>();

		for (String linha: arquivoString) {

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

				String dataNascimento = dados[5];

				LocalDate data = LocalDate.parse(dataNascimento, formatter);
				registro.setDataNascimento(data);

				registros.add(registro);
			}
		}
		return registros;
	}

	public List<RegistroProfissional> converterPosicional(List<String> arquivoString) {
		// converte uma representacao do arquivo que está em String para lista de RegistroProfissional
		List<RegistroProfissional> registros = new ArrayList<RegistroProfissional>();

		for (String linha: arquivoString) {
			if (linha != null && !linha.isEmpty()) {
				RegistroProfissional registro = new RegistroProfissional();
				
				registro.setProfissao(linha.substring(1, 23));
				registro.setNome(linha.substring(24, 57));
				registro.setSexo(linha.substring(58, 66));
				registro.setSalarioMinimo(Double.parseDouble(linha.substring(67, 74)));
				registro.setSalarioMaximo(Double.parseDouble(linha.substring(75, 83)));
				registro.setCpf(linha.substring(92, 102));
				registro.setRg(linha.substring(103, 111)); //criar formatacao para rg. e rgs podem ter a quantidade de caracteres bem variada!
				registro.setLogradouro(linha.substring(112, 147));
				registro.setNumeroResidencial(linha.substring(148, 151));
				registro.setBairro(linha.substring(152, 176));
				registro.setMunicipio(linha.substring(177, 193));
				registro.setUf(linha.substring(194, 195));
				registro.setCep(linha.substring(196, 203));
				registro.setNaturalidade(linha.substring(204, 225)); //naturalidade compreende tanto a cidade quanto o estado que a pessoa nasceu!
				registro.setPais(linha.substring(226, 243));
				registro.setTelefone(linha.substring(244, 251));
				registro.setCelular(linha.substring(252, 264)); // pode variar bastante com a origem do numero de celular
				registro.setEmail(linha.substring(265, 300));

				String dataNascimento = linha.substring(84, 91);

				LocalDate data = LocalDate.parse(dataNascimento, formatter);
				registro.setDataNascimento(data);

				registros.add(registro);
			}
		}
		return registros;
	}			
}