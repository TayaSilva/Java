package Taya;

public class Paciente {

	private String nome;
	private String idade;
	private String CPF;
	private String RG;
	private String tipoSan;
	private String endereço;
	private String telefone;
	private String email;
	
	
	
	public Paciente (String nome, String idade, String CPF, String RG, String tipoSan, String endereço, String telefone, String email)
	{
		this.nome = nome;
		this.idade = idade;
		this.CPF = CPF;
		this.RG = RG;
		this.tipoSan = tipoSan;
		this.endereço = endereço;
		this.telefone = telefone;
		this.email = email;
	
	}
	
	
	public Paciente ( String nome, String RG, String email)
	{
		this.nome = nome;
		this.RG = RG;
		this.email = email;
	}
	
	
	public Paciente (String nome, String idade, String telefone, String email)
	{
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.email = email;
	}
	

	
	public void infoSaida()
	{
		System.out.println("\nPaciente:  " + nome + "\nidade: "+ idade +" ano(s)" + "\nCPF: " + CPF + "\nRG: " + RG + "\nO tipo sanguineo: " + tipoSan + "\nEndereço: " 
		+ endereço + "\nTelefone para contato: " + telefone + "\nEmail: "+ email);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getIdade() {
		return idade;
	}


	public void setIdade(String idade) {
		this.idade = idade;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public String getRG() {
		return RG;
	}


	public void setRG(String rG) {
		RG = rG;
	}


	public String getTipoSan() {
		return tipoSan;
	}


	public void setTipoSan(String tipoSan) {
		this.tipoSan = tipoSan;
	}


	public String getEndereço() {
		return endereço;
	}


	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
	
	
	
	
}
