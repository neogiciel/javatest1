package javatest1.log;

public class Trace {
    
	private static String color;
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK_TEXT = "\u001B[30m";
	public static final String ANSI_RED_TEXT = "\u001B[31m";
	public static final String ANSI_GREEN_TEXT = "\u001B[32m";
	public static final String ANSI_YELLOW_TEXT = "\u001B[33m";
	public static final String ANSI_BLUE_TEXT = "\u001B[34m";
	public static final String ANSI_PURPLE_TEXT = "\u001B[35m";
    public static final String ANSI_CYAN_TEXT = "\u001B[36m";
    public static final String ANSI_WHITE_TEXT = "\u001B[37m";
    
	
	public static void log(int _level,String _color, String _message){
		
		if(_color == "RED") {color = ANSI_RED_TEXT;}
		else if(_color == "GREEN") {color = ANSI_GREEN_TEXT;}
		else if(_color == "YELLOW") {color = ANSI_YELLOW_TEXT;}
		else if(_color == "BLUE") {color = ANSI_BLUE_TEXT;}
		else if(_color == "PURPLE") {color = ANSI_PURPLE_TEXT;}
		else if(_color == "CYAN") {color = ANSI_CYAN_TEXT;}
		else if(_color == "WHITE") {color = ANSI_WHITE_TEXT;}
		else {color = ANSI_BLACK_TEXT;}
		System.out.println(color + _message + ANSI_RESET);
		
	}
	
}

