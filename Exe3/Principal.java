package Exe3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contratado emp01 = new Contratado(1010, "Marcos Paulo Silva", "marcos@gmail.com", 1985, "TT", 5000);
		System.out.println(emp01.toString());
		System.out.println( "A idade do contratado � " + emp01.calculaIdade());
		System.out.println("Salario com desconto  " + emp01.desconto());
		
		Terceiro emp02 = new Terceiro(2010,"Ana Claudia Pedrosa", "ana@gmail.com", 1988, "SENAC", 80, 40);
		System.out.println(emp02.toString());
		System.out.println( "A idade do contratado � " + emp02.calculaIdade());
		System.out.println("Salario com desconto  " + emp02.desconto());

	}

}
