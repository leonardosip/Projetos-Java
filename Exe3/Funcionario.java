package Exe3;

import java.time.LocalDate;

public abstract class  Funcionario {
	protected int codigo;
	protected String nome;
	protected String email;
	protected int anoNascimento;
	
	
	public Funcionario(int codigo, String nome, String email, int anoNascimento) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.anoNascimento = anoNascimento;
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


	public int getAnoNascimento() {
		return anoNascimento;
	}


	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public int  calculaIdade( ) {
		LocalDate data_local = LocalDate.now();
		int anoAtual = data_local.getYear();
		int idade = anoAtual - anoNascimento;
		return idade;
		}


	@Override
	public String toString() {
		return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", anoNascimento="
				+ anoNascimento + ", A idade do funcionário é" + calculaIdade() + "]";
	}
	
	
	public abstract double desconto();
	}
	

