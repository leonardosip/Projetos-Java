package Exe3;

public class Contratado extends Funcionario{

	public Contratado(int codigo, String nome, String email, int anoNascimento) {
		super(codigo, nome, email, anoNascimento);
		// TODO Auto-generated constructor stub
	}
	
	private String area;
	private double salario;
	
	
	public Contratado(int codigo, String nome, String email, int anoNascimento, String area, double salario) {
		super(codigo, nome, email, anoNascimento);
		this.area = area;
		this.salario = salario;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
	
	@Override
	public String toString() {
		return "Contratado [area=" + area + ", salario=" + salario + ", codigo=" + codigo + ", nome=" + nome
				+ ", email=" + email + ", anoNascimento=" + anoNascimento + "]";
	}


	public double desconto() {
		double salarioDesconto = salario * 0.9;
		return salarioDesconto;
		
	}
	
	

}
