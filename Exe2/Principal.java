package Exe2;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 ArrayList<Empregado> empregados = new ArrayList<>();
		 
		 Empregado empregado1 = new Empregado(1, "Leonardo", "leonardo@gmail", 10000);
	     Empregado empregado2 = new Empregado(2, "Pedro", "pedro@gmail", 30000);
	     Empregado empregado3 = new Empregado(3, "Lucas", "lucas@gmail", 20000);
	     Empregado empregado4 = new Empregado(4, "Joao", "joao@gmail", 40000);
	     Empregado empregado5 = new Empregado(5, "Tiago", "tiago@gmail", 50000);
	     
	     	empregados.add(empregado1);
	        empregados.add(empregado2);
	        empregados.add(empregado3);
	        empregados.add(empregado4);
	        empregados.add(empregado5);
	        
	        for (Empregado empregado : empregados) {
	           
	        	System.out.println(empregado.toString());
	        }
	    }
}
