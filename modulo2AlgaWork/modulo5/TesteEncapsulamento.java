package modulo5;

public class TesteEncapsulamento {

	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado();
		
		ar.temperatura=20;
		
		System.out.println("Temperatura do ar: " + ar.temperatura);
		
		
		ar.trocarTemperatura(18);
		
		System.out.println("Temperatura do ar: " + ar.temperatura);
		
		ar.trocarTemperatura(38);
		
		System.out.println("Temperatura do ar: " + ar.temperatura);

	}

}
