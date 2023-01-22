package javatest1.abstractclass;

public class RondAbstract extends FormeAbstract {

	private int taile;
		
	public void init(int _taille) {
		System.out.println("Class Rond : inititalisation");
		System.out.println("Class Rond : taille = "+ _taille);
	}
	public void dessine() {
		System.out.println("Class Rond : dessine");
	}
	
}
