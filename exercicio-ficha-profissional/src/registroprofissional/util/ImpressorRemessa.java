package registroprofissional.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import registroprofissional.model.RegistroProfissional;

public class ImpressorRemessa {
	

	public void imprimirFichaConsole(StringBuilder fichaProfissional) {
		// imprime no console um registro profissional
		System.out.println(fichaProfissional);
	}

	public void imprimirFichaTxt(StringBuilder fichaProfissional) throws IOException {
		// cria um arquivo txt e imprime nele o resgistro profissional
		int indexReferenciaCpf = fichaProfissional.toString().lastIndexOf("CPF: ");
		int indexCpf = indexReferenciaCpf + 1;
		String cpf = fichaProfissional.substring(indexCpf, indexCpf + 10);
		File arquivoFicha = new File("D:\\desafioEddward\\powerclassesproject\\" + cpf + ".txt");

		if (arquivoFicha.createNewFile() == true) {
			try {
				FileWriter escritor = new FileWriter("D:\\desafioEddward\\powerclassesproject\\" + cpf + ".txt");
				escritor.write(fichaProfissional.toString());
				escritor.write("\n");
				escritor.close();
				System.out.println("Arquivo criado com sucesso");
			} catch (IOException e) {
				System.out.println("Algum erro ocorreu ao escrever no arquivo");
				e.printStackTrace();
			}
		} else {
			System.out.println("A ficha ja existe em formato .txt");

		}
	}

	public StringBuilder criarFichaProfissional(RegistroProfissional registro) {


		StringBuilder dadosFichaProfissional = new StringBuilder();

		dadosFichaProfissional.append("===================== FICHA PROFISSIONAL =====================\n");
		dadosFichaProfissional.append("\nProfiss?o: " + registro.getProfissao());
		dadosFichaProfissional.append("\nNome: " + registro.getNome());
		dadosFichaProfissional.append("\nSal?rio Requerido: M?nimo R$ " + Formater.salario(registro.getSalarioMinimo()) + " M?ximo R$ "
				+ Formater.salario(registro.getSalarioMaximo()));
		dadosFichaProfissional.append("\nData de Nasc.: " + Formater.data(registro.getDataNacimento()) + " CPF: "
				+ Formater.cpf(registro.getCpf()) + " RG: " + Formater.rg(registro.getRg()));
		dadosFichaProfissional.append("\nEndere?o: " + registro.getLogradouro());
		dadosFichaProfissional.append("\nN?: " + registro.getNumeroResidencial() + " Bairro: " + registro.getBairro()
				+ " Munic?pio: " + registro.getMunicipio() + " UF: " + registro.getUf());
		dadosFichaProfissional.append("\nCep: " + Formater.cep(registro.getCep()) + " Naturalidade: "
				+ registro.getNaturalidade() + " Pa?s: " + registro.getPais());
		dadosFichaProfissional.append("\nTelefone: " + registro.getTelefone() + " Celular: " + registro.getCelular());
		dadosFichaProfissional.append("\nE-Mail: " + registro.getEmail());
		dadosFichaProfissional.append("\n");
		return dadosFichaProfissional;
	}
}