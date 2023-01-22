package javatest1.interfaceclass;

public class RondInterface implements FormeInterface {

	private int taile;
		
	public void init(int _taille) {
		System.out.println("Class Rond : inititalisation");
		System.out.println("Class Rond : taille = "+ _taille);
	}
	public void dessine() {
		System.out.println("Class Rond : dessine");
	}
	
}
