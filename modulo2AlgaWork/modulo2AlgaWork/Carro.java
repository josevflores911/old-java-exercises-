package modulo2AlgaWork;

public class Carro {
	
	String fabricante;//atributos
	public String modelo;//string es un objeto no primitivo
	String cor;
	public int anoDeFabricacao; 
	
	Propietario dono;
	
	public void alterarModelo(String modelo) {
		if (modelo!=null) {
			this.modelo= modelo;
		}
	}
	
	void ligar() {
		if (modelo == null) {
			return;//volta logo nao va para a seguinte linha
		}
		
			System.out.println("Ligando o carro: "+ modelo);	
		
		
	}
	
}
