package Taya;

public class Cavalo extends Animal {
	

	private String nomeDono;
	private String rgDono;
	private String correr;
	private String cor;
	
	public Cavalo (String nome, String idade, String som, String nomeDono,String rgDono, String correr, String cor)
	{
		super(nome, idade, som);
		this.nomeDono = nomeDono;
		this.rgDono = rgDono;
		this.correr = correr;
		this.cor = cor;
		
	}
	
	public Cavalo (String nome,String idade, String som)
	{
	super (nome, idade, som);
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public String getRgDono() {
		return rgDono;
	}

	public void setRgDono(String rgDono) {
		this.rgDono = rgDono;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
	public void saida ()
	{
		System.out.println("\nO nome do cavalo: " + getNome() + "\nIdade: " + getIdade() + "\nO som do cavalo: " + getSom()+ "\nNome do dono: " 
		+ nomeDono + "\nRg do dono: " + rgDono + "\nO animal corre" + correr + "\nCor: " + cor);
	}
	
	
	
	
	
	
	
}
