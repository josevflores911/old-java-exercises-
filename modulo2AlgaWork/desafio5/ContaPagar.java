package desafio5;

public class ContaPagar {
	
	private String descricao;
	private double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	
	
	public ContaPagar(){
		
	}
	
	
	//tiene que estar en el mismo orden
	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento ) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.fornecedor = fornecedor;
	}



	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
	//modifique get por this
	public void pagar() {
		System.out.println("-------------------------");
		System.out.println("descricao: " + this.getDescricao() );
		System.out.println("valor: " + this.getValor());
		System.out.println("data: " + this.getDataVencimento() );
		System.out.println("-------------------------");
	
		
	}

}
