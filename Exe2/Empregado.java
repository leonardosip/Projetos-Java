package Exe2;

public class Empregado {
	
	private int codigo;
	private String nome;
	private String email;
	private  double salario;
	
	
	public Empregado(int codigo, String nome, String email, double salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}


	public int getCodigo() {
		return codigo;
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


	@Override
	public String toString() {
		return "Empregado [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", salario=" + salario + "]";
	}
	
	public void reajustaSalario(double percentualAumento) {
	    double aumento = salario * (percentualAumento / 100.0);
	    salario += aumento;
	}
	
	
	
	

}
