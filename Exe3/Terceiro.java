package Exe3;

public class Terceiro extends Funcionario{

	public Terceiro(int codigo, String nome, String email, int anoNascimento) {
		super(codigo, nome, email, anoNascimento);
		// TODO Auto-generated constructor stub
	}
	
	private String empresa;
	private double valorHora;
	private double quantidadeHora;
	public Terceiro(int codigo, String nome, String email, int anoNascimento, String empresa, double valorHora,
			double quantidadeHora) {
		super(codigo, nome, email, anoNascimento);
		this.empresa = empresa;
		this.valorHora = valorHora;
		this.quantidadeHora = quantidadeHora;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public double getQuantidadeHora() {
		return quantidadeHora;
	}
	public void setQuantidadeHora(double quantidadeHora) {
		this.quantidadeHora = quantidadeHora;
	}
	
	
	@Override
	public String toString() {
		return "Terceiro [empresa=" + empresa + ", valorHora=" + valorHora + ", quantidadeHora=" + quantidadeHora
				+ ", codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", anoNascimento=" + anoNascimento
				+ "]";
	}
	
	public double desconto(){
		double valorDesconto = (valorHora *quantidadeHora) / 100;
		double salarioDesconto = (valorHora *quantidadeHora) - valorDesconto;
		return salarioDesconto;
	}
	

}
