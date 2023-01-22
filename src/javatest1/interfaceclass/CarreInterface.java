package javatest1.interfaceclass;

public class CarreInterface implements FormeInterface {

	private int taile;
		
	public void init(int _taille) {
		System.out.println("Class Carre : inititalisation");
		System.out.println("Class Carre : taille = "+ _taille);
	}
	public void dessine() {
		System.out.println("Class Carre : dessine");
	}
	
}
