package antipattern;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// pode voar
		Arara arara = new Arara();
		Papagaio papagaio = new Papagaio();
		
		// não pode voar
		Galinha galinha = new Galinha();
		Avestruz avestruz = new Avestruz();
		Pinguin pinguin = new Pinguin();
		
		// Chamando o método voar
		arara.voar("Arara");
		papagaio.voar("Papagaio");
		galinha.voar("Galinha");
		avestruz.voar("Avestruz");
		pinguin.voar("Pinguin");
	}

}
