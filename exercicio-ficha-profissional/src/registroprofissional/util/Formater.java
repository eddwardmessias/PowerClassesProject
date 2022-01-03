package registroprofissional.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formater extends LeitorRemessa {

	public static String cpf(String cpf) {
		String part1 = cpf.substring(0, 3);
		String part2 = cpf.substring(3, 6);
		String part3 = cpf.substring(6, 9);
		String part4 = cpf.substring(9, 11);
		String cpfFormatado = part1.concat(".").concat(part2).concat(".").concat(part3).concat("-").concat(part4);
		return cpfFormatado;
	}

	public static String cep(String cep) {
		String part1 = cep.substring(0, 5);
		String part2 = cep.substring(5, 8);
		String cepFormatado = part1.concat("-").concat(part2);
		return cepFormatado;
	}

	public static String rg(String rg) {

		if (rg.length() == 6) {
			String part1 = rg.substring(0, 3);
			String part2 = rg.substring(3, 6);
			String rgFormatado = part1.concat(".").concat(part2);
			return rgFormatado;
		} else if (rg.length() == 7) {
			String part1 = rg.substring(0, 1);
			String part2 = rg.substring(1, 4);
			String part3 = rg.substring(4, 7);
			String rgFormatado = part1.concat(".").concat(part2).concat(".").concat(part3);
			return rgFormatado;
		} else if (rg.length() > 7 && rg.length() <= 8) {
			String part1 = rg.substring(0, 2);
			String part2 = rg.substring(2, 5);
			String part3 = rg.substring(5, 8);
			String rgFormatado = part1.concat(".").concat(part2).concat(".").concat(part3);
			return rgFormatado;
		} else if (rg.length() > 8 && rg.length() >= 9) {
			String part1 = rg.substring(0, 2);
			String part2 = rg.substring(2, 5);
			String part3 = rg.substring(5, 8);
			String part4 = rg.substring(8, 9);
			String rgFormatado = part1.concat(".").concat(part2).concat(".").concat(part3).concat("-").concat(part4);
			return rgFormatado;

		} else {
			return rg;
		}

	}

	public static String data(LocalDate data) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return data.format(formatter);
	}

}