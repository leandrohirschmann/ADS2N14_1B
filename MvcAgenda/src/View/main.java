package View;
import Controller.Agenda;


public class main {

	public static void main( String[] args) {
		
		for (int i = 0; i < 50; i++) {
				
		Agenda ag = new Agenda();
		ag.sorteiaNome();
		ag.geradorEndereco();
		ag.geraDdd();
		ag.geradorEndereco();
		}
	}

}
