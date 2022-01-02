package registroprofissional.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import registroprofissional.model.RegistroProfissional;

public class ImpressorRemessa {
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");

	public void imprimirConsole(RegistroProfissional registro) {

	}

	private void verificarArquivo(String cpf) {
		
	}

	public void imprimirArquivoTxt(RegistroProfissional registro) {

	}
	/*	
	public void imprimirFichaProfissional(RegistroProfissional registro) {

		StringBuilder dadosFichaProfissional = new StringBuilder();
		

		dadosFichaProfissional.append("===================== FICHA PROFISSIONAL =====================\n");
		dadosFichaProfissional.append("\nProfiss�o: " + registro.getProfissao()); // T� EM NEGRITO ASSIM COMO FICHA
		dadosFichaProfissional.append("\nNome: " + registro.getNome());
		dadosFichaProfissional.append("\nSal�rio Requerido: M�nimo R$ " + registro.getSalarioMinimo() + " M�ximo R$ "
				+ registro.getSalarioMinimo());
		dadosFichaProfissional.append("\nData de Nasc.: " + registro.getDataNacimento() + " CPF: " + registro.getCpf()
				+ " RG: " + registro.getRg());
		dadosFichaProfissional.append("\nEndere�o: " + registro.getLogradouro());
		dadosFichaProfissional.append("\nN�: " + registro.getNumeroResidencial() + " Bairro: " + registro.getBairro()
				+ " Munic�pio: " + registro.getMunicipio() + " UF: " + registro.getUf());
		dadosFichaProfissional.append("\nCep: " + registro.getCep() + " Naturalidade: " + registro.getNaturalidade()
				+ " Pa�s: " + registro.getPais());
		dadosFichaProfissional.append("\nTelefone: " + registro.getTelefone() + " Celular: " + registro.getCelular()); // adicionar
																														// ddd
																														// +
																														// numero
		dadosFichaProfissional.append("\nE-Mail: " + registro.getEmail());
		dadosFichaProfissional.append("\n");
		
		
		System.out.println(dadosFichaProfissional);
		*/

	}
//