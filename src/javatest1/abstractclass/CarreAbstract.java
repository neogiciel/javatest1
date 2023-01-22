package javatest1.abstractclass;

public class CarreAbstract extends FormeAbstract {

	private int taile;
		
	public void init(int taille) {
		System.out.println("Class Carre : inititalisation");
		System.out.println("Class Carre : taille = "+taille);
		super.setTaille(taille);
	}
	public void dessine() {
		System.out.println("Class Carre : dessine");
	}
	
}
