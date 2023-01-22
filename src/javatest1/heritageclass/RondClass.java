package javatest1.heritageclass;

public class RondClass extends FormeClass {

	private int taile;
	
	public void init(int _taille) {
		System.out.println("Class Rond : inititalisation");
		System.out.println("Class Rond : taille = "+ _taille);
	}
	public static void dessine() {
		System.out.println("Class Rond : dessine");
	}
	
}
