package Exe1;

public class Empregado {
	private int codigo;
	private String nome;
	private String email;
	private double salario;
	private Endereco endereco;
	public int getCodigo() {
		return codigo;
	
	
	}
	public Empregado(int codigo, String nome, String email, double salario, Endereco endereco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.salario = salario;
		this.endereco = endereco;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Empregado [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", salario=" + salario
				+ ", endereco=" + endereco + "]";
	}
	

		
		
	public void reajustaSalario(double percentualAumento) {
	    double aumento = salario * (percentualAumento / 100.0);
	    salario += aumento;
	}

	
	
	
}
