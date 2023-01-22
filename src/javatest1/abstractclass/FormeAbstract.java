package javatest1.abstractclass;

public abstract class FormeAbstract {
	
    private static int taille;
	 
	public abstract  void init(int _taille);
	public void setTaille(int _taille) {
		 taille = _taille;
	}
	public abstract  void dessine();
	public void getTaille() {
			System.out.println("Class FormeAbstract : getTaille = "+taille);
	};

}
