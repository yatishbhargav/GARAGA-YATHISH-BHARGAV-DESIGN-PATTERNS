package com.epam.Prototypepattern;

public class BlueColour extends Colour{
	public BlueColour()  
    { 
        this.colourName = "blue"; 
    } 
   
    @Override
    void addColour()  
    { 
        System.out.println("Blue colour added"); 
    } 
}
