package modulo2AlgaWork;

public class Principal2 {

	public static void main(String[] args) {
		/*Propietario dono = new Propietario();
		dono.nome =  "Joao da Silva";
		dono.cpf ="000.000.000-00";
		dono.idade = 25;
		dono.logradouro = "Rua Joao Pinheiro, 10";
		dono.bairro = "Centro";
		dono.cidade = "Uberlandia";
		
		meuCarro.dono = dono
		*/
		
		Propietario dono1 = new Propietario();
		
		Carro meuCarro = new Carro();
		meuCarro.anoDeFabricacao = 2011;
		meuCarro.cor = "Prata";
		meuCarro.fabricante = "Fiat";
		//meuCarro.modelo = "Palio";
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";
		
		meuCarro.dono = dono1;
		seuCarro.dono = dono1;
		
		
		seuCarro.dono.nome = "Joao da Silva";
		
		System.out.println(meuCarro.dono.nome);
		/*meuCarro.dono = new Propietario();
		meuCarro.dono.nome = "Joao da Silva";
		meuCarro.dono.bairro = "Centro";*/
		
		seuCarro.ligar();
		meuCarro.ligar();
		

	}

}
 