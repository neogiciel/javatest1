package javatest1.tabclass;

import javatest1.log.*;
import java.io.*;
import java.util.ArrayList;

public class TabTest {

	public void test() {
         Trace.log(0,"YELLOW","Lancement Array");
         ArrayTest();
         ArrayTestDouble();
         ArrayListTest();
    }
	//------------------
	//Array Test
	//------------------
	public void ArrayTest() {
		 
		Trace.log(0,"YELLOW","---------- Tableau Simple---------------");
	            
		 // Le tableau est typé int []
       int [] myArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
       // Quelle est la taille du tableau myArray ?
       System.out.println( "Size == " + myArray.length );
       Trace.log(0,"BLACK","Size == " + myArray.length);
       
       for(int i = 0;i<myArray.length;i++) {
           Trace.log(0,"BLACK","Display("+i+") == " + myArray[i] );
           
       }
		
		
	}
	
	//------------------
	//Array ArrayTestDouble
	//------------------
	public void ArrayTestDouble() {
		
		Trace.log(0,"RED","----------------Tableau Double------------------");
	    
		String [][] board = {
	            { "L11", "L12"},
	            { "L21", "L22"},
	        };
		
		  for ( int line=0; line<board.length; line++ ) {
	            for ( int column=0; column<board[line].length; column++ ) {
	                    System.out.print( board[line][column] + " " );
	                    Trace.log(0,"BLACK", board[line][column] + " " );
	            }
	        }
		
	}
	
	//------------------
	//Array ArrayTestDouble
	//------------------
	public void ArrayListTest() {

		Trace.log(0,"RED","----------------- ArrayList ---------------------");

        // Création de notre collection et ajouts de données        
        ArrayList<String> list = new ArrayList<>();
        list.add( "user1" );
        list.add( "user2" );

        // Combien y a t'il de données dans la collection ?
        System.out.println( "Size == " + list.size() );

        // Affichage des données de la collection
        for ( int i=0; i<list.size(); i++ ) {
        	Trace.log(0,"RED",list.get(i));
        }
	
	}
}

