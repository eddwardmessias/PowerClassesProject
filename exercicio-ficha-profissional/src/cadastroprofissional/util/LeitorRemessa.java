package cadastroprofissional.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import cadastroprofissional.model.Cadastro;


public class LeitorRemessa {
	
	private List<String> ler(String diretorioArquivo) {
		
		try {
            List<String> cadastros = Files.readAllLines(Paths.get(diretorioArquivo), StandardCharsets.UTF_8);
            return cadastros;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
	}
	
	public List<Cadastro> converter(String diretorioArquivo) {
		
		List<String> informacoesPessoais = ler(diretorioArquivo);
		
		List<Cadastro> cadastros = new ArrayList();
		
		for(String info: informacoesPessoais) {
			Cadastro cad = new Cadastro();
			
			cadastros.add(cad);
		}
		
				
		return null;
		
		
	}

}
