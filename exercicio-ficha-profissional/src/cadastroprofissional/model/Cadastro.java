package cadastroprofissional.model;

public class Cadastro {
	
	
	private String profissao;
	private String nome;
	private String sexo; //nao tem na ficha, porém no requisito 1; 
	private Double salario; //max e minimo pretendido;
	private String dataNacimento;
	private String cpf;
	private String rg;
	//endereço##########
	private String endereço;
	private	String numeroResidencial;
	private	String bairro;
	private	String municipio;
	private String uf; //enum pb estados
	private String cep; //concat
	private	String naturalidade;
	private	String pais;
	//endereço##########
	private String telefone; //enum?  //se é numero estrangeiro e com ddd delimitado caso for estrageiro
	private String email;	
	//grau de instrução lista para escolha
	
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getDataNacimento() {
		return dataNacimento;
	}
	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getNumeroResidencial() {
		return numeroResidencial;
	}
	public void setNumeroResidencial(String numeroResidencial) {
		this.numeroResidencial = numeroResidencial;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Cadastro [profissao=" + profissao + ", nome=" + nome + ", sexo=" + sexo + ", salario=" + salario
				+ ", dataNacimento=" + dataNacimento + ", cpf=" + cpf + ", rg=" + rg + ", endereço=" + endereço
				+ ", numeroResidencial=" + numeroResidencial + ", bairro=" + bairro + ", municipio=" + municipio
				+ ", uf=" + uf + ", cep=" + cep + ", naturalidade=" + naturalidade + ", pais=" + pais + ", telefone="
				+ telefone + ", email=" + email + "]";
	}
	
	
	
	
	
	
	


}
