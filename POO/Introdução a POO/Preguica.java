package Taya;

public class Preguica  extends Animal{


	private String subArv;
	private String cor;
	
	public Preguica (String nome, String idade, String som, String subArv, String cor)
	{
		super(nome, idade, som);
		this.subArv = subArv;
		this.cor = cor;
	}

	public String getSubArv() {
		return subArv;
	}

	public void setSubArv(String subArv) {
		this.subArv = subArv;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
	
	public void saidinha()
	{
		System.out.println("\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nSom do animal: " + getSom() + "\nO animal consegue subir em arvore: "
		+ subArv + "\nQual a cor do animal: " + cor );
	}
	
	
	
}
