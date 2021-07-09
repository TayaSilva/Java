package Taya;

public class Cachorro extends Animal {

	private String ra�a;
	private String nomeDono;
	private String rgDono;
	private String tamanho;
	private String correr;
	
	
	
	public Cachorro (String nome, String idade, String som, String ra�a, String nomeDono,String rgDono, String tamanho, String correr )
	{
		super(nome, idade, som);
		this.ra�a = ra�a;
		this.nomeDono = nomeDono;
		this.rgDono = rgDono;
		this.tamanho = tamanho;
		this.correr = correr;
		
	}
	
	public Cachorro (String nome, String idade,String som, String ra�a, String nomeDono,String rgDono )
	{
		super(nome, idade, som);
		this.ra�a = ra�a;
		this.nomeDono = nomeDono;
		this.rgDono = rgDono;
		
	}

	
	
	public String getRa�a() {
		return ra�a;
	}




	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
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
	
		System.out.println("\nO nome do cachorro �: " + getNome() + "\nIdade: " + getIdade() + "\nO animal emite qual som: "+ getSom() + "\nRa�a: "
		+ ra�a + "\nNome do dono: " + nomeDono + "\nRg do dono: " + rgDono + "\nPorte do cachorro: " + tamanho + "\nO cachorro deve correr: " + correr );
	}
	
	
	
	
	
}
