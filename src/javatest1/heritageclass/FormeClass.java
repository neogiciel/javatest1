package javatest1.heritageclass;

public class FormeClass {

	private int taile;
	
	public void init(int _taille) {
		System.out.println("Class Forme : inititalisation");
		System.out.println("Class Forme : taille = "+ _taille);
	}
	public static void dessine() {
		System.out.println("Class Forme : dessine");
	}
}

