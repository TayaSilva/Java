package Taya;

public class Cliente {

	//atributos
	
	private String nomeCliente;
	private String CPF;
	private String email;

	
	// construtores
	
	public Cliente (String nomeCliente, String CPF, String email)
	{
		this.nomeCliente = nomeCliente;
		this.CPF = CPF;
		this.email = email;
	}
	
	public Cliente (String nomeCliente, String email)
	{
		this.nomeCliente = nomeCliente;
		this.email = email;
	}
	
	// Saida de informações depois 
	public void saidaInfo()
	{
		System.out.println("\nNome: " +nomeCliente + "\npossui o CPF de numero: "+ CPF + "\npossui o email de endereço: "+ email);
	}

	
	//CRTL + AlT + S
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
}

