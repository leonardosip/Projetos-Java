package avaliacao;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Setor setor01 = new Setor(31,"LPZ","Limpeza");
		
		Produto produto01 = new Produto(21,"Sabao em po", "Sabao em pó OMO multi ação", 2009,"Protect",25.50,setor01);
		
		Setor setor02 = new Setor (1035,"HGN","Higiene");
		
		Produto produto02 = new Produto (45,"Creme Dental","Creme Dental Tripla ação",2002,"Protect",9.90,setor02);
		
		
		System.out.println(produto01);
		System.out.println(produto02);
		
		
	}

}
