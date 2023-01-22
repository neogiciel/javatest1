package javatest1;

import javatest1.abstractclass.*;
import javatest1.interfaceclass.*;
import javatest1.heritageclass.*;
import javatest1.tabclass.*;

//------------------------------------
// Version 1.18
//------------------------------------
public class javatest1 {

	
	public static void testCalsses() {
		
		//Dessine Carre interface
		CarreInterface carre1 = new CarreInterface();
		carre1.init(12);
		carre1.dessine();
		
		//Dessine Rond interface
		RondInterface rond1 = new RondInterface();
		rond1.init(12);
		rond1.dessine();
		
		//Dessine Carre Abstract
		CarreAbstract carre2 = new CarreAbstract();
		carre2.init(12);
		carre2.dessine();
		carre2.getTaille();
	
		//Dessine Carre Abstract
		CarreAbstract carre3 = new CarreAbstract();
		carre2.init(12);
		carre2.dessine();
		carre2.getTaille();
		
		//Dessine Rond Class
		FormeClass rond2 = new RondClass();
		rond2.init(12);
		rond2.dessine();
	
	}
	
	public static void testArray() {
		TabTest tab1 = new TabTest();
		tab1.test();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=============================================");
		System.out.println("=           Programme main                  =");
		System.out.println("=============================================");
		
		testArray();
	    	    
	}

}


