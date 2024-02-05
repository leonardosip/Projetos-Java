package Exe1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado empregado_01 = new Empregado(1, "Leonardo", "leo@gmail", 50000.0, new Endereco("Rua Senac", "Bairro Senac", 123, "Cidade Senac"));
		System.out.println(empregado_01.toString());
		empregado_01.reajustaSalario(10.0);
		System.out.println("Novo Salário: " + empregado_01.getSalario());
	
		
		Empregado empregado_02 = new Empregado(2, "Pedro", "pedro@gmail", 12000.0, new Endereco("Rua sen", "Bairro Sen", 1233, "Cidade Sen"));
		System.out.println(empregado_02.toString());
		empregado_02.reajustaSalario(20.0);
		System.out.println("Novo Salário do segundo empregado: " + empregado_02.getSalario());
		

	}

}
