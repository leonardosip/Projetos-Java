package Exe1;

public class Endereco {
	
	private  String rua;
	private String bairro;
	private int numero;
	private String cidade;
	public String getRua() {
		return rua;
		
	
		
		
	}
	public Endereco(String rua, String bairro, int numero, String cidade) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", numero=" + numero + ", cidade=" + cidade + "]";
	}
	
	
	
	

}
