package avaliacao;

public class Produto {
	
	
	


	



	private int codigo;
	private String nome;
	private String descricao;
	private int anoLancamento;
	private String fabricante;
	private double preco;
	private Setor setor;
	
	
	public Produto(int codigo, String nome, String descricao, int anoLancamento, String fabricante, double preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.anoLancamento = anoLancamento;
		this.fabricante = fabricante;
		this.preco = preco;
	}
	
	public Produto(int codigo, String nome, String descricao, int anoLancamento, String fabricante, double preco,
			Setor setor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.anoLancamento = anoLancamento;
		this.fabricante = fabricante;
		this.preco = preco;
		this.setor = setor;
	}
	
	

	public double aumento = 0;
	
	public void reajustarPreco(double aumento ) {
		aumento = aumento + preco;
		
	}
	
	public double reducao = 0;
	
	public void descontarPreco(double reducao) {
		reducao = reducao - preco;
		
	}
	
	public void caucularIdade() {
		
	}

	@Override
	public String toString() {
		return "codigo= " + codigo  + "\n"
				+ "nome= " + nome  + "\n"
				+ "descricao= " + descricao  + "\n"
				+ "anoLancamento= "+ anoLancamento +"\n" 
				+ "fabricante= " + fabricante + "\n"
				+"preco= " + preco +"\n"
				+"setor= " + setor + "\n";
	}


	
	
	
	

	
	
	
	
	
}	
