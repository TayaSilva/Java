package Taya;

public class Cachorro extends Animal {

	private String raça;
	private String nomeDono;
	private String rgDono;
	private String tamanho;
	private String correr;
	
	
	
	public Cachorro (String nome, String idade, String som, String raça, String nomeDono,String rgDono, String tamanho, String correr )
	{
		super(nome, idade, som);
		this.raça = raça;
		this.nomeDono = nomeDono;
		this.rgDono = rgDono;
		this.tamanho = tamanho;
		this.correr = correr;
		
	}
	
	public Cachorro (String nome, String idade,String som, String raça, String nomeDono,String rgDono )
	{
		super(nome, idade, som);
		this.raça = raça;
		this.nomeDono = nomeDono;
		this.rgDono = rgDono;
		
	}

	
	
	public String getRaça() {
		return raça;
	}




	public void setRaça(String raça) {
		this.raça = raça;
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




	public String getTamanho() {
		return tamanho;
	}




	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}




	public String getCorrer() {
		return correr;
	}




	public void validaRg ()
	{
		
			if(getRgDono().length()!=9)
			{
				System.out.println("\n -------- RG INVALIDO, DIGITE NOVAMENTE----------");
			}
			else
				System.out.println("\n --------RG VALIDO--------");
	
	}
	
	public void saida()
	{
	
		System.out.println("\nO nome do cachorro é: " + getNome() + "\nIdade: " + getIdade() + "\nO animal emite qual som: "+ getSom() + "\nRaça: "
		+ raça + "\nNome do dono: " + nomeDono + "\nRg do dono: " + rgDono + "\nPorte do cachorro: " + tamanho + "\nO cachorro deve correr: " + correr );
	}
	
	
	
	
	
}
