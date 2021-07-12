package Taya;

public abstract class  Animal {

	private String nome;
	private String idade;

	
	abstract public void emitirsom1();

	
	public Animal (String nome, String idade)
	{
		super();
		this.nome = nome;
		this.idade = idade;
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

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
