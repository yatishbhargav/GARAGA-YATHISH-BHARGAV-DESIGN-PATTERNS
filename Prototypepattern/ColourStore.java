package com.epam.Prototypepattern;
import java.util.*; 
public class ColourStore {
	private static Map<String, Colour> colourMap = new HashMap<String, Colour>();  
    
    static 
    { 
        colourMap.put("blue", new BlueColour()); 
        colourMap.put("black", new BlackColour()); 
    } 
       
    public static Colour getColour(String colourName) 
    { 
        return (Colour) colourMap.get(colourName).clone(); 
    } 
}