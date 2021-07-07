package Taya;

public class Funcionarios {

	private String funcionario;
	private String codFuncionario;
	private String email;
	
	
	
	public Funcionarios (String funcionario, String codFuncionario, String email)
	{
		this.funcionario = funcionario;
		this.codFuncionario = codFuncionario;
		this.email = email;
		
	}

	public Funcionarios (String codFuncionario)
	{
		this.codFuncionario = codFuncionario;
	}
	
	
	
	
		public void infoSaida()
		{
			System.out.println("\nO codigo do funcionario é: " + codFuncionario + "\nNome: "
		+ funcionario + "\nEmail utilizado: "  + email);
			
			
			
		}

	public String getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}


	public String getCodFuncionario() {
		return codFuncionario;
	}


	public void setCodFuncionario(String codFuncionario) {
		this.codFuncionario = codFuncionario;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
